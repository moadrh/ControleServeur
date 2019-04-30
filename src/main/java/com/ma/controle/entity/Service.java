package com.ma.controle.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Service {
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	@Transient
	@OneToMany(mappedBy="service")
	private List<Employe> employes;
	public Service(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Service() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	
	
}
