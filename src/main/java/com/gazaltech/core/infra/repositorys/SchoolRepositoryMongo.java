package com.gazaltech.core.infra.repositorys;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.school.School;
import com.gazaltech.core.domain.school.SchoolRepository;

@Repository
@Profile("PROD")
public interface SchoolRepositoryMongo extends ReactiveMongoRepository<School, String>, SchoolRepository {
	
}
