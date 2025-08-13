package br.com.devsdoagi.JavaBasico.OperacoesMat;

   /*
    Autor: Lucas Vannucchi
   Descrição: Os codigos abaixo servem para treinar o que está sendo passado em sala de aula.
   Data: 08/08/2025.
    */

public class Exercicio01 {
    public static float converterMoeda(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        float resultado = converterMoeda(100f, 4.50f);
        System.out.printf("Você possui: US$ %.2f dolares", resultado);
    }
}
