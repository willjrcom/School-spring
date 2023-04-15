package com.gazaltech.general.domain.school;

import java.util.List;

import com.gazaltech.general.domain.address.Address;
import com.gazaltech.general.domain.employee.Employee;
import com.gazaltech.general.domain.room.RoomClass;

import lombok.Getter;

@Getter
public class School {
	private String name;
	private Address address;
	private List<Employee> employees;
	private List<RoomClass> roomClasses;

	public School(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	private void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	private void removeEmployee(Employee employee) {
		this.employees.add(employee);
	}

	private void addRoomClass(RoomClass roomClass) {
		this.roomClasses.add(roomClass);
	}

	private void removeRoomClass(RoomClass roomClass) {
		this.roomClasses.add(roomClass);
	}
}
