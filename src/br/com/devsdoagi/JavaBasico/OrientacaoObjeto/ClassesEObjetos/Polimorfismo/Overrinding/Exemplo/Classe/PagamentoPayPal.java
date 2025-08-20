package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exemplo.Classe;

public class PagamentoPayPal extends Pagamento{
    // Sobrescrita do metodo processarPagamento()
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal");
    // Lógica específica de pagamento via PayPal
    }
}
