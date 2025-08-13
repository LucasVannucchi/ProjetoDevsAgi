package br.com.devsdoagi.JavaBasico.Vetores.Exercicios;

import java.util.Scanner;

/*Autor: Lucas Rafael Custódio Vannucchi.
Descrição: Lista de exercicios Vetores Unidimencional.
Data: 11/08/2025
 */

public class Exercicio02 {
    public static double[] variacaoDiaria(double[] precos) {
        double[] variacoes = new double[precos.length - 1];
        for (int i = 1; i < precos.length; i++) {
            variacoes[i - 1] = ((precos[i] - precos[i - 1]) / precos[i - 1]) * 100;
        }
        return variacoes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias que queira saber sua variação: ");
        int n = sc.nextInt();
        double[] precos = new double[n];

        System.out.println("Digite seus valores: ");
        for (int i = 0; i < precos.length; i++) {
            precos[i] = sc.nextDouble();
        }

        double[] var = variacaoDiaria(precos);
        for (double v : var) {
            System.out.printf("%.2f%% ", v);
        }
    }
}
