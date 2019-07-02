package com.ClientApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ClientApp.models.*;
import com.ClientApp.repositories.*;



@Service
public class ClientService {
	
	@Autowired
	private ClientRepo clientRepo;
	
	
	public List<ClientModel> getAll() {
		return clientRepo.findAll();
	}
	public ClientModel get(String nom) {
		return clientRepo.findBySocialReason(nom);

	}

	public void add(ClientModel client) {
		clientRepo.save(client);
	}

	public void delete(String nom) {
		clientRepo.deleteBySocialReason(nom);
	}

}
