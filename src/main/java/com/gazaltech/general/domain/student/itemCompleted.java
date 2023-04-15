package com.gazaltech.general.domain.student;

import java.math.BigDecimal;

import org.bson.BsonDateTime;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class itemCompleted {
	private String name;
	
	@Min(value = 0)
	@Max(value = 10)
	private BigDecimal note;
	
	private BsonDateTime dateFinish;
}
