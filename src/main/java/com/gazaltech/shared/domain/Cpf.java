package com.gazaltech.shared.domain;

import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Validated
public class Cpf {
	@Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$", message = "O cpf deve ser válido!")
	private String cpf;
}
