package com.gazaltech.core.domain;

import com.gazaltech.shared.domain.CpfRepository;

import reactor.core.publisher.Mono;

public interface PersonalDataRepository<T> extends CpfRepository<T>, DefaultRepository<T> {
	public Mono<T> findByEmail(String email);
}
