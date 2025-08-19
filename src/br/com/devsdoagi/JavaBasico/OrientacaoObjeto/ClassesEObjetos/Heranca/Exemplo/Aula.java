package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Heranca.Exemplo;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Heranca.Exemplo.Classe.Pagamento;
import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Heranca.Exemplo.Classe.PagamentoCartaoCredito;
import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Heranca.Exemplo.Classe.PagamentoPayPal;

public class Aula {
    public static void main(String[] args) {
        // Criando um pagamento com Cartão de Crédito
        Pagamento pagamento1 = new PagamentoCartaoCredito(250.00, "515.182.318-37");
        ((PagamentoCartaoCredito) pagamento1).processarPagamentoCartao();

        // Criando um pagamento via PayPal
        Pagamento pagamento2 = new PagamentoPayPal(100.00, "usuario@paypal.com");
        ((PagamentoPayPal) pagamento2).processarPagamentoPaypal();
    }
}
