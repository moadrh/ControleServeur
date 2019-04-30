package com.ma.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import com.ma.controle.dao.IDao;
import com.ma.controle.entity.Service;
import com.ma.controle.repository.ServiceRepository;


@org.springframework.stereotype.Service
@Primary
public class ServiceService  implements IDao<Service> {
	
	@Autowired
	private ServiceRepository serviceRepo ;

	@Override
	public List<Service> findAll() {
		return  serviceRepo.findAll();
	}

	@Override
	public Service findById(int id) {
		// TODO Auto-generated method stub
		return serviceRepo.findById(id).get();
	}

	@Override
	public void create(Service o) {
		// TODO Auto-generated method stub
		serviceRepo.save(o);
	}

	@Override
	public void update(Service o) {
		// TODO Auto-generated method stub
		serviceRepo.save(o);
	}

	@Override
	public void delete(Service o) {
         serviceRepo.delete(o);		
	}
	

}
