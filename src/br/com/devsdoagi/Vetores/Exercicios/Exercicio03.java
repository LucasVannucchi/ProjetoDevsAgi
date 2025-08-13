package br.com.devsdoagi.Vetores.Exercicios;

import java.util.Scanner;

/*Autor: Lucas Rafael Custódio Vannucchi.
Descrição: Lista de exercicios Vetores Unidimencional.
Data: 11/08/2025
 */

public class Exercicio03 {
    public static double totalInvestido(double[] carteira) {
        double total = 0;
        for (double c : carteira) total += c;
        return total;
    }

    public static double[] percentualPorAcao(double[] carteira) {
        double total = totalInvestido(carteira);
        double[] percentuais = new double[carteira.length];
        for (int i = 0; i < carteira.length; i++) {
            percentuais[i] = (carteira[i] / total) * 100;
        }
        return percentuais;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas vezes irá investir? ");
        int n = sc.nextInt();
        double[] carteira = new double[n];

        System.out.println("Digite os valores a ser investido: ");
        for (int i = 0; i < carteira.length; i++) {
            carteira[i] = sc.nextDouble();
        }
        System.out.println("Total investido: R$ " + totalInvestido(carteira));

        for (double p : percentualPorAcao(carteira)) {
            System.out.printf("%.2f%% ", p);
        }
    }
}