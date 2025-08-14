package br.com.devsdoagi.JavaBasico.Vetores.Exercicios;

import java.util.Scanner;

/*Autor: Lucas Rafael Custódio Vannucchi.
Descrição: Lista de exercicios Vetores Unidimencional.
Data: 11/08/2025
 */

public class Exercicio04 {
    public static double[] lucroPorAtivo(double[] compra, double[] venda) {
        double[] lucro = new double[compra.length];
        for (int i = 0; i < compra.length; i++) {
            lucro[i] = venda[i] - compra[i];
        }
        return lucro;
    }

    public static double lucroTotalDosAtivos(double[] compra, double[] venda) {
        double[] lucro = lucroPorAtivo(compra, venda);
        double total = 0;
        for (double l : lucro) {
            total += l;
        }
        return total;
    }

    public static double calcularImposto(double lucroTotal) {
        if (lucroTotal < 5000) {
            return lucroTotal * 0.15;
        }
        if (lucroTotal >= 5000 && lucroTotal < 10000) {
            return lucroTotal * 0.175;
        }
        if (lucroTotal >= 10000 && lucroTotal < 30000) {
            return lucroTotal * 0.20;
        } else {
            return lucroTotal * 0.225;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos ativos serão comprados? ");
        int c = sc.nextInt();

        double[] compra = new double[c];
        double[] venda = new double[c];

        System.out.println("Digite o valor da compra do ativo: ");
        for (int i = 0; i < compra.length; i++) {
            System.out.println("Compra do imovel " + (i + 1) + ": ");
            compra[i] = sc.nextDouble();
        }

        System.out.println("Digite o valor da venda do ativo: ");
        for (int i = 0; i < venda.length; i++) {
            System.out.println("Venda do imovel " + (i + 1) + ": ");
            venda[i] = sc.nextDouble();
        }

        double[] resultado = lucroPorAtivo(compra, venda);

        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("Ativo %d: %.2f\n", (i + 1), resultado[i]);
        }

        double total = lucroTotalDosAtivos(compra, venda);
        System.out.printf("Lucro Total: %.2f\n", total);

        double imposto = calcularImposto(total);
        System.out.printf("Imposto a pagar: R$ %.2f\n", imposto);

        sc.close();
    }
}
