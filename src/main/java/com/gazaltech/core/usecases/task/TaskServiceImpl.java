package com.gazaltech.core.usecases.task;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.domain.task.Task;
import com.gazaltech.core.infra.gateway.StudentGateway;
import com.gazaltech.shared.domain.Cpf;

import reactor.core.publisher.Mono;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
	private StudentGateway studentGateway;
	
	@Override
	public void StartTask(Cpf cpf, ObjectId taskId) {
		Mono<Student> studentMono = studentGateway.findByCpf(cpf);
		studentMono.subscribe(student -> findTaskById(student.getTasksToDo(), taskId).setStatusTaskOpen());
	}

	@Override
	public void finishTask(Cpf cpf, ObjectId taskId) {
		Mono<Student> studentMono = studentGateway.findByCpf(cpf);
		studentMono.subscribe(student -> findTaskById(student.getTasksToDo(), taskId).setStatusTaskClosed());
	}


	@Override
	public Task findTaskByName(List<Task> tasks, String name) {
		return tasks.stream()
				.filter(task -> task.getName().equals(name))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("A tarefa: " + name + " não foi encontrada!"));
	}

	@Override
	public Task findTaskById(List<Task> tasks, ObjectId taskId) {
		return tasks.stream()
				.filter(task -> task.getId().equals(taskId))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("A tarefa: " + taskId + " não foi encontrada!"));
	}
}
