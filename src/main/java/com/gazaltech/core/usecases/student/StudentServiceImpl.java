package com.gazaltech.core.usecases.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.domain.test.Test;
import com.gazaltech.core.infra.repositorys.StudentRepositoryMongo;
import com.gazaltech.shared.domain.Cpf;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepositoryMongo studentRepository;

	@Override
	public void StartTest(Test test) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finishTest(Test test) {
		// TODO Auto-generated method stub
		
	}
	
	public Mono<Student> findByCpf(Cpf cpf) {
		return studentRepository.findByCpf(cpf);
	}

	public Mono<Student> findByEmail(String email) {
		return studentRepository.findByEmail(email);
	}
	
	public Mono<Student> findByRa(long ra) {
		return studentRepository.findByRa(ra);
	}

	public Flux<Student> findAll() {
		return studentRepository.findAll();
	}
	
	public Mono<Student> save(Student student) {
		return studentRepository.save(student);
	}
}
