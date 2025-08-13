package br.com.devsdoagi.JavaBasico.OperacoesMat;

   /*
    Autor: Lucas Vannucchi
   Descrição: Os codigos abaixo servem para treinar o que está sendo passado em sala de aula.
   Data: 08/08/2025.
    */

public class Exercicio03 {
    public static float calcularCrescimento(float a, float b) {
        return ((b - a) / a) * 100;
    }

    public static void main(String[] args) {
        float resultado = calcularCrescimento(100f, 115f);
        System.out.printf("Crescimento: R$ %.2f Reais.", resultado);
    }
}
