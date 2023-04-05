package com.rafaelsantos.todo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafaelsantos.todo.domain.Todo;
import com.rafaelsantos.todo.repository.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository repository;

	public void instanciaBaseDeDados() throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11",
				sdf.parse("25/03/2022"), false);

		Todo t2 = new Todo(null, "Ler", "Ler livros de desenvolvimento pessoal",
				sdf.parse("22/03/2021"), true);

		Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos",
				sdf.parse("21/03/2022"), true);

		Todo t4 = new Todo(null, "Meditar", "Meditar durante 40 minutos pela manhã",
				sdf.parse("27/03/2022"), true);

		repository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
}
