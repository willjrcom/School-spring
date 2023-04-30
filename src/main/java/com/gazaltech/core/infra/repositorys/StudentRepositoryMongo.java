package com.gazaltech.core.infra.repositorys;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.shared.domain.Cpf;

import reactor.core.publisher.Mono;

@Repository
public interface StudentRepositoryMongo extends ReactiveMongoRepository<Student, String> {
	public Mono<Student> findByCpf(Cpf cpf);
	public Mono<Student> findByRa(Long ra);
	public Mono<Student> findByEmail(String email);
}
