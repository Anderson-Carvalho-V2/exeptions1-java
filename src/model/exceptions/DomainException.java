package model.exceptions;

// Exception - Exceção deve ser tratada ou propagada
// RuntimeException - Exceção não precisa ser trata/progapada

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
	
}
