package com.gazaltech.core.domain.school;

import com.gazaltech.core.domain.classroom.Classroom;
import com.gazaltech.core.domain.employee.Employee;

import reactor.core.publisher.Mono;

public interface SchoolRepository {
	public Mono<School> findByName(String name);
	public Mono<School> findByEmployees(Employee employee); // errado
	public Mono<School> findByClassRooms(Classroom classRoom); // errado
}
