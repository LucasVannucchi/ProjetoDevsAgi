package br.com.devsdoagi.JavaBasico.OperacoesMat;

   /*
    Autor: Lucas Vannucchi
   Descrição: Os codigos abaixo servem para treinar o que está sendo passado em sala de aula.
   Data: 08/08/2025.
    */

public class Exercicio02 {
    public static float calcularJurosSimples(float a, float b, float c) {
        return a * b * (c * 12);
    }

    public static void main(String[] args) {
        float resultado = calcularJurosSimples(100f, 0.05f, 2f);
        System.out.printf("Montante final R$ %.2f Reais.", resultado);
    }
}
