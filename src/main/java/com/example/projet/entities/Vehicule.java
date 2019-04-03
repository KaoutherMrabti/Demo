package com.example.projet.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Vehicule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_immatriculation ;
	private String matriculation;
	private String marque;
	private String model;
	
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client ;
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicule(int id_immatriculation, String matriculation, String marque, String model) {
		super();
		this.id_immatriculation = id_immatriculation;
		this.matriculation = matriculation;
		this.marque = marque;
		this.model = model;
	}
	public int getId_immatriculation() {
		return id_immatriculation;
	}
	public void setId_immatriculation(int id_immatriculation) {
		this.id_immatriculation = id_immatriculation;
	}
	public String getMatriculation() {
		return matriculation;
	}
	public void setMatriculation(String matriculation) {
		this.matriculation = matriculation;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
