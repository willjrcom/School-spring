package com.gazaltech.core.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.shared.domain.Cpf;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class StudentTest {
    @Test
    void testStudentIsValid() {
    	Student student = new Student("123456");
    	student.setCpf(new Cpf("436.377.998-55"));
    	student.setName("William Junior");
    	student.setEmail("willl@gmail.com");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        violations.stream().forEach(error -> System.out.println(error.getMessage()));
        
        assertEquals(0, violations.size());
    }

    @Test
    void testRaIsNull() {
    	Student student = new Student("");
    	student.setCpf(new Cpf("436.377.998-55"));
    	student.setName("William Junior");
    	student.setEmail("willl@gmail.com");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        violations.stream().forEach(error -> System.out.println(error.getMessage()));
        
        assertEquals(1, violations.size());
    }

    @Test
    void testRaIsBlank() {
    	Student student = new Student("      ");
    	student.setCpf(new Cpf("436.377"));
    	student.setName("William Junior");
    	student.setEmail("willl@gmail.com");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        violations.stream().forEach(error -> System.out.println(error.getMessage()));
        
        assertEquals(1, violations.size());
    }

    @Test
    void testEmailIsInvalid() {
    	Student student = new Student("123456");
    	student.setCpf(new Cpf("436.377"));
    	student.setName("William Junior");
    	student.setEmail("will");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        violations.stream().forEach(error -> System.out.println(error.getMessage()));
        
        assertEquals(1, violations.size());
    }
}
