package com.ma.controle.controller;

import com.ma.controle.service.EmployeService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ma.controle.entity.Employe;


	@RestController
	@RequestMapping("/api/employe")
	@CrossOrigin("*")
	public class EmployeController {
		 
		@Autowired
		private com.ma.controle.service.EmployeService employeService;
		
		@GetMapping
		public List<Employe> getEmployes(){
			return employeService.findAll();
		}
		
		@PostMapping 
		public void addEmploye(@RequestBody Employe employe) {
			employeService.create(employe);
		}
		
		@GetMapping("/{id}")
		public Employe getEmployeById(@PathVariable int id){
			return employeService.findById(id);
		}
		
//		@GetMapping("/find/{id}")
//		public List<Employe> getEmployeByService(@PathVariable int id){
//			List<Employe> employes = new ArrayList<Employe>();
//			
//			for (Employe e:employeService.findAll()) {
//				if(e.getService().getId() == id) {
//					employes.add(e);
//				}
//			}
//			
//			return employes;
//		}
		
		@GetMapping("/find/{id}")
		public List<Employe> getEmployeByService(@PathVariable int id){
			return employeService.findEmployeByService(id);
		}
		
		
		@PutMapping
		public void updateEmploye(@RequestBody Employe employe) {
			employeService.update(employe);
		}
		
		@DeleteMapping("/{id}")
		public void deleteEmploye(@PathVariable int id) {
			Employe emp =employeService.findById(id);
			employeService.delete(emp);
		}

}
