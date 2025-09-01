package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.MiniHackaton;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cliente {
    private String nome;
    private String cpf;

    private static Set<Cliente> clientes = new HashSet<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | CPF: " + cpf;
    }

    // Métodos estáticos para CRUD
    public static void cadastrarCliente(Scanner sc) {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();

        // Verifica duplicidade pelo CPF
        if (buscarPorCpf(cpf) != null) {
            System.out.println("Cliente já cadastrado!");
            return;
        }

        Cliente c = new Cliente(nome, cpf);
        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public static Cliente buscarPorCpf(String cpf) {
        return clientes.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("\n=== Lista de Clientes ===");
            clientes.forEach(System.out::println);
        }
    }
}
