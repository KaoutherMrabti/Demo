package com.example.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projet.entities.User;



public interface UserRepository extends JpaRepository <User, Integer> {
	

	}
