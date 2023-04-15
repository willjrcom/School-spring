package com.gazaltech.general.domain.room;

import java.util.List;

import com.gazaltech.general.domain.employee.Teacher;
import com.gazaltech.general.domain.student.Student;

import lombok.Getter;

@Getter
public class RoomClass {
	private String nameRoom;
	private DiciplineRoom diciplineRoom;
	private List<Student> students;
	private List<Teacher> teachers;
	
	public RoomClass(String nameRoom, DiciplineRoom diciplineRoom, Teacher teacher) {
		this.nameRoom = nameRoom;
		this.diciplineRoom = diciplineRoom;
		this.teachers.add(teacher);
	}

	public Teacher getCurrentTeacher() {
		if (this.teachers.size() == 0) {
			return new Teacher();
		}
		return teachers.get(this.teachers.size() - 1);
	}
	
	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}
	
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public void addStudents(Student student) {
		this.students.add(student);
	}

	public void removeStudents(Student student) {
		this.students.remove(student);
	}	
}
