package com.gazaltech.core.infra.repositorys;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.gazaltech.core.domain.employee.Employee;

@Repository
public interface EmployeeRepositoryMongo extends ReactiveMongoRepository<Employee, String> {

}
