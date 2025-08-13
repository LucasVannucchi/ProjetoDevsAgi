package br.com.devsdoagi.OperacoesMat;

   /*
    Autor: Lucas Vannucchi
   Descrição: Os codigos abaixo servem para treinar o que está sendo passado em sala de aula.
   Data: 08/08/2025.
    */

public class Exercicio04 {
    public static float calcularMediaMovel(float a, float b, float c, float d, float e, float f) {
        return (a + b + c + d + e) / f;
    }

    public static void main(String[] args) {
        float resultado = calcularMediaMovel(100f, 115f, 103, 105, 108, 3);
        System.out.printf("Sua Media movel é: R$ %.2f Reais.", resultado);
    }
}
