package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Exemplo.Classe;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    //Metodo para acelerar o carro
    public void acelerar(){
        System.out.println("O carro está acelerando.");
    }

    //Metodo para frear o carro
    public void frear(){
        System.out.println("O carro está freando.");
    }

    //Metodo para mostrar as informações do carro
    public void mostrarInformacoes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }
}
