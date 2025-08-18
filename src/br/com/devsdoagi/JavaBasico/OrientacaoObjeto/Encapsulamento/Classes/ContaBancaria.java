package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.Encapsulamento.Classes;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    //Getter para obter o Titutar:
    public String getTitular() {
        return this.titular;
    }

    // Setter para alterar o titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Getter para obter o Numero da conta
    public String getNumeroConta() {
        return this.numeroConta;
    }

    // Setter para alterar o Numero da conta
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Metodo Depositar (double)
    public void depositarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Saldo para deposito invalido!");
        }
    }

    public void sacarSaldo(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo para saque invalido!");
        }
    }

    public void exibirExtrato() {

        System.out.println("Titular: " + getTitular());

        System.out.println("Número da conta: " + getNumeroConta());

        System.out.println("Seu saldo é: R$" + this.saldo + " \n");
    }
}
