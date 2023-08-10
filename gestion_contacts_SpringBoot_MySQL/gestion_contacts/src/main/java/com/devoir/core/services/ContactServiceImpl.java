package com.devoir.core.services;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import com.devoir.core.bo.Contact;
import com.devoir.core.dao.IContactDao;
import org.apache.commons.text.similarity.LevenshteinDistance;



@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private IContactDao contactDao;

	
	public void addContact(Contact contact) {
		contactDao.save(contact);
	}
	
	
	public List<Contact> findAllByOrderByNom(){
		Sort sort = Sort.by(Direction.ASC, "nom");
		return contactDao.findAllByOrderByNom(sort);
	}
	
	public void deleteContact(Long id) {
		contactDao.deleteById(id);
	}

	public void updateContact(Contact contact) {
		contactDao.save(contact);
	}
	
	public List<Contact> getContactByNom(String nom){
		List<Contact> allContacts = contactDao.findAll(); 
	    List<Contact> matchingContacts = new ArrayList<>();
	    LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
	    int maxEditDistance = 4;

	    for (Contact contact : allContacts) {
	        int editDistance = levenshteinDistance.apply(nom, contact.getNom());
	        if (editDistance <= maxEditDistance) {
	            matchingContacts.add(contact);
	        }
	    }

	    return matchingContacts;
	}
	

	public List<Contact> getContactByNumeroPro(String phone){
		return contactDao.getContactByNumeroPro(phone);
	}
	
	public List<Contact> getContactByNumeroPer(String phone){
		return  contactDao.getContactByNumeroPer(phone);
	}
	
	public Contact getContactById(Long id) {
		return contactDao.findById(id).get();
		
	}



}
