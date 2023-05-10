package com.gazaltech.core.infra.repositorys;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.domain.student.StudentRepository;

@Repository
@Profile("PROD")
public interface StudentRepositoryMongo extends ReactiveMongoRepository<Student, ObjectId>, StudentRepository {
	
}
