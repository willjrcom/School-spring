package com.gazaltech.core.domain.employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Salary {
	private BigDecimal currentSalary;
	private BigDecimal availableSalary;
	private List<BigDecimal> allSalaries;
	private LocalDate lastChange;
	private Boolean isPromotionAvailaible;
	
	public Salary() {
		this.currentSalary = BigDecimal.ZERO;
		this.availableSalary = BigDecimal.ZERO;
		this.isPromotionAvailaible = Boolean.FALSE;
		this.lastChange = LocalDate.now();
		this.allSalaries = new ArrayList<BigDecimal>();
	}
	
	public void setFirstSalary(BigDecimal salary) {
		// is not First salary
		if (!getCurrentSalary().equals(BigDecimal.ZERO) || this.allSalaries.size() > 0) {
			return;
		}
		
		this.currentSalary = salary;
		this.availableSalary = BigDecimal.ZERO;
		this.allSalaries.add(this.currentSalary);
		this.lastChange = LocalDate.now();
		this.isPromotionAvailaible = Boolean.FALSE;
	}
	
	public Boolean requestPromotion(BigDecimal percentage) {
	    LocalDate now = LocalDate.now();

	    // Calculate difference dates
	    long diffMonths = ChronoUnit.MONTHS.between(now, getLastChange());

    	this.isPromotionAvailaible = Boolean.FALSE;
    	
	    // Validate difference
	    if (diffMonths > 5) {
	    	this.isPromotionAvailaible = Boolean.TRUE;
	    }
	    
	    return getIsPromotionAvailaible();
	}
	
	public BigDecimal calculatePromotionAvailable(EmployeeTypeEnum percentSalaryEmployee) {
		if (!getIsPromotionAvailaible()) {
			return BigDecimal.ZERO;
		}
		BigDecimal maxPercentage = new BigDecimal(percentSalaryEmployee.getMaxPercentageSalary());
		this.availableSalary = getCurrentSalary().multiply(maxPercentage).divide(new BigDecimal("100")); 
		return getAvailableSalary();
	}

	@SuppressWarnings("unused")
	private void approvePromotionAvailable() {
		if (!getIsPromotionAvailaible() && getAvailableSalary().equals(BigDecimal.ZERO)) {
			return;
		}
		
		this.currentSalary = getAvailableSalary();
		this.availableSalary = BigDecimal.ZERO;
		this.allSalaries.add(getCurrentSalary());
	}
}
