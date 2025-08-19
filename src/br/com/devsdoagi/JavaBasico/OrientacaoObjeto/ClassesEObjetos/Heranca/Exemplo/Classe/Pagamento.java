package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Heranca.Exemplo.Classe;

public class Pagamento {
    // Atributos comuns a todos os pagamentos
    protected double valor;

    // Construtor
    public Pagamento(double valor) {
        this.valor = valor;
    }

    //Metodo genérico para processar pagamento
    public void processarPagamento() {
        System.out.println("Processando pagamento genérico de R$ " + valor);
    }
}