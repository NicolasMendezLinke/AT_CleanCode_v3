package app.promocao;

import app.model.Entrega;

public class PromocaoFreteGratis implements Promocao {
    private final double pesoMaximo;

    public PromocaoFreteGratis(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    @Override
    public double aplicar(Entrega entrega, double valorFrete) {
        if (entrega.getPeso() <= pesoMaximo) {
            return 0;
        }
        return valorFrete;
    }
}

