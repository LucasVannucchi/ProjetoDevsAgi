package br.com.devsdoagi.Hackaton.HerancaEPolimorfismo;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return 2000;
    }
}
