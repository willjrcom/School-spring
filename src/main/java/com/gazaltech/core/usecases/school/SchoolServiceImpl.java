package com.gazaltech.core.usecases.school;

import java.util.List;
import java.util.stream.Collectors;

import com.gazaltech.core.domain.classroom.ClassRoom;
import com.gazaltech.core.domain.employee.Employee;
import com.gazaltech.core.domain.employee.EmployeeTypeEnum;
import com.gazaltech.core.domain.school.School;

@SuppressWarnings("unused")
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

	private Boolean addEmployee(School school, Employee employee) {
		if (school.getEmployees().size() > 40) {
			return Boolean.FALSE;
		}
		
		return school.getEmployees().add(employee);
	}

	private Boolean removeEmployee(School school, Employee employee) {
		return school.getEmployees().remove(employee);
	}

	private Boolean addRoomClass(School school, ClassRoom roomClass) {
		if (school.getEmployees().size() > 40) {
			return Boolean.FALSE;
		}
		
		return school.getClassRooms().add(roomClass);
	}

	private Boolean removeRoomClass(School school, ClassRoom roomClass) {
		return school.getClassRooms().remove(roomClass);
	}
}
