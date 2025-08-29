package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.MiniHackaton;

public interface Operacoes {
    void saque(double valor, int contaOrigem);
    void deposito(double valor, int contaDestino);
    void transferencia(double valor, int contaDestino, int contaOrigem);
    void exibirExtrato(int numeroConta);
}
