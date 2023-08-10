package com.devoir.core.bo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import java.util.List;



@Entity
@Table(name = "groupes")
public class Groupe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGroup")
	private Long idGroup;

	@NotBlank(message = "Ce champ est obligatoire")
	private String nomGroup;
	
	@ManyToMany
    @JoinTable(
        name = "groupes_contacts",
        joinColumns = @JoinColumn(name = "groupe_id"),
        inverseJoinColumns = @JoinColumn(name = "contact_id")
    )
    private List<Contact> contacts;
	
	
	@NotBlank
	private String members = "Nobody";
	
	public Groupe() {
		
	}
	public Groupe(Long idGroup, String nomGroup, List<Contact> contacts) {
		this.idGroup = idGroup;
		this.nomGroup = nomGroup;
		this.contacts = contacts;
	}
	
	
	public String getNomGroup() {
		return nomGroup;
	}

	public void setNomGroup(String nomGroup) {
		this.nomGroup = nomGroup;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public Long getIdGroup() {
		return idGroup;
	}
	public void setIdGroup(Long idGroup) {
		this.idGroup = idGroup;
	}
	public String getMembers() {
		return members;
	}
	public void setMembers(String membres) {
		this.members = membres;
	}

	

	
	

}