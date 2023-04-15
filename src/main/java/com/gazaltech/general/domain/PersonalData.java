package com.gazaltech.general.domain;

import org.bson.BsonDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import com.gazaltech.shared.domain.Cpf;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Validated
@Document(collection = "personalData")
public class PersonalData {
	@Id
	private Cpf cpf;
	private String name;

    @Email(message = "O email deve ser válido")
	private String email;
	private BsonDateTime dateBirth;
	
}
