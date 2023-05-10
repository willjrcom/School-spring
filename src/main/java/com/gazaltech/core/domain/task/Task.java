package com.gazaltech.core.domain.task;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;

@Getter
@Document(collection = "TestCollection")
public class Task {
	@Id
	private ObjectId id;
	private String name;
	private Date startDate;
	private Date finishDate;
	private Integer totalMinutes;
	private Integer totalCorrectExercises;
	private List<Exercise> exercises;
	private StatusTask statusTask;

	@Min(value = 0)
	@Max(value = 10)
	private BigDecimal note;
	
	public void setStatusTaskOpen() {
		if (!this.statusTask.equals(StatusTask.READY)) {
			return;
		}
		this.statusTask = StatusTask.OPEN;
	}

	public void setStatusTaskClosed() {
		if (!this.statusTask.equals(StatusTask.OPEN)) {
			return;
		}
		this.statusTask = StatusTask.CLOSED;
	}
}
