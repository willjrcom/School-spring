package com.gazaltech.general.domain.employee;

import java.math.BigDecimal;
import java.util.List;

import com.gazaltech.general.domain.room.RoomClass;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class Teacher extends Employee {
	private List<RoomClass> roomClass;
	
	public Teacher() {
		this.percentSalary = PercentageSalaryEnum.TEACHER;
	}
	
	@Override
	public BigDecimal calculateSalary(Salary salary) {
		return salary.calculatePromotionAvailable(getPercentSalary());
	}

	public Boolean isTeacher() {
		return Boolean.TRUE;
	}
}
