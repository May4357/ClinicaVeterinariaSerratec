package com.clinicavet.poo;

import java.util.Scanner;
import java.util.ArrayList;

public class MedicoVeterinario extends Pessoa implements Login {
    // •--==> ATRITUBTOS
    private int crmv;// Conselho Regional de Medicina Veterinária
    private String especialidade;

    public static ArrayList<MedicoVeterinario> listaDeVeterinarios = new ArrayList<MedicoVeterinario>();

    // •--==> CONSTRUTOR
    //public MedicoVeterinario(int idPessoa, String nomePessoa, String cpf, String dataNascimento, String email,
    //String usuario, String senha, String telefone, int crmv, String especialidade){
        //super(idPessoa, nomePessoa, cpf, dataNascimento, email, usuario, senha, telefone);
    //}

    // •--==> CONSTRUTOR TESTE
    public MedicoVeterinario(String nomeMed) {
        this.setNomePessoa(nomeMed);
    }

    // •--==> METODOS
    public void login(){
        _MenuVet.menuVet();
    }
    
    public static void cadastrarVet(){
        Scanner sc = new Scanner(System.in);

        System.out.print("NOME COMPLETO: ");
        String nomePessoa = sc.nextLine();

        System.out.print("DIGITE O CPF: ");
        String cpf = sc.nextLine();

        System.out.print("DATA NASCIMENTO (dd/mm/yyyy): ");
        String dataNascimento = sc.nextLine();

        System.out.print("DIGITE O EMAIL: ");
        String email = sc.nextLine();

        System.out.print("DIGITE O TELEFONE: ");
        String telefone = sc.nextLine();

        System.out.print("DIGITE O CRMV ");
        int crmv = sc.nextInt();

        System.out.print("DIGITE A ESPECIALIDADE: ");
        String especialidade = sc.nextLine();
    }

    // •--==> GETTERs SETTERs
    public int getCrmv() {
        return crmv;
    }
    
    public void setCrmv(int crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
// acrescentar login e senha
// deve ser capaz de registrar um atendimento de um pet
// capaz de visualizar os pets que não se consultam há mais de 6 meses .
// cadastrar novo cliente (?) ou criar uma classe recepção(?)

/*
 * public Medicovet{
 * 
 * super();
 * 
 * }
 */