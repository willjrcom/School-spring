package com.gazaltech.core.infra.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.shared.domain.Cpf;

@Repository
public interface StudentRepositoryMongo extends MongoRepository<Student, String> {
	Student findByCpf(Cpf cpf);
	Student findByRa(Long ra);
	Student findByEmail(String email);
}
