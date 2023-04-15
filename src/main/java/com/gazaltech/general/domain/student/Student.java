package com.gazaltech.general.domain.student;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.gazaltech.general.domain.PersonalData;
import com.gazaltech.shared.domain.Cpf;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Document(collection = "student")
public class Student extends PersonalData {

	private Cpf cpfTeacher;
	private List<itemCompleted> items;
}
