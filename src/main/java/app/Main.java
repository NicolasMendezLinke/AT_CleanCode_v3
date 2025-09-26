package app;

import app.frete.*;
import app.model.Entrega;
import app.service.*;
import app.promocao.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTE 1: Cenário normal sem promoções ===");
        try {
            Entrega entrega1 = new Entrega("Rua das Flores, 123", 8.5, "João Silva");
            CalculadoraFrete frete1 = new FretePadrao();
            FormatoEtiqueta formato1 = new FormatoEtiquetaSimples();

            EtiquetaService etiquetaService1 = new EtiquetaService(frete1, formato1, null);

            System.out.println(etiquetaService1.gerarEtiqueta(entrega1));
            System.out.println("---");
            System.out.println(etiquetaService1.gerarResumo(entrega1));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 2: Cenário com promoções ===");
        try {
            Entrega entrega2 = new Entrega("Av. Brasil, 456", 12, "Maria Oliveira");
            CalculadoraFrete frete2 = new FreteExpresso();
            FormatoEtiqueta formato2 = new FormatoEtiquetaSimples();

            List<Promocao> promocoes = List.of(
                    new PromocaoFreteGratis(5),
                    new PromocaoPesoDesconto(10, 2)
            );

            EtiquetaService etiquetaService2 = new EtiquetaService(frete2, formato2, promocoes);

            System.out.println(etiquetaService2.gerarEtiqueta(entrega2));
            System.out.println("---");
            System.out.println(etiquetaService2.gerarResumo(entrega2));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 3: Valores inválidos para validar exceções ===");
        try {
            new Entrega("", -1, null);
        } catch (Exception e) {
            System.out.println("teste de entrega inválida): " + e.getMessage());
        }

        try {
            FormatoEtiqueta formato3 = new FormatoEtiquetaSimples();
            new EtiquetaService(null, formato3, null);
        } catch (Exception e) {
            System.out.println("teste de frete nulo): " + e.getMessage());
        }

        try {
            CalculadoraFrete frete3 = new FretePadrao();
            frete3.validarECalcular(null);
        } catch (Exception e) {
            System.out.println("teste de entrega nula no frete: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 4: Cenário com múltiplas promoções e etiqueta ===");
        try {
            Entrega entrega4 = new Entrega("Rua das Palmeiras, 789", 4, "Carlos Souza");
            CalculadoraFrete frete4 = new FreteEconomico();
            FormatoEtiqueta formato4 = new FormatoEtiquetaSimples();

            List<Promocao> promocoes = List.of(
                    new PromocaoFreteGratis(5),
                    new PromocaoPesoDesconto(10, 2)
            );

            EtiquetaService etiquetaService4 = new EtiquetaService(frete4, formato4, promocoes);

            System.out.println(etiquetaService4.gerarEtiqueta(entrega4));
            System.out.println("---");
            System.out.println(etiquetaService4.gerarResumo(entrega4));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
