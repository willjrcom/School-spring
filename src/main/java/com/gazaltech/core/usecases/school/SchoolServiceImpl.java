package com.gazaltech.core.usecases.school;

import java.util.List;
import java.util.stream.Collectors;

import com.gazaltech.core.domain.classroom.Classroom;
import com.gazaltech.core.domain.employee.Employee;
import com.gazaltech.core.domain.employee.EmployeeTypeEnum;
import com.gazaltech.core.domain.school.School;

public class SchoolServiceImpl implements SchoolService {
	@Override
	public void generateReportCard() {
		// TODO Auto-generated method stub
		
	}
	
	public List<Employee> filterEmployees(School school, EmployeeTypeEnum typeEmployee) {
		return school.getEmployees().stream()
		.filter(employee -> employee.getPercentSalary().equals(typeEmployee))
		.collect(Collectors.toList());
	}

	public Boolean addEmployee(School school, Employee employee) {
		if (school.getEmployees().size() > 40) {
			return Boolean.FALSE;
		}
		
		return school.getEmployees().add(employee);
	}

	public Boolean removeEmployee(School school, Employee employee) {
		return school.getEmployees().remove(employee);
	}

	public Boolean addRoomClass(School school, Classroom roomClass) {
		if (school.getEmployees().size() > 40) {
			return Boolean.FALSE;
		}
		
		return school.getClassRooms().add(roomClass);
	}

	public Boolean removeRoomClass(School school, Classroom roomClass) {
		return school.getClassRooms().remove(roomClass);
	}
}
