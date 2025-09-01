package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.MiniHackaton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                System.out.println("⚠️ Entrada inválida! Digite um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    Cliente.cadastrarCliente(sc);
                    break;
                case 2:
                    Conta.cadastrarConta(sc);
                    break;
                case 3:
                    Conta.depositar(sc);
                    break;
                case 4:
                    Conta.sacar(sc);
                    break;
                case 5:
                    Conta.transferir(sc);
                    break;
                case 6:
                    Conta.consultarSaldo(sc);
                    break;
                case 7:
                    System.out.print("Número da conta: ");
                    int numExtrato;
                    try {
                        numExtrato = Integer.parseInt(sc.nextLine());
                        Conta conta = Conta.buscarConta(numExtrato);
                        if (conta != null) {
                            conta.mostrarExtrato();
                        } else {
                            System.out.println("Conta não encontrada.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("⚠️ Entrada inválida!");
                    }
                    break;
                case 8:
                    Cliente.listarClientes();
                    break;
                case 9:
                    rodando = false;
                    System.out.println("\nObrigado por utilizar o AgiBank seu Banco Digital. Até logo!");
                    break;
                default:
                    System.out.println("⚠️ Opção inválida! Tente novamente.");
            }
        }
        sc.close();
    }
}
