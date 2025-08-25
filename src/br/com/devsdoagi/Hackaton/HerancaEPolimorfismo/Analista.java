package br.com.devsdoagi.Hackaton.HerancaEPolimorfismo;

public class Analista extends Funcionario{

    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 1000;
    }
}
