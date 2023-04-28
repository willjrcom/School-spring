package com.gazaltech.core.domain.employee;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Director extends Employee {
	public Director() {
		this.percentSalary = EmployeeTypeEnum.DIRECTOR;
	}
	
	@Override
	public BigDecimal calculateSalary(Salary salary) {
		return salary.calculatePromotionAvailable(getPercentSalary());
	}

	public Boolean isDirector() {
		return Boolean.TRUE;
	}
	
}
