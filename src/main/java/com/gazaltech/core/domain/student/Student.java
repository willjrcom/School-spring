package com.gazaltech.core.domain.student;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import com.gazaltech.core.domain.PersonalData;

import jakarta.validation.constraints.Min;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Document(collection = "schoolCollect")
@Validated
public class Student extends PersonalData {
	@Min(value = 4)
	private String ra;

	public Student(String ra) {
		super();
		this.ra = ra;
	}
}
