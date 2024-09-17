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


    /*
    public static void cadastrarNotas() { // reutilizar para o medico consultar os dadso
        Disciplina disciplinaNota;
        Aluno alunoNota;
        Funcionario funcNota;
        Professor professorNota;

        System.out.println("- CADASTRANDO NOVO BOLETIM -");
        Scanner disciplinaLeia = new Scanner(System.in);
        Scanner professorLeia = new Scanner(System.in);
        Scanner alunoLeia = new Scanner(System.in);
        Notas nota = new Notas();

        int disciplinaEscolhida;
        int professorEscolhida;
        int alunoEscolhida;

        System.out.println("\n");
        // escolha disciplina
        if (!Disciplina.listaDeDisciplinasDaEscola.isEmpty()) {
            System.out.println("Lista detalhada de Disciplina: ");
            for (int i = 0; i < Disciplina.listaDeDisciplinasDaEscola.size(); i++) {
                System.out.println(
                        (i + 1) + " - Nome: - " + Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaNome() +
                                " - Curso: - " + Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaCurso()
                                + " - Turno: " + Disciplina.listaDeDisciplinasDaEscola.get(i).getDisciplinaTurno());
            }
            System.out.print("Numero da disciplina: ");
            disciplinaEscolhida = disciplinaLeia.nextInt();
            disciplinaNota = Disciplina.listaDeDisciplinasDaEscola.get(disciplinaEscolhida - 1);
            nota.setDisciplina(disciplinaNota);
            // escolha aluno
            if (!Aluno.listaDeAlunos.isEmpty()) {
                System.out.println("Lista de alunos:");
                for (int i = 0; i < Aluno.listaDeAlunos.size(); i++) {
                    System.out.println((i + 1) + " - NOME: " + Aluno.listaDeAlunos.get(i).getNome() + "|CPF: "
                            + Aluno.listaDeAlunos.get(i).getCpf() + "|Email: "
                            + Aluno.listaDeAlunos.get(i).getEmail() + "|Senha: "
                            + Aluno.listaDeAlunos.get(i).getSenha());
                }
                System.out.print("Numero do(a) Aluno(a) avaliado(a): ");
                alunoEscolhida = alunoLeia.nextInt();
                alunoNota = Aluno.listaDeAlunos.get(alunoEscolhida - 1);
                nota.setAluno(alunoNota);
            }
            // escolha professor
            if (!Professor.listaDeFuncionariosDaEscola.isEmpty()) {
                System.out.println("Lista detalhada de Professores(as): ");
                for (int i = 0; i < Professor.listaDeFuncionariosDaEscola.size(); i++) {
                    System.out.println(
                            (i + 1) + " - Nome: - " + Professor.listaDeFuncionariosDaEscola.get(i).getNome() + "|CPF: "
                                    + Professor.listaDeFuncionariosDaEscola.get(i).getCpf() + "|Email: "
                                    + Professor.listaDeFuncionariosDaEscola.get(i).getEmail() + "|Senha: "
                                    + Professor.listaDeFuncionariosDaEscola.get(i).getSenha());
                }
                System.out.print("Numero do(a) Professor(a): ");
                professorEscolhida = professorLeia.nextInt();
                professorNota = Professor.listaDeFuncionariosDaEscola.get(professorEscolhida - 1);
                nota.setProfessor(professorNota);
                Notas.listaDeNotasDaEscola.add(nota);
            }
        }
    }
 */

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