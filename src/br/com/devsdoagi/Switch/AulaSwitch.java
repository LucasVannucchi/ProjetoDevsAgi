package br.com.devsdoagi.Switch;

import java.util.Scanner;

public class AulaSwitch {
    public static void main(String[] args) {
        int opcao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Opções disponiveis: \n" + "Opção 1\n" + "Opção 2\n" + "Em manutenção\n" + "Selecione sua Opção:");
        opcao = sc.nextInt();

        String res = switch (opcao){
            case 1 -> "Opção 1 selecionada!";
            case 2 -> "Opção 2 selecionada!";
            default -> "Opção invalida!";
        };
        System.out.println(res);
    }
}
