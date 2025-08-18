package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Constructor.Exercicios;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Constructor.Exercicios.Classes.ContaBancaria;

public class Exercicio {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria();
        cb1.exibirInformacoes();

        ContaBancaria cb2 = new ContaBancaria("Lucas", "98987623");
        cb2.exibirInformacoes();

        ContaBancaria cb3 = new ContaBancaria("Lucas", "98987623", 5000);
        cb3.exibirInformacoes();
    }
}
