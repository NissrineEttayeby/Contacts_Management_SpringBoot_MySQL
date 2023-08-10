package com.devoir.core.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.devoir.core.bo.Groupe;

public interface IGroupeDao extends JpaRepository<Groupe, Long> {

	@Query("FROM Groupe WHERE nomGroup = ?1")
	public List<Groupe> getGroupByNom(String nom);

	
	

}
