package br.com.devsdoagi.Scanner;

import java.util.Scanner;

public class AulaScanner {
    public static void main(String[] args) {
        int idade;
        String letra;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.printf("Você tem %d anos. \n", idade);

        Scanner lt = new Scanner(System.in);
        System.out.print("Digite sua letra: ");
        letra = lt.nextLine();
        System.out.printf("Sua letra é %s. \n", letra);
    }
}
