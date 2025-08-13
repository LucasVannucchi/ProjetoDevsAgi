package br.com.devsdoagi.OperacoesMat;

   /*
    Autor: Lucas Vannucchi
   Descrição: Os codigos abaixo servem para treinar o que está sendo passado em sala de aula.
   Data: 08/08/2025.
    */

public class Exercicio05 {
    public static char compararAtivos(float a, float b) {
        if (a > b) {
            return 'a';
        } else {
            return 'b';
        }
    }

    public static void main(String[] args) {
        char resultado = compararAtivos(120f, 115f);
        System.out.printf("O maior ativo é: %c.%n.", resultado);
    }
}
