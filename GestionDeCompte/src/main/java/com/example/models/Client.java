package com.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue
	@Column(name="id")
	   private Long id;

	@Column(name="nomSociete")
   private String nomSociete;

	@Column(name="raisonSociale")
   private String raisonSociale;
	
	@Column(name="adresse")
   private String adresse;
	
	@Column(name="phone")
	   private Long phone;
	
	@Column(name="email")
	   private String email;



	public String getNomSociete() {
		return nomSociete;
	}

	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Client(String nomSociete, String raisonSociale, String adresse, Long phone, String email) {
		
		this.nomSociete = nomSociete;
		this.raisonSociale = raisonSociale;
		this.adresse = adresse;
		this.phone = phone;
		this.email = email;
	}

	public Client() {
		
	}

	
	
 
}
