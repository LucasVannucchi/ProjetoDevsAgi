package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.Encapsulamento.Exemplo.Classe;

public class Pessoa {
    private String nome;
    private int idade;

    //Getter para Obter o nome:
    public String getNome() {
        return nome;
    }

    //Setter para alterar o nome:
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter para Obter a idade:
    public int getIdade() {
        return idade;
    }

    //Setter para alterar a idade:
    public void setIdade(int idade) {

        if (idade >= 0) {

            this.idade = idade;

        } else {

            System.out.println("Idade inválida.");

        }
    }

    public void exibirInformacoes() {

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);
    }
}
