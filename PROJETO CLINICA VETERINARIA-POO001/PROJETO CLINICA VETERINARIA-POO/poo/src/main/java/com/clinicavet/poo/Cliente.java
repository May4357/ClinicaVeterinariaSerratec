package com.clinicavet.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Pessoa implements Login {

    // •--==> ATRITUTOS     
    public static ArrayList<Cliente> listaDeClientes = new ArrayList<>();
    public static ArrayList<Animal> listaDePets = new ArrayList<>();
    private ArrayList<Consulta> listaDeConsultas = new ArrayList<>();

    // Atributos do cliente
    private LocalDate dataCadastro;

    // •--==> CONSTRUTOR
    public Cliente(int idPessoa, String nomePessoa, String cpf, String dataNascimento, String email,
            String usuario, String senha, String telefone, String dataCadastro) {
        this.setNomePessoa(nomePessoa);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
        this.setEmail(email);
        this.setUsuario(usuario);
        // outros atributos a serem inicializados...
    }

    public Cliente(String nomeCliente) {
        this.setNomePessoa(nomeCliente);
    }

    //•--==> MÉTODOS 
    public void consultarHistoricoPet(Animal animal) {                  //  CONSULTA HISTÓRICO DO PET 
        System.out.println("Consultando histórico de consultas para o pet: " + animal.getNomePet());

        boolean encontrouConsulta = false;

        for (Consulta consulta : listaDeConsultas) {
            if (consulta.getAnimal().equals(animal)) {
                System.out.println("Consulta em: " + consulta.getDataConsulta());
                System.out.println("Veterinário: " + consulta.getVeterinario());
                //System.out.println("Status da consulta " + consulta.(EnumStatusConsulta.AGENDADA));
                System.out.println("----------------------------");
                encontrouConsulta = true;
            }
        }

        if (!encontrouConsulta) {
            System.out.println("Nenhuma consulta encontrada para o pet: " + animal.getNomePet());
        }
    }

    // Método para adicionar um pet
    public static void adicionarPet(Animal nomeAnimal) {
        listaDePets.add(nomeAnimal);
    }

    // Método de login (implementação do interface Login)
    public void login() {
        _MenuCliente.menuCliente(); // Exemplo de chamada de menu
    }

    // Getters e Setters
    public static ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public static void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
        Cliente.listaDeClientes = listaDeClientes;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public ArrayList<Consulta> getListaDeConsultas() {
        return listaDeConsultas;
    }

    public void setListaDeConsultas(ArrayList<Consulta> listaDeConsultas) {
        this.listaDeConsultas = listaDeConsultas;
    }
}
