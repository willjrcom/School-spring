package com.gazaltech.core.usecases.employee;

import org.springframework.beans.factory.annotation.Autowired;

import com.gazaltech.core.domain.classroom.Classroom;
import com.gazaltech.core.domain.classroom.DiciplineClassroom;
import com.gazaltech.core.domain.employee.Teacher;
import com.gazaltech.core.domain.student.PunishmentStudentEnum;
import com.gazaltech.core.domain.student.StatusStudentEnum;
import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.infra.repositorys.ClassroomRepositoryMongo;
import com.gazaltech.core.infra.repositorys.StudentRepositoryMongo;
import com.gazaltech.core.usecases.utils.UtilsServiceImpl;

import reactor.core.publisher.Mono;

public class CoordinatorServiceImpl implements CoordinatorService {
	@Autowired
	private StudentRepositoryMongo studentRepository;
	
	@Autowired
	private ClassroomRepositoryMongo classroomRepository;
	
	@Override
	public Boolean ApproveStudentTransfer(Student student) {
		if (!student.getStatusStudent().equals(StatusStudentEnum.ACTIVED)) {
			return Boolean.FALSE;
		}
		
		student.setStatusStudent(StatusStudentEnum.TRANSFERRED);
		studentRepository.save(student);
		return Boolean.TRUE;
	}

	@Override
	public Boolean ExpellingStudent(Student student) {
		if (!UtilsServiceImpl.isStudentActive(student)) {
			return Boolean.FALSE;
		}
		
		student.setStatusStudent(StatusStudentEnum.EXPELLED);
		studentRepository.save(student);
		return Boolean.TRUE;
	}

	@Override
	public Boolean addTeacherInClassroom(Teacher teacher, Classroom newClassroom) {
		return null;
	}

	@Override
	public Boolean requestSuspensionStudent(Student student, PunishmentStudentEnum reasonSuspension) {
		return null;
	}

	@Override
	public Mono<Classroom> createClassroom(Teacher teacher, String nameClassroom, DiciplineClassroom diciplineClassroom) {
		Classroom classroom = new Classroom.ClassRoomBuilder()
				.withNameRoom(nameClassroom)
				.withDiciplineRoom(diciplineClassroom)
				.withTeacher(teacher)
				.build();
		
		return classroomRepository.save(classroom);
	}

}
