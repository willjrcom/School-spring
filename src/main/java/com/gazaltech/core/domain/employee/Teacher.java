package com.gazaltech.core.domain.employee;

import java.math.BigDecimal;
import java.util.List;

import com.gazaltech.core.domain.classroom.Classroom;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Teacher extends Employee {
	private List<Classroom> roomClass;
	
	public Teacher() {
		this.percentSalary = EmployeeTypeEnum.TEACHER;
	}
	
	@Override
	public BigDecimal calculateSalary(Salary salary) {
		return salary.calculatePromotionAvailable(getPercentSalary());
	}

	public Boolean isTeacher() {
		return Boolean.TRUE;
	}
}
