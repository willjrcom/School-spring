package com.gazaltech.core.domain.employee;

import java.math.BigDecimal;

import com.gazaltech.core.domain.PersonalData;

import lombok.Getter;

@Getter
public abstract class Employee extends PersonalData {
	protected Salary salary;
	protected EmployeeTypeEnum percentSalary;
	
	public abstract BigDecimal calculateSalary(Salary salary);
	
	public Boolean isTeacher() {
		return Boolean.FALSE;
	}

	public Boolean isDirector() {
		return Boolean.FALSE;
	}

	public Boolean isServiceClient() {
		return Boolean.FALSE;
	}
	
}
