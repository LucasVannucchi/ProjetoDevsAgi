package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Constructor.Exercicios.Classes;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria() {
        this.titular = null;
        this.numeroConta = null;
        this.saldo = 0;
    }

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {

        System.out.println("Titular: " + titular);

        System.out.println("Numero da conta: " + numeroConta);

        System.out.println("Saldo: R$" + saldo + "\n");

    }

}
