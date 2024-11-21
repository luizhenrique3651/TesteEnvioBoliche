package com.buson.exception;

public class TesteEnvioNotFoundException extends RuntimeException{

	public TesteEnvioNotFoundException(String message) {
		super(message);
	}
	
	public TesteEnvioNotFoundException(Long id) {
		super("Teste de envio não encontrado com o ID: "+id);
	}
}
