package com.gazaltech.core.infra.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.gazaltech.core.application.student.StudentService;
import com.gazaltech.core.domain.student.Student;
import com.gazaltech.shared.domain.Cpf;

import reactor.core.publisher.Mono;

@Component
public class StudentHandler {
	@Autowired
	private StudentService studentService;

	public Mono<ServerResponse> findByCpf(ServerRequest request) {
		request.pathVariables().values().stream().forEach(System.out::println);
		String sCpf = request.pathVariable("cpf");
		Cpf cpf = new Cpf(sCpf);

        Mono<Student> studentMono = studentService.findByCpf(cpf);
        
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(studentMono,
				Student.class);
	}

	public Mono<ServerResponse> findByRa(ServerRequest request) {
		long ra = (long) Long.valueOf(request.pathVariable("ra"));
		Mono<Student> studentMono = studentService.findByRa(ra);
		
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(studentMono,
				Student.class);
	}

	public Mono<ServerResponse> findByEmail(ServerRequest request) {
		String email = request.pathVariable("email");
		Mono<Student> studentMono = studentService.findByEmail(email);

		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(studentMono,
				Student.class);
	}

	public Mono<ServerResponse> findAll(ServerRequest request) {
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(studentService.findAll(),
				Student.class);
	}
	
	public Mono<ServerResponse> saveStudent(ServerRequest request) {
        Mono<Student> studentMono = request.bodyToMono(Student.class);
        studentMono.flux().map(student -> studentService.save(student));
        
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(studentMono,
				Student.class);
	}
	
}
