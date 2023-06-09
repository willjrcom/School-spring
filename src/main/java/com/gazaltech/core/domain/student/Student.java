package com.gazaltech.core.domain.student;

import java.util.List;

import org.bson.BsonDateTime;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import com.gazaltech.core.domain.PersonalData;
import com.gazaltech.core.domain.task.Task;
import com.gazaltech.shared.domain.Cpf;

import jakarta.validation.constraints.Min;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
@Document(collection = "schoolCollect")
@Validated
public class Student extends PersonalData {
	@Min(value = 4)
	private String ra;
	private StatusStudentEnum statusStudent;
	private PunishmentStudentEnum punishmentStudent;
	private List<Task> tasksToDo;
	
	public void setStatusStudent(StatusStudentEnum statusStudent) {
		this.statusStudent = statusStudent;
	}

	public void setPunishmentStudent(PunishmentStudentEnum punishmentStudent) {
		this.punishmentStudent = punishmentStudent;
	}
	
    public static class StudentBuilder {
		private Student student;
		
		public StudentBuilder(String ra) {
			this.student = new Student();
			this.student.ra = ra;
		}

		public StudentBuilder withCpf(Cpf cpf) {
			this.student.cpf = cpf;
			return this;
		}

		public StudentBuilder withCpf(String cpf) {
			this.student.cpf = new Cpf(cpf);
			return this;
		}
		
		public StudentBuilder withName(String name) {
			this.student.name = name;
			return this;
		}
		
		public StudentBuilder withEmail(String email) {
			this.student.email = email;
			return this;
		}
		
		public StudentBuilder withDateBirth(BsonDateTime dateBirth) {
			this.student.dateBirth = dateBirth;
			return this;
		}
		
		public Student build() {
			return student;
		}
    }
}
