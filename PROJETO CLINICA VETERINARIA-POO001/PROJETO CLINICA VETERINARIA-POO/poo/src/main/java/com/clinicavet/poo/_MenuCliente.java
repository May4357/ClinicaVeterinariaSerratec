package com.clinicavet.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

        //* TRATAMENTO DOS ERROS : FECHAR O SCANNER , INSERI UMA OPÇÃO PARA OPÇÕES INVÁLIDAS E CONTINUE PARA VOLTAR AO INÍCIO DO LOOP.

public class _MenuCliente {
    public static void menuCliente(){

        int opcaoCliente = -1;

        try (Scanner sc = new Scanner(System.in)) { //GARANTE  FECHAMENTO DO SCANNER;

            // Ambiente virtual de clientes da clinica vet
            // boas vindas FULANO
            // Menu:
            // agendar consulta
            // histórico de prontuários dos seus pets

            do {
                System.out.println("\n============================");
                System.out.println("||       CLINICA VET      ||");
                System.out.println("============================");
                System.out.println("[1] VER AGENDAMENTO\n" +
                        "[2] HISTÓRICO DE PRONTUÁRIOS DO SEU PET\n" +
                        "[0] SAIR");
                System.out.println("");

                try {
                    opcaoCliente = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número.");
                    sc.next(); // LIMPA O BUFFER.
                    continue; // VOLTAR AO INÍCIO DO LOOP;
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

