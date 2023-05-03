package com.gazaltech.core.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gazaltech.core.domain.employee.Director;
import com.gazaltech.core.domain.employee.Employee;

public class EmployeeTest {
	@Test
	void DirectorTest() {

		Director coor = (Director) new Employee.EmployeeBuilder<Director>(Director.class)
				.withName("will").build();
        assertEquals("will", coor.getName());
	}
}
