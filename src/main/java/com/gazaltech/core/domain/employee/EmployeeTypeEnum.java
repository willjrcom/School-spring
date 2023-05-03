package com.gazaltech.core.domain.employee;

import java.util.Arrays;

import lombok.Getter;

@Getter
public enum EmployeeTypeEnum {
	SERVICE_CLIENT (5.0, ServiceClient.class),
	TEACHER (10.0, Teacher.class),
	COORDINATOR (12.0, Coordinator.class),
	DIRECTOR (15.0, Director.class);

	private final Double maxPercentageSalary;
	private final Class<?> classInstance;
	
	EmployeeTypeEnum(Double maxPercentageSalary, Class<?> classInstance) {
		this.maxPercentageSalary = maxPercentageSalary;
		this.classInstance = classInstance;
	}
	
	public static EmployeeTypeEnum getEmployeeByClass(Class<?> classInstance) {
		return Arrays.asList(EmployeeTypeEnum.values())
			.stream()
			.filter(valueClass -> valueClass.getClassInstance().equals(classInstance))
			.findFirst().orElseThrow();
    }
}
