package com.clinicavet.poo;

import java.util.ArrayList;
import java.time.LocalDate;

public class Consulta {
    // •--==> ATRITUBTOS
    //public static ArrayList<Consulta> historicoDeProntuarios = new ArrayList<Consulta>();
    private Animal animal;
    private Cliente donoPet;
    private MedicoVeterinario medicoVetResponsavel;
    private LocalDate dataConsulta;
    private EnumStatusConsulta statusConsulta;
    private EnumProcedimento procedimento;

    // •--==> CONSTRUTOR
    public Consulta(Animal animal, MedicoVeterinario veterinario, Cliente donoPet) {
        for (Cliente clienteLogin : Cliente.listaDeClientes) {
            
        }
        this.animal = animal;
        this.medicoVetResponsavel = veterinario;
        this.dataConsulta = LocalDate.now();
    


    // •--==> METODOS
    public agendarConsulta(){
        //medico tal
        //cliente tal // pet vem do cliente
        for (Cliente clienteLogin : Cliente.listaDeClientes) {
            
            this.cliente = new ArrayList;
            this.pet
            this.medico
        }

    }

    /*
    public void agendarConsulta() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("=== Agendar Consulta ===");
            System.out.print("Nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
            Cliente cliente = buscarCliente(nomeCliente);
            if (cliente == null) {
                System.out.println("Cliente não encontrado.");
                return;
            }

private Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;

        System.out.print("Nome do Pet: ");
            String nomePet = scanner.nextLine();
            Pet pet = buscarPet(cliente, nomePet);
            if (pet == null) {
                System.out.println("Pet não encontrado.");
                return;
            }

            private Pet buscarPet(Cliente cliente, String nomePet) {
        for (Pet pet : cliente.getPets()) {
            if (pet.getNome().equalsIgnoreCase(nomePet)) {
                return pet;
            }
        }
        return null;
    }
    } */

    // •--==> GETTERS SETTERS
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public MedicoVeterinario getVeterinario() {
        return medicoVetResponsavel;
    }

    public void setVeterinario(MedicoVeterinario veterinario) {
        this.medicoVetResponsavel = veterinario;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public EnumStatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(EnumStatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

}