package com.devoir.core.bo;
import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "contacts")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContact;
	
	@NotBlank(message = "Ce champ est obligatoire")
	private String nom;

	@NotBlank(message = "Ce champ est obligatoire")
	private String prenom;
	
	@NotBlank(message = "Ce champ est obligatoire")
	@Pattern(regexp = "^(06|07|05)\\d{8}$", message = "Le numéro de telephone doit contenir huit nombres après le 06 ou 07 ou 05")
	private String  numeroPro;
	
	@NotBlank(message = "Ce champ est obligatoire")
	@Pattern(regexp = "^(06|07|05)\\d{8}$", message = "Le numéro de telephone doit contenir huit nombres après le 06 ou 07 ou 05")
	private String  numeroPer;
	
	@NotBlank(message = "Ce champ est obligatoire")
	private String adresse;
	
	@Email(message = "Entrez un email valide")
	@NotBlank(message = "Ce champ est obligatoire")
	private String email_personnel;
	
	@Email(message = "Entrez un email valide")
	@NotBlank(message = "Ce champ est obligatoire")
	private String email_professionnel;
	
	@NotBlank(message = "Ce champ est obligatoire")
	private String genre;
	
	//Liste des groupes
	@ManyToMany(mappedBy = "contacts", cascade = CascadeType.ALL)
    private List<Groupe> groupes;
	
	public Contact() {
		
	}


	public Contact(Long idContact,String nom, String prenom, String telephone1,String telephone2, String adresse, String email_personnel, String email_professionnel, String genre, List<Groupe> groupes) {

		this.idContact = idContact;
		this.nom = nom;
		this.prenom = prenom;
		this.numeroPro = telephone1;
		this.numeroPer = telephone2;
		this.adresse = adresse;
		this.email_personnel = email_personnel;
		this.email_professionnel = email_professionnel;
		this.genre = genre;
		this.groupes = groupes;
	}





	public Long getId() {
		return idContact;
	}

	public void setId(Long id) {
		this.idContact = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroPro() {
		return numeroPro;
	}

	public void setNumeroPro(String numeroPro) {
		this.numeroPro = numeroPro;
	}

	public void setNumeroPer(String numeroPer) {
		this.numeroPer = numeroPer;
	}

	public String getNumeroPer() {
		return numeroPer;
	}


	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail_personnel() {
		return email_personnel;
	}

	public void setEmail_personnel(String email_personnel) {
		this.email_personnel = email_personnel;
	}

	public String getEmail_professionnel() {
		return email_professionnel;
	}

	public void setEmail_professionnel(String email_professionnel) {
		this.email_professionnel = email_professionnel;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


	public List<Groupe> getGroupes() {
		return groupes;
	}


	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}
	
	
	
	
	
	
	
	
}