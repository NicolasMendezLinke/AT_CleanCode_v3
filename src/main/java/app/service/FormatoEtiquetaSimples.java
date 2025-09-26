package app.service;

import app.model.Entrega;

public class FormatoEtiquetaSimples implements FormatoEtiqueta {

    @Override
    public String gerarEtiqueta(Entrega entrega, double valorFrete, String tipoFrete) {
        return "Destinatário: " + entrega.getDestinatario()
                + "\nEndereço: " + entrega.getEndereco()
                + "\nTipo de Frete: " + tipoFrete
                + "\nValor do Frete: R$" + valorFrete;
    }

    @Override
    public String gerarResumo(Entrega entrega, double valorFrete, String tipoFrete) {
        return "Pedido para " + entrega.getDestinatario()
                + " com frete " + tipoFrete
                + " no valor de R$" + valorFrete;
    }
}

