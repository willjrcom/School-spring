package com.gazaltech.core.usecases.utils;

import com.gazaltech.core.domain.student.StatusStudentEnum;
import com.gazaltech.core.domain.student.Student;

public class UtilsServiceImpl implements UtilsService {
	public static Boolean isStudentActive(Student student) {
		return student.getStatusStudent().equals(StatusStudentEnum.ACTIVED);
	}
}
