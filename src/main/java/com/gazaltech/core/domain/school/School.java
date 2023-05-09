package com.gazaltech.core.domain.school;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import com.gazaltech.core.domain.address.Address;
import com.gazaltech.core.domain.classroom.Classroom;
import com.gazaltech.core.domain.employee.Employee;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class School {
	@Id
	private ObjectId id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private Address address;
	private List<Employee> employees;
	private List<Classroom> classRooms;

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

		public SchoolBuilder withClassRoom(Classroom classRoom) {
			this.school.classRooms.add(classRoom);
			return this;
		}

		public SchoolBuilder withAllClassRooms(List<Classroom> classRooms) {
			this.school.classRooms = classRooms;
			return this;
		}
		
		public School build() {
			return this.school;
		}
	}
}
