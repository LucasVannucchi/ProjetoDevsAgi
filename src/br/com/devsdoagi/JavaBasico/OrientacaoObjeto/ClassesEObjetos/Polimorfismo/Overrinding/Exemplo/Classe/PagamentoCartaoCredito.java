package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exemplo.Classe;

public class PagamentoCartaoCredito extends Pagamento{
    // Sobrescrita do metodo processarPagamento()
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com Cartão de Crédito");
        // Lógica específica de pagamento com cartão de crédito
    }
}
