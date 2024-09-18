package com.clinicavet.poo;

import java.util.Scanner;

public class _MenuCliente {
    public static void menuCliente(){

    int opcaoCliente;
    
    Scanner sc = new Scanner(System.in);

    // Ambiente virtual de clientes da clinica vet
    // boas vindas FULANO
    // Menu:
    // agendar consulta
    // histórico de prontuários dos seus pets

        do{
            System.out.println("\n============================");
            System.out.println("||       CLINICA VET      ||");
            System.out.println("============================"); 
            System.out.println("[1] VER AGENDAMENTO\n" + 
                               "[2] HISTÓRICO DE PRONTUÁRIOS DO SEU PET\n" + 
                               "[0] SAIR");
            System.out.println("");
            opcaoCliente = sc.nextInt();
            switch (opcaoCliente) {
                case 1:
                Consulta.consultaAgendamentosDePetsDoCliente();
                    break;
                case 2:
                Consulta.consultaProntuariosDePetsDoCliente();
                    break;
                default:
                    break;
            }   
        
        }while(opcaoCliente!=0);
    }
}
