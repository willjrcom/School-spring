package com.gazaltech.core.domain;

import org.bson.BsonDateTime;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import com.gazaltech.shared.domain.Cpf;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Validated
@Document(collection = "personalData")
public class PersonalData {
	private ObjectId id;
	private Cpf cpf;
	
	@NotBlank
	private String name;

    @Email(message = "O email deve ser válido")
	private String email;
	private BsonDateTime dateBirth;
	
}
