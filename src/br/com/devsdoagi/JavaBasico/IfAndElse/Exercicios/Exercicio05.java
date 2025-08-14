package br.com.devsdoagi.JavaBasico.IfAndElse.Exercicios;

import java.util.Scanner;

/*
Autor: Lucas Rafael Custodio Vannucchi
Exercicio para praticar If e Else.
 */

public class Exercicio05 {
    // Exercicio 05
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota final: ");
        double nota = sc.nextDouble();
        if (nota >= 6) {
            System.out.println("Aprovado");
        } else if (nota >= 4) {
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }
    }
}
