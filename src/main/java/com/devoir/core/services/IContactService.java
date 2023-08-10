package com.devoir.core.services;


import com.devoir.core.bo.Contact;
import java.util.*;



public interface IContactService {

	public void addContact(Contact contact);

	void updateContact(Contact contact);
	
	List<Contact> findAllByOrderByNom();
		
	void deleteContact(Long id);
	
	List<Contact> getContactByNom(String nom);
	
	public List<Contact> getContactByNumeroPro(String phone);
	
	public List<Contact> getContactByNumeroPer(String phone);
	
	public Contact getContactById(Long id);
	


}
