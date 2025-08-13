package br.com.devsdoagi.IfAndElse;
import java.util.Scanner;

public class AulaIfElse {

    //EXEMPLO DE IF e ELSE:

        public static void main(String[] args) {
        int idade;

        Scanner nm = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = nm.nextInt();
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}