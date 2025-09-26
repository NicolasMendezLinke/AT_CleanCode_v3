package app.frete;

import app.model.Entrega;

public class FreteEconomico implements CalculadoraFrete {
    private static final double TAXA_PESO = 1.1;
    private static final double DESCONTO = 5.0;

    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * TAXA_PESO - DESCONTO;
    }

    @Override
    public String getTipo() {
        return "ECONÔMICO";
    }
}
