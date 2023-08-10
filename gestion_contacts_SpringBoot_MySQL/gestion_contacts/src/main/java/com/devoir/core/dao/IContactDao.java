package com.devoir.core.dao;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.devoir.core.bo.Contact;



public interface IContactDao extends JpaRepository<Contact, Long>  {

	
	public List<Contact> getContactByNom(String nom);
	
	
	@Query("FROM Contact")
    public List<Contact> findAllByOrderByNom(Sort sort);
	
	@Query("FROM Contact WHERE numero_pro = ?1")
	public List<Contact> getContactByNumeroPro(String phone);
	
	@Query("FROM Contact WHERE numero_per = ?1")
	public List<Contact> getContactByNumeroPer(String phone);
	

}
