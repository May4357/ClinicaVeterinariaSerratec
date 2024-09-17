package com.clinicavet.poo;

import java.util.ArrayList;
import java.time.LocalDate;

public class Cliente extends Pessoa implements Login {

    // •--==> LISTA DE CLIENTES
    public static ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
    public static ArrayList<Animal> listaDePets = new ArrayList<Animal>();

    // •--==> ATRITUBTOS
    // private int idCliente;
    private LocalDate dataCadastro;

    // •--==> CONSTRUTOR
public Cliente(int idPessoa, String nomePessoa, String cpf, String dataNascimento, String email,
    String usuario, String senha, String telefone){
        super(idPessoa, nomePessoa, cpf, dataNascimento, email, usuario, senha, telefone);
    this.add()
    }

    public Cliente(String nomeCliente) {
        this.setNomePessoa(nomeCliente);

    }

    // •--==> METODOS
public static void consultaProntuarios() { // vai consultar os prontuarios daquele determinado animal

    for (Animal pets : Cliente.listaDePets) {// polimorfismo, busca pet na lista de pets do array

        if (!Cliente.listaDePets.isEmpty()) { // rodar a lista de pets

            System.out.println("Lista de Pets:");

            for (int i = 0; i < Cliente.listaDePets.size(); i++) {
                System.out.println((i + 1) + " - NOME: "
                        + Cliente.listaDePets.get(i).getNomePet()
                        + Cliente.listaDePets.get(i).getRaca()
                        + Cliente.listaDePets.get(i).getCor()
                        + Cliente.listaDePets.get(i).getHistoricoDeProntuarios().get(i).
                        + Cliente.listaDePets.get(i).getDataUltimaConsulta());

    }
    
}

    public static void adicionarPet(Animal nomeAnimal) {
        listaDePets.add(nomeAnimal); // Adicionar pet no array
    }

    public void login() {
        _MenuCliente.menuCliente();
    }

    // •--==> GETTERS SETTERS
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

    // login e senha
    // deve consultar os prontuários (historicos de atendimento) de TODOS os SEUS
    // pets.

        }
    }
}