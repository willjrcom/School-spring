package com.gazaltech.core.domain.employee;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Coordinator extends Employee {
	public Coordinator() {
		this.percentSalary = EmployeeTypeEnum.COORDINATOR;
	}

	@Override
	public BigDecimal calculateSalary(Salary salary) {
		return salary.calculatePromotionAvailable(getPercentSalary());
	}

	public Boolean isCoordinator() {
		return Boolean.TRUE;
	}
}
