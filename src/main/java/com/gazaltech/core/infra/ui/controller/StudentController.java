package com.gazaltech.core.infra.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gazaltech.core.application.student.StudentService;
import com.gazaltech.core.domain.student.Student;
import com.gazaltech.shared.domain.Cpf;

import jakarta.validation.Valid;

@RestController
@RequestMapping
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public Student findByCpf(@Valid Cpf cpf) {
		return studentService.findByCpf(cpf);
	}
}
