package com.gazaltech.core.domain.employee;

import lombok.Getter;

@Getter
public enum EmployeeTypeEnum {
	SERVICE_CLIENT (5.0),
	TEACHER (10.0),
	DIRECTOR (15.0);

	private final double maxPercentageSalary;
	
	EmployeeTypeEnum(double maxPercentageSalary) {
		this.maxPercentageSalary = maxPercentageSalary;
	}
}
