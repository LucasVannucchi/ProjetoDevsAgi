package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Polimorfismo.Overrinding.Exemplo.Classe;

public class Pagamento {
    // Metodo genérico que será sobrescrito pelas subclasses
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento genérico de R$ " + valor);
    }
}
