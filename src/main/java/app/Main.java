package app;

import app.frete.*;
import app.model.Entrega;
import app.service.*;
import app.promocao.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTE 1: Frete Padrão sem promoções ===");
        try {
            Entrega entrega1 = new Entrega("Rua A, 100", 10, "Cliente 1");
            CalculadoraFrete frete1 = new FretePadrao();
            FormatoEtiqueta formato1 = new FormatoEtiquetaSimples();

            EtiquetaService etiquetaService1 = new EtiquetaService(frete1, formato1, null);

            System.out.println(etiquetaService1.gerarEtiqueta(entrega1));
            System.out.println("---");
            System.out.println(etiquetaService1.gerarResumo(entrega1));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 2: Frete Padrão com Promoção Frete Grátis ===");
        try {
            Entrega entrega2 = new Entrega("Rua A, 100", 10, "Cliente 1");
            CalculadoraFrete frete2 = new FretePadrao();
            FormatoEtiqueta formato2 = new FormatoEtiquetaSimples();

            List<Promocao> promocoes2 = List.of(new PromocaoFreteGratis(5));

            EtiquetaService etiquetaService2 = new EtiquetaService(frete2, formato2, promocoes2);

            System.out.println(etiquetaService2.gerarEtiqueta(entrega2));
            System.out.println("---");
            System.out.println(etiquetaService2.gerarResumo(entrega2));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 3: Frete Padrão com Promoção Desconto por Peso ===");
        try {
            Entrega entrega3 = new Entrega("Rua A, 100", 10, "Cliente 1");
            CalculadoraFrete frete3 = new FretePadrao();
            FormatoEtiqueta formato3 = new FormatoEtiquetaSimples();

            List<Promocao> promocoes3 = List.of(new PromocaoPesoDesconto(10, 2));

            EtiquetaService etiquetaService3 = new EtiquetaService(frete3, formato3, promocoes3);

            System.out.println(etiquetaService3.gerarEtiqueta(entrega3));
            System.out.println("---");
            System.out.println(etiquetaService3.gerarResumo(entrega3));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 4: Frete Expresso sem promoções ===");
        try {
            Entrega entrega5 = new Entrega("Rua B, 200", 10, "Cliente 2");
            CalculadoraFrete frete5 = new FreteExpresso();
            FormatoEtiqueta formato5 = new FormatoEtiquetaSimples();

            EtiquetaService etiquetaService5 = new EtiquetaService(frete5, formato5, null);

            System.out.println(etiquetaService5.gerarEtiqueta(entrega5));
            System.out.println("---");
            System.out.println(etiquetaService5.gerarResumo(entrega5));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 5: Frete Expresso com Promoção Frete Grátis ===");
        try {
            Entrega entrega6 = new Entrega("Rua B, 200", 10, "Cliente 2");
            CalculadoraFrete frete6 = new FreteExpresso();
            FormatoEtiqueta formato6 = new FormatoEtiquetaSimples();

            List<Promocao> promocoes6 = List.of(new PromocaoFreteGratis(5));

            EtiquetaService etiquetaService6 = new EtiquetaService(frete6, formato6, promocoes6);

            System.out.println(etiquetaService6.gerarEtiqueta(entrega6));
            System.out.println("---");
            System.out.println(etiquetaService6.gerarResumo(entrega6));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 6: Frete Expresso com Promoção Desconto por Peso ===");
        try {
            Entrega entrega7 = new Entrega("Rua B, 200", 10, "Cliente 2");
            CalculadoraFrete frete7 = new FreteExpresso();
            FormatoEtiqueta formato7 = new FormatoEtiquetaSimples();

            List<Promocao> promocoes7 = List.of(new PromocaoPesoDesconto(10, 2));

            EtiquetaService etiquetaService7 = new EtiquetaService(frete7, formato7, promocoes7);

            System.out.println(etiquetaService7.gerarEtiqueta(entrega7));
            System.out.println("---");
            System.out.println(etiquetaService7.gerarResumo(entrega7));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 7: Frete Econômico sem promoções ===");
        try {
            Entrega entrega9 = new Entrega("Rua C, 300", 10, "Cliente 3");
            CalculadoraFrete frete9 = new FreteEconomico();
            FormatoEtiqueta formato9 = new FormatoEtiquetaSimples();

            EtiquetaService etiquetaService9 = new EtiquetaService(frete9, formato9, null);

            System.out.println(etiquetaService9.gerarEtiqueta(entrega9));
            System.out.println("---");
            System.out.println(etiquetaService9.gerarResumo(entrega9));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 8: Frete Econômico com Promoção Frete Grátis ===");
        try {
            Entrega entrega10 = new Entrega("Rua C, 300", 10, "Cliente 3");
            CalculadoraFrete frete10 = new FreteEconomico();
            FormatoEtiqueta formato10 = new FormatoEtiquetaSimples();

            List<Promocao> promocoes10 = List.of(new PromocaoFreteGratis(5));

            EtiquetaService etiquetaService10 = new EtiquetaService(frete10, formato10, promocoes10);

            System.out.println(etiquetaService10.gerarEtiqueta(entrega10));
            System.out.println("---");
            System.out.println(etiquetaService10.gerarResumo(entrega10));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE 9: Frete Econômico com Promoção Desconto por Peso ===");
        try {
            Entrega entrega11 = new Entrega("Rua C, 300", 10, "Cliente 3");
            CalculadoraFrete frete11 = new FreteEconomico();
            FormatoEtiqueta formato11 = new FormatoEtiquetaSimples();

            List<Promocao> promocoes11 = List.of(new PromocaoPesoDesconto(10, 2));

            EtiquetaService etiquetaService11 = new EtiquetaService(frete11, formato11, promocoes11);

            System.out.println(etiquetaService11.gerarEtiqueta(entrega11));
            System.out.println("---");
            System.out.println(etiquetaService11.gerarResumo(entrega11));
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n=== TESTE DE VALIDAÇÕES ===");
        try {
            new Entrega("", -1, null);
        } catch (Exception e) {
            System.out.println("Entrega inválida: " + e.getMessage());
        }

        try {
            FormatoEtiqueta formato = new FormatoEtiquetaSimples();
            new EtiquetaService(null, formato, null);
        } catch (Exception e) {
            System.out.println("Frete nulo: " + e.getMessage());
        }

        try {
            CalculadoraFrete frete = new FretePadrao();
            frete.validarECalcular(null);
        } catch (Exception e) {
            System.out.println("Entrega nula no frete: " + e.getMessage());
        }
    }
}
