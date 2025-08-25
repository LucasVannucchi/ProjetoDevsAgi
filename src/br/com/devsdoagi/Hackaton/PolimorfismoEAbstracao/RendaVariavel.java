/*
 * --------------------------------------------
 * Autor: Lucas Vannucchi
 * Data: 25/08/2025
 * Propósito: Representa um investimento em renda variável
 * Descrição:
 * - Estende a classe Investimento
 * - Implementa o metodo calcularRendimento() com rendimento variável de 10%
 * --------------------------------------------
 */


package br.com.devsdoagi.Hackaton.PolimorfismoEAbstracao;

public class RendaVariavel extends Investimento {
    public RendaVariavel(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial * 1.10;
    }
}
