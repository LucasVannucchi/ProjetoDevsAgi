package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exercicios.Classes.Exercicios02;

public class Poupanca extends Investimento{
    private double txPoupanca;

    public Poupanca(double valorAplicado, double txPoupanca){
        super(valorAplicado);
        this.txPoupanca = txPoupanca;
    }

    @Override
    public void calcularRendimento() {
        int meses;
        for (int i = 0; i < meses; i++) {

        }
        System.out.println("Processando pagamento de R$" + valorAplicado + " no cartão " + txPoupanca);
    }
}
