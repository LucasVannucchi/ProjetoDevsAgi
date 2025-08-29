package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.MiniHackaton;

import java.time.LocalDateTime;

public class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime data;
    private int contaOrigem, contaDestino;

    public Transacao(String tipo, double valor, int contaOrigem, int contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return data + " | " + tipo + " | Valor: R$ " + String.format("%.2f", valor) + " | Origem: " + contaOrigem + " | Destino: " + contaDestino;
    }
}
