package com.gazaltech.core.infra.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.infra.repositorys.StudentRepositoryMongo;
import com.gazaltech.shared.domain.Cpf;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class StudentGateway {

	@Autowired
	private StudentRepositoryMongo studentRepository;
	
	public Mono<Student> findByEmail(String email) {
		return studentRepository.findByEmail(email);
	}

	public Mono<Student> findByCpf(Cpf cpf) {
		return studentRepository.findByCpf(cpf);
	}

	public Mono<Student> findByRa(Long ra) {
		return studentRepository.findByRa(ra);
	}

	public Flux<Student> findAll() {
		return studentRepository.findAll();
	}

	public Mono<Student> save(Student student) {
		return studentRepository.save(student);
	}
}
