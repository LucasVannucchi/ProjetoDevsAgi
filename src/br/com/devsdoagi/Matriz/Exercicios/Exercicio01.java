package br.com.devsdoagi.Matriz.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void preencherMatriz(double[][] matriz) {
        Scanner sc = new Scanner(System.in);

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print("Digite o valor: ");
                matriz[l][c] = sc.nextDouble();
            }
        }
    }

    public static double calcularSomaTotal(double[][] matriz) {
        double soma = 0;
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                soma += matriz[l][c];
            }
        }
        return soma;
    }

    public static void exibirMatriz(double[][] matriz){
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] matriz = new double[2][2];
        double total;

        preencherMatriz(matriz);
        total=calcularSomaTotal(matriz);
        exibirMatriz(matriz);

        System.out.println("Total de Receitas e Despesas: " + total);
    }
}