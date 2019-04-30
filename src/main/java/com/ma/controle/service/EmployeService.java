package com.ma.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ma.controle.dao.IDao;
import com.ma.controle.entity.Employe;
import com.ma.controle.repository.EmployeRepository;


@Service
@Primary
public class EmployeService  implements IDao<Employe> {
	
	@Autowired
	EmployeRepository employeRepo;
	
	@Autowired
	ServiceService serviceService;

	@Override
	public List<Employe> findAll() {
	
		return employeRepo.findAll();
	}

	@Override
	public Employe findById(int id) {
		return employeRepo.findById(id).get();
	}

	@Override
	public void create(Employe o) {
		employeRepo.save(o);
	}

	@Override
	public void update(Employe o) {
		employeRepo.save(o);
	}

	@Override
	public void delete(Employe o) {
		employeRepo.delete(o);
	}
	
	public List<Employe> findEmployeByService(int id){
		return employeRepo.findEmployeByService(id);
	}

}
