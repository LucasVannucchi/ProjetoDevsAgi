package br.com.devsdoagi.Hackaton.Colecoes;

public class Investimento {
    private String tipo;
    private double valor;

    public Investimento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() { return tipo; }
    public double getValor() { return valor; }
}
