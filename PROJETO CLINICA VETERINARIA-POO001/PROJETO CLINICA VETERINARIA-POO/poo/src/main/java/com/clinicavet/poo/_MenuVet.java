package com.clinicavet.poo;

import java.util.Scanner;

public class _MenuVet {
    public static void menuVet(){
    //Ambiente virtual de vets da clinica vet
    //boas vindas vet FULANO
    //Menu:
    //registrar um atendimento de um Pet
    //histórico de prontuários de todos pets
    //lista de pets para revisita (+ de 6meses sem consultar)

    int opcaoVet;
    Scanner sc = new Scanner(System.in);

        do{
            System.out.println("\n============================");
            System.out.println("||       CLINICA VET      ||");
            System.out.println("============================");

            System.out.println("[1] REGISTRAR UM ATENDIMENTO\n" + 
                               "[2] CONSULTAR PRONTUÁRIOS DE TODOS OS PETS\n" + 
                               "[3] LISTA DE PETS NEGLIGENCIADOS\n" + 
                               "[0] SAIR");
            System.out.println("");
            opcaoVet = sc.nextInt();

            switch (opcaoVet) {
                case 1:
                
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    break;
            }
        }while(opcaoVet!=0);
    }
}
