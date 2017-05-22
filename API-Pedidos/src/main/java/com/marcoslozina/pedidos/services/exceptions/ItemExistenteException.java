package com.marcoslozina.pedidos.services.exceptions;

public class ItemExistenteException extends RuntimeException {

    private static final long serialVersionUID = 1869300553614629710L;

    public ItemExistenteException(String mensagem) {
	super(mensagem);
    }

    public ItemExistenteException(String mensagem, Throwable causa) {
	super(mensagem, causa);
    }

}
