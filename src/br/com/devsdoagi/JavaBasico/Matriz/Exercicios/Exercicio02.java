package br.com.devsdoagi.JavaBasico.Matriz.Exercicios;

public class Exercicio02 {
    public static double encontrarMaiorValor(double[][] matriz) {
        double maior = matriz[0][0];
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz.length; c++) {
                if (matriz[l][c] > maior) {
                    maior = matriz[l][c];
                }
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        double[][] mat = {{100, 400, 200, 100},
                {100, 1000, 200, 100},
                {100, 1000.10, 250, 100}
        };

        System.out.println("Maior divida: " + encontrarMaiorValor(mat));
    }
}
