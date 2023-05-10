package com.gazaltech.core.infra.repositorys;

import org.bson.types.ObjectId;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.employee.Employee;
import com.gazaltech.core.domain.employee.EmployeeRepository;

@Repository
@Profile("PROD")
public interface EmployeeRepositoryMongo extends ReactiveMongoRepository<Employee, ObjectId>, EmployeeRepository {

}
