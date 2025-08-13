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
}
