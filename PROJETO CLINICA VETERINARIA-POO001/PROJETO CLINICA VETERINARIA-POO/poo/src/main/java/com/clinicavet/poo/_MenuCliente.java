package com.clinicavet.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _MenuCliente {
    public static void menuCliente() {

        int opcaoCliente = -1;
        final String ANSI_RESET = "\u001B[0m"; // Resetar cor
        final String ANSI_CYAN = "\u001B[36m"; // Ciano

        try (Scanner sc = new Scanner(System.in)) { // Garante o fechamento do Scanner

            // Ambiente virtual de clientes da clinica vet
            System.out.println("Bem-vindo à Clínica Vet!");

            do {
                System.out.println(ANSI_CYAN +"\n=============================");
                System.out.println("|| CLINICA VET VIDA ANIMAL ||");
                System.out.println("=============================" + ANSI_RESET);
                System.out.println("[1] VER AGENDAMENTO");
                System.out.println("[2] HISTÓRICO DE PRONTUÁRIOS DO SEU PET");
                System.out.println("[0] SAIR");
                System.out.print("Escolha uma opção: ");

                try {
                    opcaoCliente = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número.");
                    sc.next(); // Limpa o buffer
                    continue; // Volta ao início do loop
                }

                switch (opcaoCliente) {
                    case 1:
                        Consulta.consultaAgendamentosDePetsDoCliente();
                        break;
                    case 2:
                        Consulta.consultaProntuariosDePetsDoCliente();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha uma opção válida.");
                        break;
                }

            } while (opcaoCliente != 0);
        }
    }
}