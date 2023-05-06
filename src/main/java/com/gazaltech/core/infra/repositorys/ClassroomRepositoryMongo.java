package com.gazaltech.core.infra.repositorys;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.classroom.Classroom;

@Repository
public interface ClassroomRepositoryMongo extends ReactiveMongoRepository<Classroom, String> {

}
