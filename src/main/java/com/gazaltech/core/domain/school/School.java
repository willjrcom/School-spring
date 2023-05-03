package com.gazaltech.core.domain.school;

import java.util.List;

import com.gazaltech.core.domain.address.Address;
import com.gazaltech.core.domain.classroom.ClassRoom;
import com.gazaltech.core.domain.employee.Employee;

import lombok.Getter;

@Getter
public class School {
	private String name;
	private Address address;
	private List<Employee> employees;
	private List<ClassRoom> classRooms;

	public static class SchoolBuilder {
		private School school;
		
		public SchoolBuilder() {
			this.school = new School();
		}
		
		public SchoolBuilder withName(String name) {
			this.school.name = name;
			return this;
		}

		public SchoolBuilder withAdress(Address address) {
			this.school.address = address;
			return this;
		}

		public SchoolBuilder withEmployee(Employee employee) {
			this.school.employees.add(employee);
			return this;
		}

		public SchoolBuilder withAllEmployees(List<Employee> employees) {
			this.school.employees = employees;
			return this;
		}

		public SchoolBuilder withClassRoom(ClassRoom classRoom) {
			this.school.classRooms.add(classRoom);
			return this;
		}

		public SchoolBuilder withAllClassRooms(List<ClassRoom> classRooms) {
			this.school.classRooms = classRooms;
			return this;
		}
		
		public School build() {
			return this.school;
		}
	}
}
