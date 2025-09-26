package app.frete;

import app.model.Entrega;

public class FretePadrao implements CalculadoraFrete {
    private static final double TAXA_PESO = 1.2;

    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * TAXA_PESO;
    }

    @Override
    public String getTipo() {
        return "PADRÃO";
    }
}
