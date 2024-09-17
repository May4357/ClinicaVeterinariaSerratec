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
        System.out.println(" •---=== CLINICA VET ===---•");
        System.out.println(" --- PÁGINA DO CLIENTE --- ");
        System.out.println("[1]-VER AGENDAMENTO    [2]-HISTÓRICO DE PRONTUÁRIOS DO SEU PET ");
        System.out.println("");
        opcaoCliente = sc.nextInt();

        switch (opcaoCliente) {
            case 1:
               System.out.println("A sua consulta foi agendada para o dia :");
                
                break;
            case 2:
                //historico

                break;
        
            default:
                break;
        }
        }while(opcaoCliente!=0);
    }
}