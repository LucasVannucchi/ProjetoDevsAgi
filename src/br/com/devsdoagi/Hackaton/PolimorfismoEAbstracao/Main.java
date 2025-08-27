/*
 * --------------------------------------------
 * Autor: Lucas Vannucchi
 * Data: 25/08/2025
 * Propósito: Executa o sistema de relatório de investimentos
 * Descrição:
 * - Cria lista de investimentos (RendaFixa e RendaVariavel)
 * - Usa polimorfismo para calcular rendimento
 * - Exibe o valor de cada investimento após rendimento
 * --------------------------------------------
 */

package br.com.devsdoagi.Hackaton.PolimorfismoEAbstracao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos investimentos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Investimento[] investimentos = new Investimento[quantidade];

        System.out.println("\nCadastro de Investimentos:");
        System.out.println("--------------------------");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Investimento " + (i + 1) + ":");
            System.out.print("Digite o valor inicial: R$ ");
            double valor = scanner.nextDouble();

            System.out.println("Escolha o tipo de investimento:");
            System.out.println("1 - Renda Fixa (5%)");
            System.out.println("2 - Renda Variável (10%)");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    investimentos[i] = new RendaFixa(valor);
                    break;
                case 2:
                    investimentos[i] = new RendaVariavel(valor);
                    break;
                default:
                    System.out.println("Opção inválida. Será usado Renda Fixa como padrão.");
                    investimentos[i] = new RendaFixa(valor);
                    break;
            }

            System.out.println();
        }

        System.out.println("Relatório de Rendimentos:");
        System.out.println("--------------------------");


        System.out.println("\nInvestimentos em Renda Fixa:");
        int contadorFixa = 1;
        for (int i = 0; i < quantidade; i++) {

            if (investimentos[i] instanceof RendaFixa) {

                double valorOriginal = investimentos[i].getValorInicial();

                double rendimento = investimentos[i].calcularRendimento();

                System.out.printf("Renda Fixa %d - Valor Inicial: R$ %.2f | Valor após rendimento: R$ %.2f\n",
                        contadorFixa, valorOriginal, rendimento);
                contadorFixa++;
            }
        }

        System.out.println("\nInvestimentos em Renda Variável:");
        int contadorVariavel = 1;
        for (int i = 0; i < quantidade; i++) {
            if (investimentos[i] instanceof RendaVariavel) {
                double valorOriginal = investimentos[i].getValorInicial();
                double rendimento = investimentos[i].calcularRendimento();
                System.out.printf("Renda Variável %d - Valor Inicial: R$ %.2f | Valor após rendimento: R$ %.2f\n",
                        contadorVariavel, valorOriginal, rendimento);
                contadorVariavel++;
            }
        }

        scanner.close();
    }
}