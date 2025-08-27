package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.Exercicio01;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Criando o conjunto de contas
        Set<Integer> contas = new HashSet<>();

        // Adicionando contas diretamente
        adicionarConta(contas, 1001);
        adicionarConta(contas, 1002);
        adicionarConta(contas, 1003);
        adicionarConta(contas, 1001); // Tentativa de duplicar

        // Verificando contas
        System.out.println("Conta 1002 existe? " + (existeConta(contas, 1002) ? "Sim" : "Não"));
        System.out.println("Conta 2000 existe? " + (existeConta(contas, 2000) ? "Sim" : "Não"));

        // Exibindo todas as contas
        exibirContas(contas);
    }

    // Métodos utilitários

    public static void adicionarConta(Set<Integer> contas, int numeroConta) {
        if (contas.add(numeroConta)) {
            System.out.println("Conta " + numeroConta + " adicionada com sucesso.");
        } else {
            System.out.println("Conta " + numeroConta + " já existe.");
        }
    }

    public static boolean existeConta(Set<Integer> contas, int numeroConta) {
        return contas.contains(numeroConta);
    }

    public static void exibirContas(Set<Integer> contas) {
        System.out.println("\nContas cadastradas:");
        for (int conta : contas) {
            System.out.println("Conta: " + conta);
        }
    }
}

