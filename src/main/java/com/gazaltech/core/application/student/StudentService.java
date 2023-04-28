package com.gazaltech.core.application.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.infra.persistence.StudentMongoGateway;
import com.gazaltech.shared.domain.Cpf;

@Service
public class StudentService {
	@Autowired
	private StudentMongoGateway studentRepository;
	
	public Student findByCpf(Cpf cpf) {
		return studentRepository.findByCpf(cpf);
	}
}
