package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.Exercicio02;

import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void adicionarProduto(Set<String> produtos, String nomeProduto) {
        if (produtos.contains(nomeProduto)) {
            System.out.println("Produto já adicionado: " + nomeProduto);
        } else {
            produtos.add(nomeProduto);
            System.out.println("Produto adicionado: " + nomeProduto);
        }
    }

    public static void exibirProdutos(Set<String> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto adquirido.");
        } else {
            System.out.println("Produtos adquiridos:");
            for (String produto : produtos) {
                System.out.println("- " + produto);
            }
        }
    }

    public static void main(String[] args) {
        Set<String> produtosDoJoao = new HashSet<>();

        adicionarProduto(produtosDoJoao, "CDB");
        adicionarProduto(produtosDoJoao, "LCI");
        adicionarProduto(produtosDoJoao, "CDB");

        exibirProdutos(produtosDoJoao);
    }
}

