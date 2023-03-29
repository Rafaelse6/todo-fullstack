package com.rafaelsantos.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.todo.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{

}
