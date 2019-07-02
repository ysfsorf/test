package com.ClientApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.ClientApp.models.ClientModel;
import com.ClientApp.repositories.ClientRepo;
import com.ClientApp.services.ClientService;
@SpringBootApplication
public class businessMain {

	
	
		public static void main(String[] args) {
			
			SpringApplication.run(businessMain.class, args);
		}
		@Bean
		public CommandLineRunner demo(ClientRepo repository) {
			return (args) -> {
				
				repository.save(new ClientModel("entr1","code","casablanca","4555","mail"));
			

};
		}
}
