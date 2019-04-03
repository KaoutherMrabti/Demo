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
import com.example.projet.entities.TypeClient;
import com.example.projet.repository.TypeClientRepository;
@RestController
public class TypeClientService {
	@Autowired
	private TypeClientRepository typeRep;
	
	@GetMapping(value="/typeClients")
	public List<TypeClient> getTypeClient(){
		return typeRep.findAll();
	}

	@GetMapping(value = "/typeById/{id_type}")
	public Optional<TypeClient> getTypeClient(@PathVariable int id_type) {
		return typeRep.findById(id_type);
}
	@PostMapping(value = "/addType")
	public TypeClient save(@RequestBody TypeClient c) {
		return typeRep.save(c);
	}
	@DeleteMapping(value = "/deleteTpe/{id_type}")
     public boolean supprimer(@PathVariable int id_type) {
	typeRep.deleteById(id_type);
		return true;
	}
	@PutMapping(value = "/editType/{id_type}")
	public TypeClient edit(@RequestBody TypeClient c) {
		return typeRep.save(c);
	}
}
