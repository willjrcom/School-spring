package com.gazaltech.core.domain.classroom;

import com.gazaltech.core.domain.student.Student;

import reactor.core.publisher.Mono;

public interface ClassroomRepository {
	Mono<Classroom> findByNameroom(String name);
	Mono<Classroom> findByDiciplineRoom(DiciplineClassroom diciplineRoom);
	Mono<Classroom> findByStudents(Student student); // errado
}
