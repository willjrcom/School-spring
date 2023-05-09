package com.gazaltech.core.infra.repositorys;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.school.School;
import com.gazaltech.core.domain.school.SchoolRepository;

@Repository
public interface SchoolRepositoryMongo extends ReactiveMongoRepository<School, String>, SchoolRepository {

}
