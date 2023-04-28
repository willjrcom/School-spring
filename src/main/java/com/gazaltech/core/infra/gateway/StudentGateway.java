package com.gazaltech.core.infra.gateway;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.shared.domain.Cpf;

public interface StudentGateway {
	Student findByCpf(Cpf cpf);
	Student findByRa(Long ra);
	Student findByEmail(String emmail);
}
