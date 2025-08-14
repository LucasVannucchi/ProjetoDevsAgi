package br.com.devsdoagi.Hackaton.MatrizesVetores;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;

    /*
    Autores: Gustavo Henrique, João Menezes, Lucas Vannucchi, Osmair Coelho, Pedro Eduardo
    Data: 14/08/2025
    Descrição: Neste hackathon, os participantes devem desenvolver, em equipe, um sistema em Java estruturado (sem orientação a objetos)
    com interface via terminal (modo console), capaz de simular o planejamento de uma aposentadoria privada. O desafio foca no uso de
    métodos estáticos, vetores e matrizes, exigindo lógica de programação e organização do código.
     */

public class SimuladoDePrevidênciaPrivada {

    static int idadeAtual, idadeAposentadoria;
    static double contribuicaoMensal;
    static double[] taxasAnuais;
    static double[][] cenarios;

    public static void main(String[] args) {
        boolean encerrar = false;
        Scanner sc = new Scanner(System.in);

        while (!encerrar) {
            System.out.println("\n====================================");
            System.out.println("        💻 Hackaton Turma 4 💻      ");
            System.out.println("====================================");
            System.out.println(" [1] 📥 Entrada de dados");
            System.out.println(" [2] 📊 Cálculo do saldo acumulado");
            System.out.println(" [3] 📈 Projeção de Todos os Cenários");
            System.out.println(" [4] 💹 Renda Mensal na Aposentadoria");
            System.out.println(" [5] 👥 Exibir integrantes");
            System.out.println("------------------------------------");
            System.out.println(" [0] ❌ Encerrar o sistema");
            System.out.println("====================================");
            System.out.print("➡ Escolha uma opção: ");

            int controle = sc.nextInt();

            switch (controle) {
                case 1:
                    entradaDeDados(sc);
                    break;
                case 2:
                    calcularSaldoAcumulado();
                    break;
                case 3:
                    exibirCenario();
                    break;
                case 4:
                    exibirRendaMensalApostentadoria();
                    break;
                case 5:
                    exibirIntegrantes();
                    break;
                case 0:
                    encerrar = true;
                    System.out.println("Encerrando o sistema... 👋");
                    break;
                default:
                    System.out.println("⚠ Opção inválida! Tente novamente.");
            }
        }

        sc.close();
    }

    public static void entradaDeDados(Scanner scanner) {
        System.out.print("Digite a idade atual: ");
        idadeAtual = scanner.nextInt();

        System.out.print("Digite a idade de aposentadoria: ");
        idadeAposentadoria = scanner.nextInt();

        System.out.print("Digite a contribuição mensal: ");
        contribuicaoMensal = scanner.nextDouble();

        System.out.print("Digite o número de cenários (quantidade de taxas mensais): ");
        int numCenarios = scanner.nextInt();

        taxasAnuais = new double[numCenarios];
        for (int i = 0; i < numCenarios; i++) {
            System.out.printf("Digite a taxa mensal para o cenário %d (em %%): ", i + 1);
            double taxaMensalPercentual = scanner.nextDouble();
            double taxaMensalDecimal = taxaMensalPercentual / 100.0;
            double taxaAnual = Math.pow(1 + taxaMensalDecimal, 12) - 1;
            taxasAnuais[i] = taxaAnual;
            System.out.printf("Taxa mensal informada: %.2f%%, equivalente à taxa anual de: %.2f%%%n", taxaMensalPercentual, taxaAnual * 100);
        }

        cenarios = gerarMatrizCenarios(idadeAtual, idadeAposentadoria, contribuicaoMensal, taxasAnuais);
        System.out.println("✅ Dados inseridos com sucesso!");
    }

    public static void calcularSaldoAcumulado() {
        if (taxasAnuais == null || taxasAnuais.length == 0) {
            System.out.println("⚠️ Nenhum dado inserido ainda. Por favor, escolha a opção 1 primeiro.");
            return;
        }

        int anos = idadeAposentadoria - idadeAtual;

        System.out.println("\n📊 Resultados dos cenários com cálculo detalhado (SaldoFinal):\n");

        for (int i = 0; i < taxasAnuais.length; i++) {
            System.out.println("Cenário " + (i + 1) + " - Taxa anual: " + String.format("%.2f", taxasAnuais[i] * 100) + "%");

            double[][] resultado = SaldoFinal(anos, taxasAnuais[i] * 100, contribuicaoMensal); // taxa em %

            for (int j = 0; j < resultado.length; j++) {
                double saldoFinalAno = resultado[j][11]; // Último mês do ano
                System.out.println("Ano " + (j + 1) + ": R$ " + formatarCentena(saldoFinalAno));
            }

            System.out.println();
        }
    }

    public static double[][] SaldoFinal(int anos, double taxaAnual, double contribuicaoMeses) {
        double saldoAcumulado = 0;
        double[][] saldoAnual = new double[anos][12];
        double taxaMensal = taxaAnual / 12;

        for (int i = 0; i < anos; i++) {
            for (int j = 0; j < 12; j++) {
                saldoAcumulado += contribuicaoMeses;
                saldoAcumulado += saldoAcumulado * (taxaMensal / 100);
                saldoAnual[i][j] = saldoAcumulado;
            }
        }

        return saldoAnual;
    }

    public static void exibirCenario() {
        if (cenarios == null || taxasAnuais == null) {
            System.out.println("⚠️ Dados não disponíveis. Realize a entrada de dados primeiro (opção 1).");
            return;
        }

        System.out.println("\n🔮 Projeção de Todos os Cenários:\n");

        for (int i = 0; i < cenarios.length; i++) {
            System.out.println("📊 Cenário " + (i + 1) + ":");
            System.out.println("Taxa anual: " + String.format("%.2f", taxasAnuais[i] * 100) + "%");

            for (int j = 0; j < cenarios[i].length; j++) {
                System.out.println("  Ano " + (j + 1) + ": R$ " + formatarCentena(cenarios[i][j]));
            }

            System.out.println(); // linha em branco entre cenários
        }
    }

    public static void exibirIntegrantes() {
        System.out.println("\n👥 Integrantes da equipe:");
        System.out.println("- Gustavo Henrique");
        System.out.println("- João Menezes");
        System.out.println("- Lucas Vannucchi");
        System.out.println("- Osmair Coelho");
        System.out.println("- Pedro Eduardo");
    }

    public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasAnuais) {
        int anosContribuicao = idadeAposentadoria - idadeAtual;
        double[][] matrizCenarios = new double[taxasAnuais.length][anosContribuicao];

        for (int i = 0; i < taxasAnuais.length; i++) {
            double taxaMensal = Math.pow(1 + taxasAnuais[i], 1.0 / 12) - 1;

            for (int j = 0; j < anosContribuicao; j++) {
                int meses = (j + 1) * 12;
                matrizCenarios[i][j] = contribuicaoMensal * (Math.pow(1 + taxaMensal, meses) - 1) / taxaMensal;
            }
        }
        return matrizCenarios;
    }

    public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasAnuais, int expectativaVida) {
        int mesesDeExpectativa = expectativaVida * 12;
        double[] rendaMensalPorCenario = new double[matrizCenarios.length];

        for (int i = 0; i < matrizCenarios.length; i++) {
            double saldoFinal = matrizCenarios[i][matrizCenarios[i].length - 1]; // último valor do cenário
            double taxaMensal = Math.pow(1 + taxasAnuais[i], 1.0 / 12) - 1;

            double rendaMensal = saldoFinal * (taxaMensal / (1 - Math.pow(1 + taxaMensal, -mesesDeExpectativa)));
            rendaMensalPorCenario[i] = rendaMensal;
        }

        return rendaMensalPorCenario;
    }


    public static void exibirRendaMensalApostentadoria() {
        if (cenarios == null || taxasAnuais == null) {
            System.out.println("⚠️ Dados não disponíveis. Realize a entrada de dados primeiro (opção 1).");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a expectativa de vida após aposentadoria (em anos): ");
        int expectativaVida = scanner.nextInt();

        double[] rendas = calcularRendaMensal(cenarios, taxasAnuais, expectativaVida);

        System.out.println("\n💸 Renda Mensal Estimada por Cenário:");

        for (int i = 0; i < rendas.length; i++) {
            System.out.println("Cenário " + (i + 1) + ": R$ " + formatarCentena(rendas[i]));
        }
    }

    public static String formatarCentena(double numero) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(numero);
    }
}
