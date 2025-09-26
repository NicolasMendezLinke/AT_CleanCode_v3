package app.promocao;

import app.model.Entrega;

public interface Promocao {
    double aplicar(Entrega entrega, double valorFrete);
}
