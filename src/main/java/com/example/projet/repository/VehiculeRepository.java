package com.example.projet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projet.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Integer> {

}
