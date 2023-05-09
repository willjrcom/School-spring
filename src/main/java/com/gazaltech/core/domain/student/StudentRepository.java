package com.gazaltech.core.domain.student;

import com.gazaltech.core.domain.PersonalDataRepository;

import reactor.core.publisher.Mono;

public interface StudentRepository extends PersonalDataRepository<Student> {
	public Mono<Student> findByRa(Long ra);
}
