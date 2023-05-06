package com.gazaltech.core.domain.task;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gazaltech.core.domain.student.Student;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;

@Getter
@Document(collection = "TestCollection")
public class Task {
	private ObjectId id;
	private Date startDate;
	private Date finishDate;
	private Integer totalMinutes;
	private Integer totalCorrectExercises;
	private List<Exercise> exercises;
	private List<Student> studentsToDo;

	@Min(value = 0)
	@Max(value = 10)
	private BigDecimal note;
}
