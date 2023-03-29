package com.rafaelsantos.todo.service.exceptions;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
