package com.gazaltech.core.domain.classroom;

import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gazaltech.core.domain.employee.Teacher;
import com.gazaltech.core.domain.student.Student;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Document(collection = "ClassRoomCollection")
public class Classroom {
	@Id
	private ObjectId id;
	private String nameroom;
	private DiciplineClassroom diciplineRoom;
	private List<Student> students;
	private List<Teacher> allTeachers;

	public Teacher getCurrentTeacher() {
		if (this.allTeachers.size() == 0) {
			return new Teacher();
		}
		return allTeachers.get(this.allTeachers.size() - 1);
	}

	public String changeNameClassRoom(Classroom roomclass, String newName) throws Exception {
		if (this.getNameroom().equals(newName)) {
			throw new Exception("O novo nome da sala é igual ao nome anterior");
		}
		
		this.nameroom = newName;
		return getNameroom();
	}
	
	public static class ClassRoomBuilder {
		private Classroom classRoom;
		
		public ClassRoomBuilder() {
			this.classRoom = new Classroom();
		}
		
		public ClassRoomBuilder withNameRoom(String nameRoom) {
			classRoom.nameroom = nameRoom;
			return this;
		}

		public ClassRoomBuilder withDiciplineRoom(DiciplineClassroom diciplineRoom) {
			classRoom.diciplineRoom = diciplineRoom;
			return this;
		}

		public ClassRoomBuilder withAllStudents(List<Student> students) {
			classRoom.students = students;
			return this;
		}

		public ClassRoomBuilder withStudent(Student student) {
			classRoom.students.add(student);
			return this;
		}
		
		public ClassRoomBuilder withTeacher(Teacher teacher) {
			classRoom.allTeachers = Arrays.asList(teacher);
			return this;
		}
		
		public Classroom build(){
			return classRoom;
		}
	}
}
