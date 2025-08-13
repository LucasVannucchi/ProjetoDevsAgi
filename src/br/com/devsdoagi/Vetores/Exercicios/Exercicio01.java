package br.com.devsdoagi.Vetores.Exercicios;

import java.util.Scanner;

/*Autor: Lucas Rafael Custódio Vannucchi.
Descrição: Lista de exercicios Vetores Unidimencional.
Data: 11/08/2025
 */

public class Exercicio01 {
    public static double maiorPreco(double[] precos) {
        double maior = precos[0];
        for (double p : precos) {
            if (p > maior) maior = p;
        }
        return maior;
    }

    public static double menorPreco(double[] precos) {
        double menor = precos[0];
        for (double p : precos) {
            if (p < menor) menor = p;
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes que irá inserir os seus valores");
        int n = sc.nextInt();

        double[] precos = new double[n];

        System.out.println("Digite seus valores");
        for (int i = 0; i < precos.length; i++) {
            precos[i] = sc.nextDouble();
        }

        System.out.println(maiorPreco(precos));
        System.out.println(menorPreco(precos));
    }
}
