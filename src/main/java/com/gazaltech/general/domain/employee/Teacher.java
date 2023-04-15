package com.gazaltech.general.domain.employee;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Teacher extends Employee {
	private PercentageSalaryEnum percentSalary;

	public Teacher() {
		this.percentSalary = PercentageSalaryEnum.TEACHER;
	}
	
	@Override
	public BigDecimal calculateSalary(Salary salary) {
		return salary.calculatePromotionAvailable(getPercentSalary());
	}
}
