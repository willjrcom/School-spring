package com.gazaltech.core.usecases.employee;

import org.springframework.beans.factory.annotation.Autowired;

import com.gazaltech.core.domain.employee.Employee;
import com.gazaltech.core.domain.employee.EmployeeTypeEnum;
import com.gazaltech.core.domain.student.PunishmentStudentEnum;
import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.infra.repositorys.SchoolRepositoryMongo;
import com.gazaltech.core.infra.repositorys.StudentRepositoryMongo;

import reactor.core.publisher.Mono;

public class DirectorServiceImpl implements DirectorService {
	@Autowired
	private StudentRepositoryMongo studentRepository;

	@Autowired
	private SchoolRepositoryMongo schoolRepository;
	
	@Override
	public void hireEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dismissEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mono<Employee> changePosition(Employee employee, EmployeeTypeEnum newEmployeeType) {
		Class<?> classe = newEmployeeType.getClassInstance();
		return null;
	}

	@Override
	public Boolean suspendStudent(Student student, PunishmentStudentEnum reasonSuspension) {
		student.setPunishmentStudent(reasonSuspension);
		studentRepository.save(student);
		return null;
	}

}
