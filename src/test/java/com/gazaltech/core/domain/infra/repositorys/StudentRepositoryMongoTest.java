package com.gazaltech.core.domain.infra.repositorys;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;

import com.gazaltech.core.domain.student.Student;
import com.gazaltech.core.infra.repositorys.StudentRepositoryMongo;

@DataMongoTest
@AutoConfigureWebTestClient
public class StudentRepositoryMongoTest {
	@Autowired
	private StudentRepositoryMongo studentRepository;
	
	@Test
	public void testCount() {
		long count = studentRepository.count().block();
		System.out.println(count);
        assertEquals(3, count);
	}

	@Test
	public void testSave() {
    	Student student = new Student.StudentBuilder("123456")
    			.withCpf("436.377.998-55")
    			.withName("William Junior")
    			.withEmail("willl@gmail.com")
    			.build();
		studentRepository.save(student);
		long count = studentRepository.count().block();
		System.out.println(count);
        assertEquals(4, count);
	}
}
