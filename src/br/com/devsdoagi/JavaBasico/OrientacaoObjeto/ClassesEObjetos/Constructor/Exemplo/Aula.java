package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Constructor.Exemplo;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Constructor.Exemplo.Classe.Pessoa;

public class Aula {
    public static void main(String[] args) {
        // Chama o construtor padrão (implícito)
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibirInformacoes();

        // Chama o construtor com parâmetros
        Pessoa pessoa2 = new Pessoa("Lucas", 21);
        pessoa2.exibirInformacoes();
    }
}

/*
public class Aula {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucas", 21);
        pessoa.exibirInformacoes();
    }
}
 */
