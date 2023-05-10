package com.gazaltech.core.infra.gateway;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

import com.gazaltech.core.domain.task.Task;
import com.gazaltech.core.infra.repositorys.TaskRepositoryMongo;

import reactor.core.publisher.Mono;

@Component
public class TaskGateway {
	private TaskRepositoryMongo taskRepository;
	
	public Mono<Task> findById(ObjectId id) {
		return taskRepository.findById(id);
	}
}
