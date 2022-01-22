package com.shweta.hrconsultancy.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shweta.hrconsultancy.model.Employee;

@SpringBootTest
class EmployeeRepositoryTest2 {
	
	@Autowired
	private EmployeeRepository empRepo;


	@Test
	void testFindByLastnameOrFirstname() {
		Employee emp = new Employee();
		emp.setId(7);
		emp.setFirstName("Lamb");
		emp.setLastName("Pitroda");
		emp.setEmail("samp@usa.net");
		empRepo.save(emp);
		//fail("Not yet implemented");
		Employee actualResult = empRepo.findByLastnameOrFirstname("Pitroda","Lamb");
		assertThat(emp.getFirstName()).isEqualTo(actualResult.getFirstName());
		//assertThat(actualResult).isNotEqualTo(emp);
	}

}
