package com.gazaltech.shared.domain;

import reactor.core.publisher.Mono;

public interface CpfRepository<T> {
	Mono<T> findByCpf(Cpf cpf);
}
