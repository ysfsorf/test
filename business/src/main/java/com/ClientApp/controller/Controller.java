package com.ClientApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ClientApp.models.*;
import com.ClientApp.services.ClientService;
  



@CrossOrigin(origins = "*")
@RequestMapping(value = "/clients")
@RestController
public class Controller {
	
	

@Autowired
private ClientService service;
	
	@GetMapping(value= {"/",""})
	public List<ClientModel> getAllCategorie() {
		return service.getAll();

	}
	@GetMapping(value= {"/{nom}"})
	public ClientModel getClient(@PathVariable String nom ) {
		
		return service.get(nom);
	}
	@PostMapping(value = { "/",""})
	public void addClient(@RequestBody ClientModel client){
		 service.add(client);
	}
	@DeleteMapping("/{nom}")
      public void deleteCategorie(@PathVariable String nom) {
		 service.delete(nom);
		
	}
	
	

}
