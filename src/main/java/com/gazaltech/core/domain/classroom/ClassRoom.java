package com.gazaltech.core.domain.classroom;

import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gazaltech.core.domain.employee.Teacher;
import com.gazaltech.core.domain.student.Student;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Document(collection = "ClassRoomCollection")
public class ClassRoom {
	private ObjectId id;
	private String nameRoom;
	private DiciplineClassRoom diciplineRoom;
	private List<Student> students;
	private List<Teacher> allTeachers;

	public Teacher getCurrentTeacher() {
		if (this.allTeachers.size() == 0) {
			return new Teacher();
		}
		return allTeachers.get(this.allTeachers.size() - 1);
	}

	public String changeNameClassRoom(ClassRoom roomclass, String newName) throws Exception {
		if (this.getNameRoom().equals(newName)) {
			throw new Exception("O novo nome da sala é igual ao nome anterior");
		}
		
		this.nameRoom = newName;
		return getNameRoom();
	}
	
	public static class ClassRoomBuilder {
		private ClassRoom classRoom;
		
		public ClassRoomBuilder() {
			this.classRoom = new ClassRoom();
		}
		
		public ClassRoomBuilder nameRoom(String nameRoom) {
			classRoom.nameRoom = nameRoom;
			return this;
		}

		public ClassRoomBuilder diciplineRoom(DiciplineClassRoom diciplineRoom) {
			classRoom.diciplineRoom = diciplineRoom;
			return this;
		}

		public ClassRoomBuilder allStudents(List<Student> students) {
			classRoom.students = students;
			return this;
		}

		public ClassRoomBuilder student(Student student) {
			classRoom.students.add(student);
			return this;
		}
		
		public ClassRoomBuilder teacher(Teacher teacher) {
			classRoom.allTeachers = Arrays.asList(teacher);
			return this;
		}
		
		public ClassRoom build(){
			return classRoom;
		}
	}
}
