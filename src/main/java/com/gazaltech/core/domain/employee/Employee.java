package com.gazaltech.core.domain.employee;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import org.bson.BsonDateTime;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gazaltech.core.domain.PersonalData;
import com.gazaltech.shared.domain.Cpf;

import lombok.Getter;

@Getter
@Document(collection = "EmployeeCollection")
public abstract class Employee extends PersonalData {
	protected Salary salary;
	protected EmployeeTypeEnum percentSalary;
	
	public abstract BigDecimal calculateSalary(Salary salary);

	public Boolean isDirector() {
		return Boolean.FALSE;
	}

	public Boolean isCoordinator() {
		return Boolean.FALSE;
	}
	
	public Boolean isTeacher() {
		return Boolean.FALSE;
	}

	public Boolean isServiceClient() {
		return Boolean.FALSE;
	}

	public static class EmployeeBuilder<T extends Employee> {
		private T employee;
		
		public EmployeeBuilder(Class<T> classInstance)  {
	        this.employee = getInstanceByClass(classInstance);
		    this.employee.percentSalary = EmployeeTypeEnum.getEmployeeByClass(this.employee.getClass());
		}
		
		public EmployeeBuilder<T> withName(String name) {
			this.employee.name = name;
			return this;
		}

		public EmployeeBuilder<T> withCpf(String cpf) {
			this.employee.cpf = new Cpf(cpf);
			return this;
		}

		public EmployeeBuilder<T> withCpf(Cpf cpf) {
			this.employee.cpf = cpf;
			return this;
		}

		public EmployeeBuilder<T> withEmail(String email) {
			this.employee.email = email;
			return this;
		}

		public EmployeeBuilder<T> withDateBirth(BsonDateTime dateBirth) {
			this.employee.dateBirth = dateBirth;
			return this;
		}

		public EmployeeBuilder<T> withSalary(Salary salary) {
			this.employee.salary = salary;
			return this;
		}
		
		public T build() {
			return this.employee;
		}

		private T getInstanceByClass(Class<T> classInstance) {
			try {
				return classInstance.getDeclaredConstructor().newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				throw new IllegalArgumentException("Parametro EmployeeBuilder<>() invalido");
			}
		}
	}
}
