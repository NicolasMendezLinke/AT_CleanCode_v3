package app.promocao;

import app.model.Entrega;

public class PromocaoPesoDesconto implements Promocao {
    private final double pesoMinimo;
    private final double desconto;

    public PromocaoPesoDesconto(double pesoMinimo, double desconto) {
        this.pesoMinimo = pesoMinimo;
        this.desconto = desconto;
    }

    @Override
    public double aplicar(Entrega entrega, double valorFrete) {
        if (entrega.getPeso() >= pesoMinimo) {
            return Math.max(valorFrete - desconto, 0);
        }
        return valorFrete;
    }
}