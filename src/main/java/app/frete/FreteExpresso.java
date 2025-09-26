package app.frete;

import app.model.Entrega;

public class FreteExpresso implements CalculadoraFrete {
    private static final double TAXA_PESO = 1.5;
    private static final double TAXA_FIXA = 10.0;

    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * TAXA_PESO + TAXA_FIXA;
    }

    @Override
    public String getTipo() {
        return "EXPRESSO";
    }
}
