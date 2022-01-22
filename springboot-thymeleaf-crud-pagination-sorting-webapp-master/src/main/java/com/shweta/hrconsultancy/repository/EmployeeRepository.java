package com.shweta.hrconsultancy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shweta.hrconsultancy.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	//@Query("Select CASE when count(s) >0 then TRUE else FALSE end from employees u u.firstName = :firstName or u.lastName = :lastName");
	//Boolean isEmployeeExistById(Integer Id);
	
	@Query("select u from Employee u where u.firstName = :firstName or u.lastName = :lastName")
	Employee findByLastnameOrFirstname(@Param("lastName") String lastName, @Param("firstName") String firstName);
	
}
