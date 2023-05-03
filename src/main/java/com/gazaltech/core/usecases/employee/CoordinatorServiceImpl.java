package com.gazaltech.core.usecases.employee;

import com.gazaltech.core.domain.classroom.ClassRoom;
import com.gazaltech.core.domain.employee.Teacher;
import com.gazaltech.core.domain.student.ReasonSuspensionEnum;
import com.gazaltech.core.domain.student.Student;

public class CoordinatorServiceImpl implements CoordinatorService {

	@Override
	public Boolean ApproveStudentRemoval(Student student) {
		return null;
	}

	@Override
	public Boolean ExpellingStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean transferStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean changeClassRoomTeacher(Teacher teacher, ClassRoom oldClassRoom, ClassRoom newClassRoom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean requestSuspensionStudent(Student student, ReasonSuspensionEnum reasonSuspension) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassRoom createClassRoom(Teacher teacher) {
		// TODO Auto-generated method stub
		return null;
	}

}
