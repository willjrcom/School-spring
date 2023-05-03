package com.gazaltech.core.domain;

import org.bson.BsonDateTime;
import org.bson.types.ObjectId;
import org.springframework.validation.annotation.Validated;

import com.gazaltech.shared.domain.Cpf;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
@Validated
public class PersonalData {
	private ObjectId id;
	protected Cpf cpf;
	
	@NotBlank
	protected String name;

    @Email(message = "O email deve ser válido")
    protected String email;
    protected BsonDateTime dateBirth;

    public static class PersonalDataBuilder {
		private PersonalData personalData;
		
		public PersonalDataBuilder() {
			this.personalData = new PersonalData();
		}

		public PersonalDataBuilder cpf(Cpf cpf) {
			this.personalData.cpf = cpf;
			return this;
		}
		
		public PersonalDataBuilder name(String name) {
			this.personalData.name = name;
			return this;
		}
		
		public PersonalDataBuilder email(String email) {
			this.personalData.email = email;
			return this;
		}
		
		public PersonalDataBuilder dateBirth(BsonDateTime dateBirth) {
			this.personalData.dateBirth = dateBirth;
			return this;
		}
		
		public PersonalData build() {
			return personalData;
		}
    }
}
