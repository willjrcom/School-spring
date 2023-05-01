package com.gazaltech.core.usecases.employee;

import com.gazaltech.core.domain.employee.Employee;
import com.gazaltech.core.domain.employee.EmployeeTypeEnum;
import com.gazaltech.core.domain.student.Student;

public interface DirectorService {
	public void hireEmployee(Employee employee);
	public void dismissEmployee(Employee employee);
	public Employee changePosition(Employee employee, EmployeeTypeEnum newEmployeeType);
	public Boolean suspendStudent(Student student);
}
