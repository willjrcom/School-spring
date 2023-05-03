package com.gazaltech.core.infra.repositorys;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.classroom.ClassRoom;

@Repository
public interface ClassRoomRepositoryMongo extends ReactiveMongoRepository<ClassRoom, String> {

}
