package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Heranca.Exemplo.Classe;

public class PagamentoPayPal extends Pagamento {
    // Atributo específico para pagamento via PayPal
    private String emailUsuario;

    // Construtor
    public PagamentoPayPal(double valor, String emailUsuario) {
        super(valor);
        this.emailUsuario = emailUsuario;
    }

    // Lógica específica para processar o pagamento via PayPal

    public void processarPagamentoPaypal() {
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal. Conta: " + emailUsuario);
    }
}