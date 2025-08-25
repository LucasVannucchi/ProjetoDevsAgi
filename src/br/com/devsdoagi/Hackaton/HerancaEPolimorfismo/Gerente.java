/*
 * Autor: Lucas Vannucchi
 * Data: 25/08/2025
 * Descrição: Classe que representa um Gerente, herdando de Funcionario.
 * Sobrescreve o metodo getBonus para retornar o bônus específico da função.
 */


package br.com.devsdoagi.Hackaton.HerancaEPolimorfismo;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 2000;
    }
}
