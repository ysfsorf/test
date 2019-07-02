package com.ClientApp.models;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class UserModel {
	@Id
	@GeneratedValue
	@Column(name="id")
	   private Long id;

	@Column(name="email")
	   private String email;
	
	@Column(name="phone")
	   private String phone;
	
	@Column(name="adresse")
   private String adresse;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createdAt")
	   private Date createdAt;
	
	@Column(name="UpdateAt")
	   private Date UpdateAt;
	
	
	
	public UserModel(String adresse, String phone, String email) {
		super();
		this.adresse = adresse;
		this.phone = phone;
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateAt() {
		return UpdateAt;
	}

	public void setUpdateAt(Date updateAt) {
		UpdateAt = updateAt;
	}

	public UserModel() {
		super();
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
