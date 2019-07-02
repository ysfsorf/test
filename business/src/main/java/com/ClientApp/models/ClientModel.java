package com.ClientApp.models;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ClientModel extends UserModel{
	



	@Column(name="socialReason")
   private String socialReason;
	
	@Column(name="ice")
   private String ice;

	public String getRaisonSociale() {
		return socialReason;
	}

	public void setRaisonSociale(String socialReason) {
		this.socialReason = socialReason;
	}

	
	public ClientModel(String socialReason, String ice, String adresse, String phone, String email) {
		super(adresse,phone,email);
		this.ice = ice;
		this.socialReason = socialReason;
		
	}

	public ClientModel() {
		
	}

	
	
 
}
