package com.example.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projet.entities.Client;


public interface ClientRepository extends JpaRepository <Client, Integer> {
		

}
