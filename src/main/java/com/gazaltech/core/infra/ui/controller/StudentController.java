package com.gazaltech.core.infra.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.usecases.student.StudentServiceImpl;
import com.gazaltech.shared.domain.Cpf;

import jakarta.validation.Valid;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	@GetMapping
	public Mono<Student> findByCpf(@Valid Cpf cpf) {
		System.out.println(cpf);
		return studentService.findByCpf(cpf);
	}

	@GetMapping(path = "/all")
	public Flux<Student> findAll() {
		return studentService.findAll();
	}

	@PostMapping
	public Mono<Student> save(@Valid Student student) {
		return studentService.save(student);
	}
}
