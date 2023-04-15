package com.gazaltech.general.domain.employee;

import lombok.Getter;

@Getter
public enum PercentageSalaryEnum {
	SERVICE_CLIENT (5.0),
	TEACHER (10.0),
	DIRECTOR (15.0);

	private final double maxPercentage;
	
	PercentageSalaryEnum(double maxPercentage) {
		this.maxPercentage = maxPercentage;
	}
}
