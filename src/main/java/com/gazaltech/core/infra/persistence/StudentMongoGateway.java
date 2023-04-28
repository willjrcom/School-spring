package com.gazaltech.core.infra.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.infra.gateway.StudentGateway;
import com.gazaltech.core.infra.repositorys.StudentRepositoryMongo;
import com.gazaltech.shared.domain.Cpf;

@Repository
public class StudentMongoGateway implements StudentGateway {

	@Autowired
	private StudentRepositoryMongo studentRepositoryMongo;
	
	@Override
	public Student findByCpf(Cpf cpf) {
		return studentRepositoryMongo.findByCpf(cpf);
	}

	@Override
	public Student findByRa(Long ra) {
		return studentRepositoryMongo.findByRa(ra);
	}

	@Override
	public Student findByEmail(String email) {
		return studentRepositoryMongo.findByEmail(email);
	}

}
