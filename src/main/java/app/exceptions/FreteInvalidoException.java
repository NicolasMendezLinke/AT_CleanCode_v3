package app.exceptions;

public class FreteInvalidoException extends RuntimeException {
    public FreteInvalidoException(String mensagem) {
        super(mensagem);
    }
}
