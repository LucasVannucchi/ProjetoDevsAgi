package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.Exercicio03;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial) {
        if (!contas.containsKey(numeroConta)) {
            contas.put(numeroConta, saldoInicial);
            System.out.println("Conta adicionada: " + numeroConta + ", com o saldo de: R$" + saldoInicial);
        } else {
            System.out.println("Conta " + numeroConta + " já existe. Não foi adicionada.");
        }
    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor) {
        if (contas.containsKey(numeroConta)) {
            double saldoAtual = contas.get(numeroConta);
            contas.put(numeroConta, saldoAtual + valor);
            System.out.println("Depósito de R$ " + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Conta " + numeroConta + " não encontrada. Depósito não realizado.");
        }
    }

    public static void exibirSaldos(Map<String, Double> contas) {
        if (contas.isEmpty()) {
            System.out.println("Nenhum saldo no sistema.");
        } else {
            System.out.println("Saldos atualizados:");
            for (Map.Entry<String, Double> conta : contas.entrySet()) {
                System.out.println("- Conta: " + conta.getKey() + " | Saldo: R$ " + conta.getValue());
            }
        }
    }

    public static void imprimirMenu(String titulo) {
        System.out.println("\n==============================");
        System.out.println(">> " + titulo.toUpperCase());
        System.out.println("==============================");
    }

    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();

        imprimirMenu("Adicionando clientes");
        adicionarCliente(contas, "12345", 1000.0);
        adicionarCliente(contas, "67890", 2500.0);
        adicionarCliente(contas, "12345", 3000.0);

        imprimirMenu("Realizando depósitos");
        depositar(contas, "12345", 500.0);
        depositar(contas, "99999", 200.0);

        imprimirMenu("Exibindo saldos");
        exibirSaldos(contas);
    }
}
