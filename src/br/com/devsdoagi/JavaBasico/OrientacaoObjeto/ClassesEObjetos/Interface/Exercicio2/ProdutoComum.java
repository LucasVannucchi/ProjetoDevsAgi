package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Interface.Exercicio2;

public class ProdutoComum implements IDescontavel{
    public double calcularPrecoFinal(double precoBase){
        return precoBase * 0.95;
    }
}
