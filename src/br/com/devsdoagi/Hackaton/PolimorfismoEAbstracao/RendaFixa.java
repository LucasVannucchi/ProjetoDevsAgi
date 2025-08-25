/*
 * --------------------------------------------
 * Autor: Lucas Vannucchi
 * Data: 25/08/2025
 * Propósito: Representa um investimento em renda fixa
 * Descrição:
 * - Estende a classe Investimento
 * - Implementa o metodo calcularRendimento() com rendimento fixo de 5%
 * --------------------------------------------
 */


package br.com.devsdoagi.Hackaton.PolimorfismoEAbstracao;

public class RendaFixa extends Investimento {

    public RendaFixa(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial * 1.05;
    }
}
