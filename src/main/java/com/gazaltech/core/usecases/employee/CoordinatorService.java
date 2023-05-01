package com.gazaltech.core.usecases.employee;

import com.gazaltech.core.domain.classroom.ClassRoom;
import com.gazaltech.core.domain.employee.Teacher;
import com.gazaltech.core.domain.student.ReasonSuspensionEnum;
import com.gazaltech.core.domain.student.Student;

public interface CoordinatorService {
	public Boolean ApproveStudentRemoval(Student student);
	public Boolean ExpellingStudent(Student student);
	public Boolean transferStudent(Student student);
	public Boolean changeClassRoomTeacher(Teacher teacher, ClassRoom oldClassRoom, ClassRoom newClassRoom);
	public Boolean requestSuspensionStudent(Student student, ReasonSuspensionEnum reasonSuspension);
	public ClassRoom createClassRoom(Teacher teacher);
}
