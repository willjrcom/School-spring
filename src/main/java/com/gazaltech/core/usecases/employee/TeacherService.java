package com.gazaltech.core.usecases.employee;

import com.gazaltech.core.domain.student.Student;

public interface TeacherService {
	public void fixTask();
	public void sendTask();
	public Boolean approveStudent(Student student);
	public Boolean repproveStudent(Student student);
	public Boolean sendRecovery(Student student);
	public Boolean createExercise();
}
