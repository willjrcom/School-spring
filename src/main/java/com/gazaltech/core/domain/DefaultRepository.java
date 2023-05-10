package com.gazaltech.core.domain;

import com.gazaltech.core.domain.student.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DefaultRepository<T> {
	public Flux<T> findAll();
	public Mono<T> save(Student student);

}
