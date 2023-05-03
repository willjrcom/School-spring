package com.gazaltech.core.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

import com.gazaltech.core.domain.student.Student;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class StudentTest {
    @Test
    void testStudentIsValid() {
    	Student student = new Student.StudentBuilder("123456")
    			.cpf("436.377.998-55")
    			.name("William Junior")
    			.email("willl@gmail.com")
    			.build();

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        
        assertEquals(0, violations.size());
    }

    @Test
    void testRaIsNull() {
    	Student student = new Student.StudentBuilder("")
    			.cpf("436.377.998-55")
    			.name("William Junior")
    			.email("willl@gmail.com")
    			.build();

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        
        assertEquals(1, violations.size());
    }

    @Test
    void testRaIsBlank() {
    	Student student = new Student.StudentBuilder("      ")
    			.cpf("436.377.998-55")
    			.name("William Junior")
    			.email("willl@gmail.com")
    			.build();

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        
        assertEquals(1, violations.size());
    }

    @Test
    void testEmailIsInvalid() {
    	Student student = new Student.StudentBuilder("123456")
    			.cpf("436")
    			.name("William Junior")
    			.email("willlgmail.com")
    			.build();

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        
        assertEquals(1, violations.size());
    }
}
