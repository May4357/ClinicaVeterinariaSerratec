package com.clinicavet.poo;
import java.util.ArrayList;
import java.util.Scanner;

public class Secretario extends Pessoa implements Login{

        // •--==> ATRITUBTOS
        public static ArrayList<Secretario> listaDeScretarios = new ArrayList<Secretario>();
        
        // •--==> CONSTRUTOR

        // •--==> METODO
Scanner sc=new Scanner (System.in);
public Secretario(String nomePessoa, String cpf, String dataNascimento, String email, String telefone) {
        super(nomePessoa, cpf, dataNascimento, email, telefone);
}
public void login(){}

public static Pessoa cadastrarPessoa() {
        System.out.println("NOME COMPLETO");
        String nomePessoa = sc.nextLine();

        System.out.println("DIGITE O CPF:");
        String cpf = sc.nextLine();

        System.out.println("DATA NASCIMENTO (dd/mm/yyyy):");
        String dataNascimento = sc.nextLine();

        System.out.println("Digite o email:");
        String email = sc.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = sc.nextLine();

        // Cria uma nova pessoa e adc na lista
        Pessoa novaPessoa = new Pessoa(nomePessoa, cpf, dataNascimento, email, telefone);
        System.out.println("INSERINDO DADOS!");
        return novaPessoa;


        // •--==> GETTERS SETTERS
        }
}

