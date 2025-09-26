package app.service;

import app.model.Entrega;

public interface FormatoEtiqueta {
    String gerarEtiqueta(Entrega entrega, double valorFrete, String tipoFrete);
    String gerarResumo(Entrega entrega, double valorFrete, String tipoFrete);
}