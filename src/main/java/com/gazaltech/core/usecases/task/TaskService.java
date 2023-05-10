package com.gazaltech.core.usecases.task;

import java.util.List;

import org.bson.types.ObjectId;

import com.gazaltech.core.domain.task.Task;
import com.gazaltech.shared.domain.Cpf;

public interface TaskService {
	public void StartTask(Cpf cpf, ObjectId taskId);
	public void finishTask(Cpf cpf, ObjectId taskId);
	public Task findTaskByName(List<Task> tasks, String name);
	public Task findTaskById(List<Task> tasks, ObjectId taskId);
}
