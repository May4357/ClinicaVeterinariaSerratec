package com.clinicavet.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _MenuVet {
    public static void menuVet() {
        // Ambiente virtual de vets da clinica vet
        // boas vindas vet FULANO
        // Menu:
        // registrar um atendimento de um Pet
        // histórico de prontuários de todos pets
        // lista de pets para revisita (+ de 6 meses sem consultar)
        //* TRATAMENTO DOS ERROS : FECHAR O SCANNER , INSERI UMA OPÇÃO PARA OPÇÕES INVÁLIDAS E CONTINUE PARA VOLTAR AO INÍCIO DO LOOP.

        int opcaoVet = -1;

        try (Scanner sc = new Scanner(System.in)) {  //ESSE TRATAMENTO DO SCANNER , GARANTE QUE ELE SEJA FECHADO. 
            do {
                System.out.println("\n============================");
                System.out.println("||       CLINICA VET      ||");
                System.out.println("============================");

                System.out.println("[1] REGISTRAR UM ATENDIMENTO\n" +
                        "[2] CONSULTAR PRONTUÁRIOS DE TODOS OS PETS\n" +
                        "[3] LISTA DE PETS NEGLIGENCIADOS\n" +
                        "[4] CADASTRAR NOVO CLIENTE\n" +
                        "[5] CADASTRAR PET\n" +
                        "[6] LISTAR TODOS OS CLIENTES\n" +
                        "[7] LISTAR TODOS OS PETS\n" +
                        "[0] SAIR");
                System.out.println("");

                try {
                    opcaoVet = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, insira um número.");
                    sc.next(); // P/ LIMPAR O BUFFER.
                    continue; //VOLTAR AO INÍCIO DO LOOP
                }

                switch (opcaoVet) {
                    case 1:
                        Consulta.agendarConsulta(); // chama o método em Consulta para agendar a consulta
                        break;
                    case 2:
                        Consulta.consultaProntuariosDeTodosPets(); // exibe a lista de pets por dono e seus prontuários
                        break;
                    case 3:
                        Consulta.listaDePetsNegligenciados(); // exibe a lista de pets que foram consultados há mais de 6 meses
                        break;
                    case 4:
                        Cliente.cadastrarCliente(); // cadastro de clientes 
                        break;
                    case 5:
                        Cliente.cadastrarPets(); // cadastro de animal
                        break;
                    case 6:
                        ClinicaVeterinaria.listarclientes(); // mostrar todos os clientes
                        break;
                    case 7:
                        ClinicaVeterinaria.listarpets(); // mostrar todos os pets
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                        break;
                }
            } while (opcaoVet != 0);
        }
    }
}
