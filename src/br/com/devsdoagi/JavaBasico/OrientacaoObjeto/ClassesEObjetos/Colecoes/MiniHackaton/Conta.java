package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.MiniHackaton;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numeroConta;
    private double saldo;
    private List<Transacao> transacoes;
    private Cliente cliente; // Relacionamento da conta com cliente

    public Conta(int numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0;
        this.transacoes = new ArrayList<>();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacao("Depósito", valor, numeroConta, numeroConta));
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            transacoes.add(new Transacao("Saque", valor, numeroConta, numeroConta));
            return true;
        } else {
            return false;
        }
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    @Override
    public String toString() {
        return "Conta nº " + numeroConta + " | Titular: " + cliente.getNome() + " | Saldo: R$ " + String.format("%.2f", saldo);
    }
}
