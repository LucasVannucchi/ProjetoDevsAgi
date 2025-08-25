/*
 * --------------------------------------------
 * Autor: Lucas Vannucchi
 * Data: 25/08/2025
 * Propósito: Classe abstrata base para investimentos
 * Descrição:
 * - Contém o atributo valorInicial
 * - Possui construtor para inicialização
 * - Declara o metodo abstrato calcularRendimento()
 * --------------------------------------------
 */

package br.com.devsdoagi.Hackaton.PolimorfismoEAbstracao;

public abstract class Investimento {
    protected double valorInicial;

    public Investimento(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public abstract double calcularRendimento();
}
