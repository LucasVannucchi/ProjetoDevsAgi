package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.Encapsulamento.Exemplo;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.Encapsulamento.Exemplo.Classe.Pessoa;

public class Aula {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Lucas");
        pessoa.setIdade(21);

        pessoa.exibirInformacoes();

        pessoa.setIdade(-1); //Teste de validação
    }
}
