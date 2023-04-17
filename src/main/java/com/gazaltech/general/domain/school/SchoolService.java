package com.gazaltech.general.domain.school;

import java.util.List;
import java.util.stream.Collectors;

import com.gazaltech.general.domain.employee.Employee;
import com.gazaltech.general.domain.employee.EmployeeTypeEnum;
import com.gazaltech.general.domain.room.RoomClass;

@SuppressWarnings("unused")
public class SchoolService {
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

	private Boolean addRoomClass(School school, RoomClass roomClass) {
		if (school.getEmployees().size() > 40) {
			return Boolean.FALSE;
		}
		
		return school.getRoomClasses().add(roomClass);
	}

	private Boolean removeRoomClass(School school, RoomClass roomClass) {
		return school.getRoomClasses().remove(roomClass);
	}
}
