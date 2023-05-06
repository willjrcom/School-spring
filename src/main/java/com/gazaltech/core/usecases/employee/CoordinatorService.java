package com.gazaltech.core.usecases.employee;

import com.gazaltech.core.domain.classroom.Classroom;
import com.gazaltech.core.domain.classroom.DiciplineClassroom;
import com.gazaltech.core.domain.employee.Teacher;
import com.gazaltech.core.domain.student.PunishmentStudentEnum;
import com.gazaltech.core.domain.student.Student;

import reactor.core.publisher.Mono;

public interface CoordinatorService {
	public Boolean ApproveStudentTransfer(Student student);
	public Boolean ExpellingStudent(Student student);
	public Boolean addTeacherInClassroom(Teacher teacher, Classroom newClassroom);
	public Boolean requestSuspensionStudent(Student student, PunishmentStudentEnum reasonSuspension);
	public Mono<Classroom> createClassroom(Teacher teacher, String nameClassroom, DiciplineClassroom diciplineClassroom);
}
