package br.com.devsdoagi.Hackaton.Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private List<Investimento> investimentos;

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    public double getTotalInvestido() {
        double total = 0.0;
        for (int i = 0; i < investimentos.size(); i++) {
            total += investimentos.get(i).getValor();
        }
        return total;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }
    public List<Investimento> getInvestimentos() { return investimentos; }
}
