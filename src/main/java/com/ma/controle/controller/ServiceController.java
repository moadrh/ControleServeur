package com.ma.controle.controller;

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

import com.ma.controle.entity.Service;
import com.ma.controle.service.ServiceService;


@RestController
@RequestMapping("/api/service")
@CrossOrigin()
public class ServiceController {
	
	@Autowired
	private ServiceService serviceService;
	
	@GetMapping
	public List<Service> getServices(){
		return serviceService.findAll();
	}
	
	@PostMapping 
	public void addService(@RequestBody Service service) {
		serviceService.create(service);
	}
	
	@GetMapping("/{id}")
	public Service getServiceById(@PathVariable int id){
		return serviceService.findById(id);
	}
	
	@PutMapping
	public void updateService(@RequestBody Service service) {
		serviceService.update(service);
	}
	
	@DeleteMapping("/{id}")
	public void deleteService(@PathVariable int id) {
		Service ser =serviceService.findById(id);
		serviceService.delete(ser);
	}
}
