package com.gazaltech.core.usecases.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.infra.gateway.StudentGateway;
import com.gazaltech.shared.domain.Cpf;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentGateway studentGateway;
	
	public Mono<Student> findByCpf(Cpf cpf) {
		return studentGateway.findByCpf(cpf);
	}

	public Mono<Student> findByEmail(String email) {
		return studentGateway.findByEmail(email);
	}
	
	public Mono<Student> findByRa(long ra) {
		return studentGateway.findByRa(ra);
	}

	public Flux<Student> findAll() {
		return studentGateway.findAll();
	}
	
	public Mono<Student> save(Student student) {
		return studentGateway.save(student);
	}
}
