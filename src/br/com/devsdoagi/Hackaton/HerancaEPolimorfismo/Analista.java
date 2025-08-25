/*
 * Autor: Lucas Vannucchi
 * Data: 25/08/2025
 * Descrição: Classe que representa um Analista, herdando de Funcionario.
 * Sobrescreve o metodo getBonus para retornar o bônus específico da função.
 */


package br.com.devsdoagi.Hackaton.HerancaEPolimorfismo;

public class Analista extends Funcionario{

    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 1000;
    }
}
