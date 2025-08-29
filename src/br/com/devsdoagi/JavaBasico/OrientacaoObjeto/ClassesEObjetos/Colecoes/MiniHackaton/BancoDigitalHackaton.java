package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.MiniHackaton;

import java.util.*;

public class BancoDigitalHackaton implements Operacoes {
    private static Set<Cliente> clientes = new HashSet<>();
    private static Map<Integer, Conta> contas = new HashMap<>();
    private static int numeroConta = 1001;

    public static void main(String[] args) {
        BancoDigitalHackaton banco = new BancoDigitalHackaton();
        Scanner sc = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║         🏦 BANCO DIGITAL - MENU      ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ 1.  Cadastrar Cliente                ║");
            System.out.println("║ 2.  Cadastrar Conta                  ║");
            System.out.println("║ 3.  Depósito                         ║");
            System.out.println("║ 4.  Saque                            ║");
            System.out.println("║ 5.  Transferência                    ║");
            System.out.println("║ 6.  Consultar Saldo                  ║");
            System.out.println("║ 7.  Extrato                          ║");
            System.out.println("║ 8.  Listar Clientes                  ║");
            System.out.println("║ 9.  Sair                             ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Digite o número da opção desejada: ");

            int opcao;
            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️  Entrada inválida! Digite um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    banco.cadastrarCliente(sc);
                    break;
                case 2:
                    banco.cadastrarConta(sc);
                    break;
                case 3:
                    banco.deposito(sc);
                    break;
                case 4:
                    banco.saque(sc);
                    break;
                case 5:
                    banco.transferencia(sc);
                    break;
                case 6:
                    banco.consultarSaldo(sc);
                    break;
                case 7:
                    banco.extrato(sc);
                    break;
                case 8:
                    banco.listarClientes();
                    break;
                case 9:
                    rodando = false;
                    System.out.println("\nObrigado por utilizar o AgiBank seu Banco Digital. Até logo!");
                    break;
                default:
                    System.out.println("⚠️  Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }

    private void cadastrarCliente(Scanner sc) {
        System.out.print("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf);
        if (clientes.add(cliente)) {
            System.out.println("Cliente cadastrado com sucesso!");
        } else {
            System.out.println("Cliente já cadastrado!");
        }
    }

    private void cadastrarConta(Scanner sc) {
        System.out.print("Digite o CPF do cliente para vincular a conta: ");
        String cpf = sc.nextLine();

        Cliente cliente = clientes.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);

        if (cliente == null) {
            System.out.println("Cliente não encontrado! Cadastre o cliente primeiro.");
            return;
        }

        Conta conta = new Conta(numeroConta++, cliente);
        contas.put(conta.getNumeroConta(), conta);
        System.out.println("Conta criada com sucesso! Número da conta: " + conta.getNumeroConta());
    }

    private void deposito(Scanner sc) {
        System.out.print("Digite o número da conta para depósito: ");
        int contaDestino;
        double valor;
        try {
            contaDestino = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o valor para depósito: ");
            valor = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Entrada inválida! Tente novamente.");
            return;
        }

        deposito(valor, contaDestino);
    }

    private void saque(Scanner sc) {
        System.out.print("Digite o número da conta para saque: ");
        int contaOrigem;
        double valor;
        try {
            contaOrigem = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o valor para saque: ");
            valor = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Entrada inválida! Tente novamente.");
            return;
        }

        saque(valor, contaOrigem);
    }

    private void transferencia(Scanner sc) {
        int contaOrigem, contaDestino;
        double valor;
        try {
            System.out.print("Digite o número da conta de origem: ");
            contaOrigem = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o número da conta de destino: ");
            contaDestino = Integer.parseInt(sc.nextLine());
            System.out.print("Digite o valor para transferência: ");
            valor = Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Entrada inválida! Tente novamente.");
            return;
        }

        transferencia(valor, contaDestino, contaOrigem);
    }

    private void consultarSaldo(Scanner sc) {
        System.out.print("Digite o número da conta: ");
        int numeroConta;
        try {
            numeroConta = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Entrada inválida! Tente novamente.");
            return;
        }

        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.printf("Saldo da conta %d: R$ %.2f%n", numeroConta, conta.getSaldo());
    }

    private void extrato(Scanner sc) {
        System.out.print("Digite o número da conta para extrato: ");
        int numeroConta;
        try {
            numeroConta = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Entrada inválida! Tente novamente.");
            return;
        }

        exibirExtrato(numeroConta);
    }

    private void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("Clientes cadastrados:");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }

    @Override
    public void saque(double valor, int contaOrigem) {
        Conta conta = contas.get(contaOrigem);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void deposito(double valor, int contaDestino) {
        Conta conta = contas.get(contaDestino);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        conta.depositar(valor);
        System.out.println("Depósito realizado com sucesso!");
    }

    @Override
    public void transferencia(double valor, int contaDestino, int contaOrigem) {
        Conta origem = contas.get(contaOrigem);
        Conta destino = contas.get(contaDestino);

        if (origem == null) {
            System.out.println("Conta de origem não encontrada!");
            return;
        }
        if (destino == null) {
            System.out.println("Conta de destino não encontrada!");
            return;
        }
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
            return;
        }

        if (origem.sacar(valor)) {
            destino.depositar(valor);

            origem.getTransacoes().add(new Transacao("Transferência Enviada", valor, contaOrigem, contaDestino));
            destino.getTransacoes().add(new Transacao("Transferência Recebida", valor, contaOrigem, contaDestino));

            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    @Override
    public void exibirExtrato(int numeroConta) {
        Conta conta = contas.get(numeroConta);
        if (conta == null) {
            System.out.println("Conta não encontrada!");
            return;
        }

        System.out.println("Extrato da conta " + numeroConta + ":");
        for (Transacao t : conta.getTransacoes()) {
            System.out.println(t);
        }
    }
}
