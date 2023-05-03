package com.gazaltech.core.infra.repositorys;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.school.School;

@Repository
public interface SchoolRepositoryMongo extends ReactiveMongoRepository<School, String> {

}
