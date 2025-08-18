package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Encapsulamento.Exercicios;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Encapsulamento.Exercicios.Classes.ContaBancaria;

/*Lista de exercicios:
https://docs.google.com/document/d/1GxWX1o2q-3bb6R6hIHd3GfIHrSVJs38G2-y9FM2xJGM/edit?tab=t.0
*/

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
