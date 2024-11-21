package com.buson.exception;

public class TesteEnvioNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public TesteEnvioNotFoundException(String message) {
		super(message);
	}
	
	public TesteEnvioNotFoundException(Long id) {
		super("Teste de envio não encontrado com o ID: "+id);
	}
}
