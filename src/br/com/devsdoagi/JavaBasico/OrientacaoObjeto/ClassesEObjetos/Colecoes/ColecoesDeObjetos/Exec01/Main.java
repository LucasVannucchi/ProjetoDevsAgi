package br.com.devsdoagi.JavaBasico.OrientacaoObjeto.ClassesEObjetos.Colecoes.ColecoesDeObjetos.Exec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1, "Lucas", "515.182.318-37"));
        clientes.add(new Cliente(2, "Higor", "535.144.312-31"));
        clientes.add(new Cliente(3, "Henrique", "987.567.182-23"));
        clientes.add(new Cliente(4, "Gabriel", "625.189.654-09"));
        clientes.add(new Cliente(5, "Gabriel", "174.723.918-29"));

//        System.out.println("Clientes cadastrados (ordem de chegada):");
//        for (Cliente c : clientes) {
//            System.out.println(c);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o CPF para buscar: ");
        String cpfBusca = scanner.nextLine();

        boolean encontrado = false;
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpfBusca)) {
                System.out.println("Cliente encontrado: " + c);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente com CPF " + cpfBusca + " não encontrado.");
        }

        scanner.close();
    }

}
