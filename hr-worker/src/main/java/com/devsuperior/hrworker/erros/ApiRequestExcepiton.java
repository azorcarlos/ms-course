package com.devsuperior.hrworker.erros;

public class ApiRequestExcepiton extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ApiRequestExcepiton(String message) {
        super(message);
    }

    public ApiRequestExcepiton(String message, Throwable cause) {
        super(message, cause);
    }
	
}
