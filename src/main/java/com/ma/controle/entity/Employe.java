package com.ma.controle.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Employe extends Personne{
	
	private static final long serialVersionUID = 1L;
	
	private String email;
	private String telephone;
	@ManyToOne
	private Service service;
	
	public Employe(int id, String nom, String prenom, String email, String telephone) {
		super(id, nom, prenom);
		this.email = email;
		this.telephone = telephone;
		
	}
	public Employe() {
		super();
	}
	
	
	
	public Employe(int id, String nom, String prenom, String email, String telephone, Service service) {
		super(id, nom, prenom);
		this.email = email;
		this.telephone = telephone;
		this.service = service;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	

}
