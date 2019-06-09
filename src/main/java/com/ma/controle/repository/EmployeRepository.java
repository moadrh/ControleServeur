package com.ma.controle.repository;

import java.util.List;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ma.controle.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {
	
	@Query("SELECT e FROM Employe e WHERE e.service.id = ?1 ")
	List<Employe> findEmployeByService(Integer id);
	
	@Query("SELECT count(e) FROM Employe e WHERE e.service.id = ?1 ")
	Long countEmployesByservice(Integer id);

}
