package com.robsonalves.cursomc.services;

//mensagem de erro padrao feito por mim...

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {

		super(msg);
	}

	public ObjectNotFoundException(String msg, Throwable cause) {

		super(msg, cause);
	}

}
