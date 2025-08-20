package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exercicios.Classes.Exercicios01;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix){
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento de R$ " + valor + " para o Pix: " + chavePix);
    }
}