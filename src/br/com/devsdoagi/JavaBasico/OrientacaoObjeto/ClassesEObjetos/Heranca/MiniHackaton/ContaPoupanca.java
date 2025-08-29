package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Heranca.MiniHackaton;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numeroConta, double saldo, Cliente titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void aplicarJuros(double saldo) {
        this.saldo = ((saldo + saldo) * 1.01);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }
}
