package br.com.devsdoagi.JavaBasico.IfAndElse.Exercicios;

import java.util.Scanner;

/*
Autor: Lucas Rafael Custodio Vannucchi
Exercicio para praticar If e Else.
 */

public class Exercicio04 {
    // Exercicio 04
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a Média: ");
        double media = sc.nextDouble();
        double diferenca = Math.abs(valor - media);
        double percentual = (diferenca / media) * 100;
        System.out.printf("Diferença de %.2f%% em relação à média. \n", percentual);
    }
}
