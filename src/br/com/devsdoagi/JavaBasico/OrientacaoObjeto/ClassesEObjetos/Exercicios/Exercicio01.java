package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Exercicios;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Classes.Produto;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();

        boolean encerrar = false;
        Scanner sc = new Scanner(System.in);

        while (!encerrar) {
            System.out.println("\n====================================");
            System.out.println("        💻 Estoque - Mercado 💻      ");
            System.out.println("======================================");
            System.out.println(" [1] 📥 Adicionar Produto");
            System.out.println(" [2] 📊 Remover Produto");
            System.out.println(" [3] 📈 Mostrar Estoque");
            System.out.println("------------------------------------");
            System.out.println(" [0] ❌ Encerrar o sistema");
            System.out.println("====================================");
            System.out.print("➡ Escolha uma opção: ");

            int controle = sc.nextInt();

            switch (controle) {
                case 1:
                    meuProduto.adicionarEstoque();
                    break;
                case 2:
                    meuProduto.removerEstoque();
                    break;
                case 3:
                    meuProduto.mostrarEstoque();
                    break;
                case 0:
                    encerrar = true;
                    System.out.println("Encerrando o sistema... 👋");
                    break;
                default:
                    System.out.println("⚠ Opção inválida! Tente novamente.");
            }
        }


    }
}
