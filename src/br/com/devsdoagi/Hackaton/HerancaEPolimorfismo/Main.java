package br.com.devsdoagi.Hackaton.HerancaEPolimorfismo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gerente gerente = new Gerente(" ", 0);
        Analista analista = new Analista(" ", 0);

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Analista");
            System.out.println("3 - Exibir Gerente");
            System.out.println("4 - Exibir Analista");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    try {
                        System.out.print("Nome do Gerente: ");
                        String nome = scanner.nextLine();
                        gerente.setNome(nome);
                        System.out.print("Salário do Gerente: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        gerente.setSalario(salario);

                        System.out.println("Gerente cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                        scanner.nextLine();
                    }
                }

                case 2 -> {
                    try {
                        System.out.print("Nome do Analista: ");
                        String nome = scanner.nextLine();
                        analista.setNome(nome);
                        System.out.print("Salário do Analista: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        analista.setSalario(salario);

                        System.out.println("Analista cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                        scanner.nextLine();
                    }
                }

                case 3 -> {
                    if (gerente != null) {
                        System.out.println("\n--- Gerente ---");
                        System.out.println("Nome: " + gerente.getNome());
                        System.out.println("Salário: R$ " + gerente.getSalario());
                        System.out.println("Bônus: R$ " + gerente.getBonus());
                    } else {
                        System.out.println("Nenhum gerente cadastrado.");
                    }
                }

                case 4 -> {
                    if (analista != null) {
                        System.out.println("\n--- Analista ---");
                        System.out.println("Nome: " + analista.getNome());
                        System.out.println("Salário: R$ " + analista.getSalario());
                        System.out.println("Bônus: R$ " + analista.getBonus());
                    } else {
                        System.out.println("Nenhum analista cadastrado.");
                    }
                }

                case 0 -> System.out.println("Encerrando o programa...");

                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
