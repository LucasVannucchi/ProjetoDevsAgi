package br.com.devsdoagi.Matriz;

/*
Aulas de Vetores Bidimencional (Matrizes)
 */

public class AulaMatrizes {
    public static void main(String[] args) {

        int[][] valores = {{30, 20, 40, 23}, {2, 5, 6, 2}};
        valores[1][2] = 10;

        System.out.println(valores[0][2]);


        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }


        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 4; c++) {
                valores[l][c] = 0;
                System.out.println(valores[l][c]);
            }
        }
    }
}
