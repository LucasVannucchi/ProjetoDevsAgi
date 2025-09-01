package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.MiniHackaton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
    private int id;
    private int contaNumero;
    private String tipo;
    private double valor;
    private LocalDateTime dataHora;

    public Transacao(int id, int contaNumero, String tipo, double valor) {
        this.id = id;
        this.contaNumero = contaNumero;
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
    }

    public int getContaNumero() {
        return contaNumero;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "ID: " + id +
                " | Data: " + dataHora.format(formatter) +
                " | " + tipo +
                ": R$ " + String.format("%.2f", valor);
    }
}
