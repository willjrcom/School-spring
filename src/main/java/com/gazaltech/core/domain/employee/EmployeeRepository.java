package com.gazaltech.core.domain.employee;

import com.gazaltech.core.domain.PersonalDataRepository;

import reactor.core.publisher.Mono;

public interface EmployeeRepository extends PersonalDataRepository<Employee> {
	Mono<Employee> findBySalary(Salary salary);
}