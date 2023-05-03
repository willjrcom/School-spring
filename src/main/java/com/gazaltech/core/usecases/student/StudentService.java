package com.gazaltech.core.usecases.student;

import com.gazaltech.core.domain.test.Test;

public interface StudentService {
	public void StartTest(Test test);
	public void finishTest(Test test);
}
