package com.robsonalves.cursomc.services.exception;

//mensagem de erro padrao feito por mim...

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegrityException(String msg) {

		super(msg);
	}

	public DataIntegrityException(String msg, Throwable cause) {

		super(msg, cause);
	}

}
