package br.com.devsdoagi.JavaBasico.Matriz.Exercicios;

public class Exercicio03 {
    public static double[] encontrarMenorPrecoPorProduto(double[][] matriz){
        double menor;
        double[] menorPreco = new double[matriz[0].length];
        for (int p = 0; p < matriz[0].length; p++) {
            menor = matriz[0][p];
            for (int l = 0; l < matriz.length; l++) {
                if (matriz[l][p] < menor){
                    menor = matriz[l][p];
                }
            }
            menorPreco[p] = menor;
        }
        return menorPreco;
    }

    public static void main(String[] args) {
        double[][] matriz = {
                {1000,400.52,100},
                {412, 400.51, 99}
        };

        double[] menorPreco = encontrarMenorPrecoPorProduto(matriz);

        for (int i = 0; i < menorPreco.length; i++) {
            System.out.println("Menor valor do produto " + (i + 1) + ": " + menorPreco[i]);
        }
    }
}