package com.gazaltech.core.domain.school;

import java.util.List;

import com.gazaltech.core.domain.address.Address;
import com.gazaltech.core.domain.employee.Employee;
import com.gazaltech.core.domain.room.RoomClass;

import lombok.Getter;

@SuppressWarnings("unused")
@Getter
public class School {
	private String name;
	private Address address;
	private List<Employee> employees;
	private List<RoomClass> roomClasses;

	public School(String name, Address address) {
		this.name = name;
		this.address = address;
	}
}
