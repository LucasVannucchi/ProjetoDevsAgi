package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.MiniHackaton;

public class ContaCorrente extends Conta{

    public ContaCorrente(String numeroConta, double saldo, Cliente titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public void aplicarJuros(double saldo){
        System.out.println("Conta corrente não aplica juros!");
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
