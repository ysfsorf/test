package com.example.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.example.models.Client;




public interface ClientRepo extends JpaRepository<Client, Long>  {

	public Client findByNomSociete(String nom);
	 @Modifying
	   @Transactional
	public void deleteByNomSociete(String nom);
	
	
}
