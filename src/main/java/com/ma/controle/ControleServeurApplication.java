package com.ma.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ma.controle.entity.Employe;
import com.ma.controle.entity.Service;
import com.ma.controle.repository.EmployeRepository;
import com.ma.controle.repository.ServiceRepository;

@SpringBootApplication
public class ControleServeurApplication implements CommandLineRunner {
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	@Autowired
	private EmployeRepository employeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ControleServeurApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		serviceRepository.save(new Service(1, "info"));
//		serviceRepository.save(new Service(3, "Compta"));
		
//		employeRepository.save(new Employe(1, "rehhali", "moad", "gmail.com", "06214578", serviceRepository.findById(1).get()));
//		employeRepository.save(new Employe(1, "moustaoui", "salah", "gmail.com", "06214578", serviceRepository.findById(2).get()));
//		employeRepository.save(new Employe(1, "alami", "amine", "gmail.com", "06214578", serviceRepository.findById(1).get()));
		
		System.out.println(employeRepository.countEmployesByservice(2));
	}

}
