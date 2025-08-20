package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exemplo;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exemplo.Classe.Pagamento;
import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exemplo.Classe.PagamentoCartaoCredito;
import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exemplo.Classe.PagamentoPayPal;

public class Aula {
    public static void main(String[] args) {
        // Criando diferentes tipos de pagamento
        Pagamento pagamento1 = new PagamentoCartaoCredito();

        Pagamento pagamento2 = new PagamentoPayPal();

        // Processando os pagamentos
        pagamento1.processarPagamento(250.00);

        pagamento2.processarPagamento(100.00);
    }
}
