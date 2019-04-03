package com.example.projet.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.projet.entities.Client;
import com.example.projet.repository.ClientRepository;



@RestController
public class ClientRestService {
	@Autowired
	private ClientRepository clientRep;
	
	@GetMapping(value="/clients")
	public List<Client> getClient(){
		return clientRep.findAll();
	}
	@GetMapping(value = "/clientById/{id_client}")
	public Optional<Client> getClient(@PathVariable int id_client) {
		return clientRep.findById(id_client);
	}
	@PostMapping(value = "/addClient")
	public Client save(@RequestBody Client c) {
		return clientRep.save(c);
	}
	
	@DeleteMapping(value = "/deleteClient/{id_client}")
	public boolean supprimer(@PathVariable int id_client) {
	clientRep.deleteById(id_client);
		return true;
	}
	@PutMapping(value = "/editClient")
	public Client edit(@RequestBody Client c) {
		return clientRep.save(c);
	}
}
