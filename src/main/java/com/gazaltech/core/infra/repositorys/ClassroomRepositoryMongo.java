package com.gazaltech.core.infra.repositorys;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.classroom.Classroom;
import com.gazaltech.core.domain.classroom.ClassroomRepository;

@Repository
@Profile("PROD")
public interface ClassroomRepositoryMongo extends ReactiveMongoRepository<Classroom, String>, ClassroomRepository {

}
