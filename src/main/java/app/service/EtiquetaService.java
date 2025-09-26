package app.service;

import app.frete.CalculadoraFrete;
import app.model.Entrega;
import app.exceptions.FreteInvalidoException;
import app.promocao.Promocao;

import java.util.List;

public class EtiquetaService {

    private final CalculadoraFrete calculadoraFrete;
    private final FormatoEtiqueta formatoEtiqueta;
    private final List<Promocao> promocoes;

    public EtiquetaService(CalculadoraFrete calculadoraFrete, FormatoEtiqueta formatoEtiqueta, List<Promocao> promocoes) {
        if (calculadoraFrete == null) {
            throw new FreteInvalidoException("Calculadora de frete não pode ser nula");
        }
        this.calculadoraFrete = calculadoraFrete;
        this.formatoEtiqueta = formatoEtiqueta;
        this.promocoes = promocoes;
    }

    public String gerarEtiqueta(Entrega entrega) {
        double valorFrete = calcularFreteComPromocoes(entrega);
        return formatoEtiqueta.gerarEtiqueta(entrega, valorFrete, calculadoraFrete.getTipo());
    }

    public String gerarResumo(Entrega entrega) {
        double valorFrete = calcularFreteComPromocoes(entrega);
        return formatoEtiqueta.gerarResumo(entrega, valorFrete, calculadoraFrete.getTipo());
    }

    private double calcularFreteComPromocoes(Entrega entrega) {
        double valor = calculadoraFrete.validarECalcular(entrega);
        if (promocoes != null) {
            for (Promocao promocao : promocoes) {
                valor = promocao.aplicar(entrega, valor);
            }
        }
        return valor;
    }
}

