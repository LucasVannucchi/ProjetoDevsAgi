package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exercicios.Classes.Exercicios01;

public class Pagamento {
    // Atributos comuns a todos os pagamentos
    protected double valor;

    // Construtor
    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void processarPagamento(){
        System.out.println("Processando pagamento genérico: R$" + valor);
    }
}
