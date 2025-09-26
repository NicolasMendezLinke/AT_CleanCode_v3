package app.exceptions;

public class EntregaInvalidaException extends RuntimeException {
    public EntregaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
