package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.MiniHackaton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private List<Transacao> transacoes;
    private int contadorTransacoes = 0;

    private static int contadorContas = 1000;
    private static Map<Integer, Conta> contas = new HashMap<>();

    public Conta(Cliente titular) {
        this.numero = ++contadorContas;
        this.titular = titular;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
        contas.put(numero, this);
    }

    public int getNumero() { return numero; }
    public Cliente getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    private void registrarTransacao(String tipo, double valor) {
        contadorTransacoes++;
        Transacao t = new Transacao(contadorTransacoes, numero, tipo, valor);
        transacoes.add(t);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            registrarTransacao("Depósito", valor);
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            registrarTransacao("Saque", valor);
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.saldo += valor;
            registrarTransacao("Transferência enviada", valor);
            destino.registrarTransacao("Transferência recebida", valor);
            System.out.println("Transferência concluída!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void mostrarExtrato() {
        System.out.println("\n=== Extrato da Conta " + numero + " ===");
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            transacoes.forEach(System.out::println);
        }
    }


    public static void cadastrarConta(Scanner sc) {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = Cliente.buscarPorCpf(cpf);
        if (cliente != null) {
            Conta conta = new Conta(cliente);
            System.out.println("Conta criada com sucesso! Número: " + conta.getNumero());
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public static Conta buscarConta(int numero) {
        return contas.get(numero);
    }

    public static void depositar(Scanner sc) {
        System.out.print("Número da conta: ");
        int num = Integer.parseInt(sc.nextLine());
        Conta conta = buscarConta(num);
        if (conta != null) {
            System.out.print("Valor do depósito: ");
            double valor = Double.parseDouble(sc.nextLine());
            conta.depositar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void sacar(Scanner sc) {
        System.out.print("Número da conta: ");
        int num = Integer.parseInt(sc.nextLine());
        Conta conta = buscarConta(num);
        if (conta != null) {
            System.out.print("Valor do saque: ");
            double valor = Double.parseDouble(sc.nextLine());
            conta.sacar(valor);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void transferir(Scanner sc) {
        System.out.print("Número da conta origem: ");
        int origem = Integer.parseInt(sc.nextLine());
        System.out.print("Número da conta destino: ");
        int destino = Integer.parseInt(sc.nextLine());

        Conta contaOrigem = buscarConta(origem);
        Conta contaDestino = buscarConta(destino);

        if (contaOrigem != null && contaDestino != null) {
            System.out.print("Valor da transferência: ");
            double valor = Double.parseDouble(sc.nextLine());
            contaOrigem.transferir(contaDestino, valor);
        } else {
            System.out.println("Conta origem ou destino não encontrada.");
        }
    }

    public static void consultarSaldo(Scanner sc) {
        System.out.print("Número da conta: ");
        int num = Integer.parseInt(sc.nextLine());
        Conta conta = buscarConta(num);
        if (conta != null) {
            System.out.println("Saldo: R$ " + String.format("%.2f", conta.getSaldo()));
        } else {
            System.out.println("Conta não encontrada.");
        }
    }
}
