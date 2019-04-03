package com.example.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projet.entities.TypeClient;

public interface TypeClientRepository extends JpaRepository <TypeClient, Integer> {
	

}
