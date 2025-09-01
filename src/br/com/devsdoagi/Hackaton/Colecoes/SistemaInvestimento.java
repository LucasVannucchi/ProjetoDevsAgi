package br.com.devsdoagi.Hackaton.Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaInvestimento {
    private Map<String, Cliente> clientes;

    public SistemaInvestimento() {
        this.clientes = new HashMap<>();
    }

    public void cadastrarCliente(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        if (clientes.containsKey(cpf)) {
            System.out.println("Erro: CPF já cadastrado.");
        } else {
            clientes.put(cpf, new Cliente(nome, cpf, email));
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }

    public void adicionarInvestimento(Scanner sc) {
        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = clientes.get(cpf);
        if (cliente == null) {
            System.out.println("Erro: Cliente não encontrado.");
            return;
        }

        System.out.println("Escolha o tipo de investimento:");
        System.out.println("1 - Tesouro Selic");
        System.out.println("2 - CDB");
        System.out.println("3 - Ações");
        System.out.print("Opção: ");

        int opcao = -1;
        try {
            opcao = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um número válido.");
            return;
        }

        String tipo = "";
        switch (opcao) {
            case 1:
                tipo = "Tesouro Selic";
                break;
            case 2:
                tipo = "CDB";
                break;
            case 3:
                tipo = "Ações";
                break;
            default:
                System.out.println("Erro: opção inválida.");
                return;
        }

        double valor = -1;
        while (true) {
            try {
                System.out.print("Valor: ");
                valor = Double.parseDouble(sc.nextLine());
                if (valor <= 0) throw new IllegalArgumentException();
                break;
            } catch (Exception e) {
                System.out.println("Erro: valor inválido. Digite um número positivo.");
            }
        }

        cliente.adicionarInvestimento(new Investimento(tipo, valor));
        System.out.println("Investimento adicionado com sucesso!");
    }

    public void listarInvestimentos(Scanner sc) {
        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();

        Cliente cliente = clientes.get(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.println("Investimentos de " + cliente.getNome() + ":");
        if (cliente.getInvestimentos().isEmpty()) {
            System.out.println("Nenhum investimento encontrado.");
        } else {
            for (Investimento inv : cliente.getInvestimentos()) {
                System.out.printf("- %s: R$ %.2f%n", inv.getTipo(), inv.getValor());
            }
            System.out.printf("Total investido: R$ %.2f%n", cliente.getTotalInvestido());
        }
    }

    public void relatorioGeral() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
        System.out.println("Relatório Geral:");
        for (Cliente cliente : clientes.values()) {
            System.out.printf("Cliente: %s | CPF: %s | Email: %s | Total Investido: R$ %.2f%n",
                    cliente.getNome(),
                    cliente.getCpf(),
                    cliente.getEmail(),
                    cliente.getTotalInvestido()
            );
        }
    }
}
