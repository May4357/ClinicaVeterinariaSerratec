package com.clinicavet.poo;

import java.util.Scanner;

public class _MenuCliente {
    public static void menuCliente(){

    int opcaoCliente;
    Scanner sc = new Scanner(System.in);

    // Ambiente virtual de clientes da clinica vet
    // boas vindas FULANO
    // Menu:
    // histórico de prontuários dos seus pets

    do{
        System.out.println("•---=== BEM VINDO(A) À CLINICA VET VIDA PET ===---•");
        System.out.println("[1]VER AGENDAMENTO    [2] HISTÓRICO DE PRONTUÁRIOS DO SEU PET");
        opcaoCliente = sc.nextInt();

        switch (opcaoCliente) {
            case 1:
                //agendamento--> nomePessoa, nomePet

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