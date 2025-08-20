package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exercicios.Classes.Exercicios01;

public class PagamentoCartaoCredito extends Pagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + valor + " no cartão " + numeroCartao);
    }
}
