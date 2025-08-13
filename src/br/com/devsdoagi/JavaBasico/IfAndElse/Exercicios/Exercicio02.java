package br.com.devsdoagi.JavaBasico.IfAndElse.Exercicios;
import java.util.Scanner;

/*
Autor: Lucas Rafael Custodio Vannucchi
Exercicio para praticar If e Else.
 */

public class Exercicio02 {
    // Exercicio 02
    public static void main(String[] args) {
        int numero;

        Scanner num = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = num.nextInt();

        if (numero % 2 == 0){
            System.out.printf("O número %d é Par", numero);
        } else {
            System.out.printf("O número %d é impar", numero);
        }
    }
}
