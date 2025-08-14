package br.com.devsdoagi.JavaBasico.Vetores.Exercicios;

import java.util.Scanner;

/*Autor: Lucas Rafael Custódio Vannucchi.
Descrição: Lista de exercicios Vetores Unidimencional.
Data: 11/08/2025
 */

public class Exercicio06 {
    public static int[] primeiraTrincaAlta(double[] precos) {
        for (int dias = 1; dias <= 7; dias++) {
            if (precos[dias] < precos[dias + 1] && precos[dias + 1] < precos[dias + 2]) {
                return new int[]{dias, dias + 1, dias + 2};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valor = new double[10];

        System.out.println("Digite 10 valores de preço:");

        for (int i = 0; i <= 9; i++) {
            System.out.print("Preço: ");
            valor[i] = scanner.nextDouble();
        }

        int[] resultado = primeiraTrincaAlta(valor);

        if (resultado != null) {
            System.out.println("Trinca encontrada nos índices: " + resultado[0] + ", " + resultado[1] + ", " + resultado[2]);
        } else {
            System.out.println("Nenhuma trinca crescente encontrada.");
        }

        scanner.close();
    }
}
