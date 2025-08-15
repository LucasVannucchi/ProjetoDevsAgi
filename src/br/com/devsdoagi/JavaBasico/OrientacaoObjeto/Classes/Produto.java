package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.Classes;

import java.util.Scanner;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade = 0;

    public void adicionarEstoque(int quantidade) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Produto que deseja adicionar: ");
        nome = sc.next();

        System.out.print("Digite a quantidade que deseja adicionar: ");
        this.quantidade += quantidade;

        System.out.print("Digite o valor do Produto: R$ ");
        preco = sc.nextDouble();

        System.out.println("Estoque atualizado com sucesso!");
    }

    public void removerEstoque(int quantidade) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do produto que deseja remover: ");
            String nomeRemover = sc.nextLine();

            if (this.nome.equalsIgnoreCase(nomeRemover)) {
                System.out.println("Nome correto!");
                break;
            } else {
                System.out.println("Nome incorreto! Favor inserir o nome de produto correto.");
            }
        }

        while (true) {
            System.out.print("Digite a quantidade que deseja remover: ");

            if (sc.hasNextInt()) {
                int qtdRemover = sc.nextInt();

                if (qtdRemover <= quantidade && qtdRemover > 0) {
                    this.quantidade -= qtdRemover;
                    System.out.println("Estoque atualizado com sucesso!");
                    break;
                } else {
                    System.out.println("Quantidade inválida ou insuficiente. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.next();
            }
        }
    }

    public void mostrarEstoque() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Seu estoque tem: " + this.quantidade + " quantidades");
        System.out.println("O valor do produto é: R$ " + this.preco);
    }
}
