package com.gazaltech.general.domain.employee;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Director extends Employee {
	private PercentageSalaryEnum percentSalary;

	public Director() {
		this.percentSalary = PercentageSalaryEnum.DIRECTOR;
	}
	
	@Override
	public BigDecimal calculateSalary(Salary salary) {
		return salary.calculatePromotionAvailable(getPercentSalary());
	}
}
