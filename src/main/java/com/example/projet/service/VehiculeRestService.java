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


import com.example.projet.entities.Vehicule;
import com.example.projet.repository.VehiculeRepository;

@RestController
public class VehiculeRestService {
	@Autowired
	private VehiculeRepository vehRep;
	
	@GetMapping(value="/vehicules")
	public List<Vehicule> getClient(){
		return vehRep.findAll();
	}
	@GetMapping(value = "/vehiById/{id_immatriculation}")
	public Optional<Vehicule> getVehicule(@PathVariable int id_immatriculation) {
		return vehRep.findById(id_immatriculation);
	}
	@PostMapping(value = "/addVehi")
	public Vehicule save(@RequestBody Vehicule c) {
		return vehRep.save(c);
	}
	
	@DeleteMapping(value = "/deleteVehi/{id_clien}")
	public boolean supprimer(@PathVariable int id_immatriculation) {
	vehRep.deleteById(id_immatriculation);
		return true;
	}
	@PutMapping(value = "/editVehi")
	public Vehicule edit(@RequestBody Vehicule c) {
		return vehRep.save(c);
	}
}



