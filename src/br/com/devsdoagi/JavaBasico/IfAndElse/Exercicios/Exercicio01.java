package br.com.devsdoagi.JavaBasico.IfAndElse.Exercicios;
import java.util.Scanner;

/*
Autor: Lucas Rafael Custodio Vannucchi
Exercicio para praticar If e Else.
 */

public class Exercicio01 {
    // Exercicio 01
        public static void main(String[] args) {
        double numero;

        Scanner nb = new Scanner(System.in);
        System.out.println("Digite seu numero: ");
        numero = nb.nextDouble();

        if (numero < 0){
            System.out.printf("O numero digitado %f é negativo:", numero);
        } else if (numero == 0) {
            System.out.printf("O numero digitado %f é igual a 0", numero);
        }
         else {
            System.out.printf("O numero digitado %f é maior que 0", numero);
        }
    }
}
