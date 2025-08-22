package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Interface.Exercicio2;

public class Main {
    public static void main(String[] args) {
        IDescontavel prodDesc1 = new ProdutoComum();
        IDescontavel prodDesc2 = new ProdutoPromocional();

        System.out.println("Desconto Produto Comum: " + prodDesc1.calcularPrecoFinal(1000));

        System.out.println("Desconto Produto Promocional: " + prodDesc2.calcularPrecoFinal(1000));
    }
}
