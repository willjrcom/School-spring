package com.gazaltech.general.domain.employee;

import java.math.BigDecimal;

import com.gazaltech.general.domain.PersonalData;

import lombok.Getter;

@Getter
public abstract class Employee extends PersonalData{
	private Salary salary;
	
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
