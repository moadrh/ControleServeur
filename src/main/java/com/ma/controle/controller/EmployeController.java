package com.ma.controle.controller;

import com.ma.controle.service.EmployeService;
import com.ma.controle.service.ServiceService;

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
import com.ma.controle.entity.Service;


	@RestController
	@RequestMapping("/api/employe")
	@CrossOrigin("*")
	public class EmployeController {
		 
		@Autowired
		private com.ma.controle.service.EmployeService employeService;
		
		@Autowired
		private ServiceService serviceService;
		
		List counts =new ArrayList<>();
		List names =new ArrayList<>();
		
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
		
		@GetMapping("/count")
		public List countEmployesByservice(){
			counts = new ArrayList<>();
			for(Service s : serviceService.findAll()) {
				counts.add(employeService.countEmployesByservice(s.getId()));
			}
			return counts;
		}
		@GetMapping("/names")
		public List getNames(){
			names = new ArrayList<>();
			for(Service s : serviceService.findAll()) {
				names.add(s.getNom());
			}
			return names;
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
