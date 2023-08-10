package com.devoir.core.services;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devoir.core.bo.Groupe;

import com.devoir.core.dao.IGroupeDao;

@Service
public class GroupeServiceImpl implements IGroupeService {
	
	
	
	@Autowired
    private IGroupeDao groupeDao;
    
	@PersistenceContext
    private EntityManager entityManager;

    public void createGroupe(Groupe groupe) {
    	groupeDao.save(groupe);
    }
    
    public void deleteGroupe(String nomGroup) {
    	List<Groupe> grp = getGroupByNom(nomGroup);
    	if(grp!=null) {
    		groupeDao.delete((Groupe) getGroupByNom(nomGroup));
    	}    	
    	
    }

    
    public List<Groupe> getGroupByNom(String nom){
    	return groupeDao.getGroupByNom(nom);
    }
    
    public Groupe getGroupeById(Long id) {
    	return groupeDao.findById(id).get();
    }
    
    public List<Groupe> getAllGrp(){
    	List<Groupe> groupes = groupeDao.findAll();
    	return groupes;
    }


	public void deleteGroupe(Long id) {
		Groupe groupe = groupeDao.findById(id).get();
		groupeDao.delete(groupe);
	}
	
	
	public Groupe updateGrp(Groupe groupe) {
		return groupeDao.save(groupe);
	}


}
