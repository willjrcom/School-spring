package com.gazaltech.core.domain.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;

@Getter
@Document(collection = "TestCollection")
public class Test {
	private ObjectId id;
	private Date startDate;
	private Date finishDate;
	private Integer totalMinutes;
	private Integer totalCorrectExercises;
	private List<Exercise> exercises;

	@Min(value = 0)
	@Max(value = 10)
	private BigDecimal note;
}
