package br.com.devsdoagi.JavaBasico.IfAndElse.Exercicios;

import java.util.Scanner;

/*
Autor: Lucas Rafael Custodio Vannucchi
Exercicio para praticar If e Else.
 */

public class Exercicio03 {
    // Exercicio 03
    public static void main(String[] args) {
        float imc, peso, altura;

        Scanner alt = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        altura = alt.nextFloat();

        Scanner ps = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        peso = ps.nextFloat();

        imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.printf("De acordo com sua altura cm:%.2f e seu peso Kg:%.2f, o seu IMC é %.2f, sua classificação é MAGREZA!", altura, peso, imc);
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.printf("De acordo com sua altura cm:%.2f e seu peso Kg:%.2f, o seu IMC é %.2f, sua classificação é NORMAL!", altura, peso, imc);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("De acordo com sua altura cm:%.2f e seu peso Kg:%.2f, o seu IMC é %.2f, sua classificação é SOBREPESO!", altura, peso, imc);
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.printf("De acordo com sua altura cm:%.2f e seu peso Kg:%.2f, o seu IMC é %.2f, sua classificação é OBESIDADE!", altura, peso, imc);
        } else {
            System.out.printf("De acordo com sua altura cm:%.2f e seu peso Kg:%.2f, o seu IMC é %.2f, sua classificação é OBESIDADE GRAVE!", altura, peso, imc);
        }
    }
}
