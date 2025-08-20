package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exercicios;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exercicios.Classes.Exercicios01.Pagamento;
import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exercicios.Classes.Exercicios01.PagamentoCartaoCredito;
import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exercicios.Classes.Exercicios01.PagamentoPix;

public class Exercicio01 {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new Pagamento(100),
                new PagamentoCartaoCredito(150, "1234-56"),
                new PagamentoPix(198.09, "515.182.318-37"),
        };

        for (Pagamento p : pagamentos){
            p.processarPagamento();
        }
    }
}
