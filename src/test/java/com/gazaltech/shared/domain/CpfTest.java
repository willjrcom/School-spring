package com.gazaltech.shared.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

class CpfTest {
    @Test
    void testCpfIsValid() {
    	Cpf cpf = new Cpf("436.377.998-55");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Cpf>> violations = validator.validate(cpf);
        violations.stream().forEach(error -> System.out.println(error.getMessage()));

        assertEquals(0, violations.size());
    }

    @Test
    void testCpfIsNull() {
    	Cpf cpf = new Cpf("");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Cpf>> violations = validator.validate(cpf);
        violations.stream().forEach(error -> System.out.println(error.getMessage()));

        assertEquals(1, violations.size());
    }

    @Test
    void testCpfIsEmpty() {
    	Cpf cpf = new Cpf("     ");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Cpf>> violations = validator.validate(cpf);
        violations.stream().forEach(error -> System.out.println(error.getMessage()));

        assertEquals(1, violations.size());
    }
    
    @Test
    void testCpfIsInWrong() {
    	Cpf cpf = new Cpf("436.37");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Cpf>> violations = validator.validate(cpf);
        violations.stream().forEach(error -> System.out.println(error.getMessage()));

        assertEquals(1, violations.size());
    }
}
