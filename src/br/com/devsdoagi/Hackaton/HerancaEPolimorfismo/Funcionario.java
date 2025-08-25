/*
 * Autor: Lucas Vannucchi
 * Data: 25/08/2025
 * Descrição: Classe base que representa um funcionário genérico com nome e salário.
 * Contém validações e metodo para retorno de bônus (sobrescrito nas subclasses).
 */

package br.com.devsdoagi.Hackaton.HerancaEPolimorfismo;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero.");
        }
        this.salario = salario;

    }

    public double getBonus() {
        return 0;
    }
}
