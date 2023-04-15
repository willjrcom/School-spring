package com.gazaltech.general.infra.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.general.domain.student.Student;

@Repository
public interface AlunoRepository extends MongoRepository<Student, String>{
	public Student findByCpf(String cpf);
}
