package br.com.devsdoagi.Hackaton.Colecoes;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaInvestimento sistema = new SistemaInvestimento();

        int opcao = -1;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Adicionar investimento");
            System.out.println("3 - Listar investimentos de um cliente");
            System.out.println("4 - Relatório geral");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1 -> sistema.cadastrarCliente(sc);
                    case 2 -> sistema.adicionarInvestimento(sc);
                    case 3 -> sistema.listarInvestimentos(sc);
                    case 4 -> sistema.relatorioGeral();
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                sc.nextLine();
            }

        } while (opcao != 0);

        sc.close();
    }
}
