package app.frete;

import app.model.Entrega;
import app.exceptions.FreteInvalidoException;

public interface CalculadoraFrete {
    default double validarECalcular(Entrega entrega) {
        if (entrega == null) {
            throw new FreteInvalidoException("Entrega não pode ser nula");
        }
        return calcular(entrega);
    }

    double calcular(Entrega entrega);

    String getTipo();
}



