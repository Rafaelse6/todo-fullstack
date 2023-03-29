package com.rafaelsantos.todo.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelsantos.todo.domain.Todo;
import com.rafaelsantos.todo.repository.TodoRepository;

@Service
public class DBService {
	
	@Autowired
	private TodoRepository repository;
	
	public void instanciaBaseDeDados() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				LocalDateTime.parse("25/03/2022 10:40", formatter), false);

		repository.saveAll(Arrays.asList(t1));
	}
}
