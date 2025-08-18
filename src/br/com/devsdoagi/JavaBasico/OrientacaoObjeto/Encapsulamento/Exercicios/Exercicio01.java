package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.Encapsulamento.Exercicios;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.Encapsulamento.Classes.ContaBancaria;

public class Exercicio01 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.exibirExtrato();

        contaBancaria.setTitular("Lucas");
        contaBancaria.setNumeroConta("515.182.318-37");

        contaBancaria.exibirExtrato();

        contaBancaria.depositarSaldo(50);
        contaBancaria.sacarSaldo(20);

        contaBancaria.exibirExtrato();
    }
}
