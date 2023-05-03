package com.gazaltech.core.usecases.student;

import com.gazaltech.core.domain.task.Task;

public interface StudentService {
	public void StartTask(Task task);
	public void finishTask(Task task);
}
