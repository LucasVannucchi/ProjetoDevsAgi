package br.com.devsdoagi.JavaBasico.OrientacaoObjeto;

import br.com.devsdoagi.JavaBasico.OrientacaoObjeto.Classes.Carro;

public class Aula {
    public static void main(String[] args) {
        //Criando um objeto da classe Carro
        Carro meuCarro = new Carro();

        meuCarro.mostrarInformacoes();

        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corola";
        meuCarro.ano = 2025;

        //Usando os métodos do objeto
        meuCarro.acelerar();;
        meuCarro.frear();
        meuCarro.mostrarInformacoes();

    }
}
