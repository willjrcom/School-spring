package com.gazaltech.shared.domain;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Cpf {
	@Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$", message = "O cpf deve ser válido!")
	private String cpf;
	
	public Cpf(String cpf) {
		this.cpf = cpf;
	}
}
