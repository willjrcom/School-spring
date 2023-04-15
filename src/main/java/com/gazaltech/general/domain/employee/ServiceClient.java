package com.gazaltech.general.domain.employee;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class ServiceClient extends Employee {
	public ServiceClient() {
		this.percentSalary = PercentageSalaryEnum.SERVICE_CLIENT;
	}
	
	@Override
	public BigDecimal calculateSalary(Salary salary) {
		return salary.calculatePromotionAvailable(getPercentSalary());
	}

	public Boolean isServiceClient() {
		return Boolean.TRUE;
	}
	
}
