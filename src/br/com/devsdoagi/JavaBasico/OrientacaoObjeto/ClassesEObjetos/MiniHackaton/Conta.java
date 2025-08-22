package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.MiniHackaton;

abstract class Conta implements OperacoesBancarias{

    private String numeroConta;
    protected double saldo;
    private Cliente titular;

    public Conta(String numeroConta, double saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
        else {
            System.out.println("Valor para deposito precisa ser maior que 0!");
        }
    }

    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo -= valor;
        }
        else {
            System.out.println("Valor para Saque indisponivel!");
        }
    }

    public abstract void aplicarJuros(double saldo);

    public String getNumeroConta() { return numeroConta; }

    public double getSaldo() { return saldo; }

    public Cliente getTitular() { return titular; }
}
