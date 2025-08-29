package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Heranca.MiniHackaton;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lucas", "515-182-381-37");
        ContaCorrente cc = new ContaCorrente("1876-9", 350, cliente1);
        ContaPoupanca cp = new ContaPoupanca("1876-9", 350, cliente1);

        System.out.println("========CONTA CORRENTE========");
        System.out.println("Nome: " + cc.getTitular().getNome());
        System.out.println("Número da Conta: " + cc.getNumeroConta());
        System.out.println("Saldo: R$" + cc.getSaldo());
        cc.depositar(201);
        System.out.println("Saldo após o deposito: R$" + cc.getSaldo());
        cc.aplicarJuros(200);
        cc.sacar(100);
        System.out.println("Saldo após o saque: R$" + cc.getSaldo() + "\n");


        System.out.println("========CONTA POUPANÇA========");
        System.out.println("Nome: " + cp.getTitular().getNome());
        System.out.println("Número da Conta: " + cp.getNumeroConta());
        System.out.println("Saldo: R$" + cp.getSaldo());
        cp.depositar(201);
        System.out.println("Saldo após o deposito: R$" + cp.getSaldo());
        cp.aplicarJuros(200);
        System.out.println("Saldo após aplicação de Juros de 1%: R$" + cp.getSaldo());
        cp.sacar(100);
        System.out.println("Saldo após o saque: R$" + cp.getSaldo() + "\n");


    }
}
