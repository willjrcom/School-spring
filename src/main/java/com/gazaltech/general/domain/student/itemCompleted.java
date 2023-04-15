package com.gazaltech.general.domain.student;

import java.math.BigDecimal;

import org.bson.BsonDateTime;

import jakarta.validation.constraints.Max;
import lombok.Data;

@Data
public class itemCompleted {
	private String name;
	
	@Max(value = 10)
	private BigDecimal note;
	
	private BsonDateTime dateFinish;
}
