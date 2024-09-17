package com.clinicavet.poo;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Consulta {
    // ArrayList<Consulta>();
    private Animal animal;
    private Cliente donoPet;
    private MedicoVeterinario medicoVetResponsavel;
    private LocalDate dataConsulta;
    private EnumStatusConsulta statusConsulta;
    private EnumProcedimento procedimento;

    // •--==> CONSTRUTOR
    public Consulta(Animal animal, MedicoVeterinario medicoVetResponsavel, Cliente donoPet, LocalDate dataConsulta,
            EnumProcedimento procedimento) {
        this.animal = animal;
        this.medicoVetResponsavel = medicoVetResponsavel;
        this.donoPet = donoPet;
        this.dataConsulta = LocalDate.now();
    }

    public Consulta() {

    }

    // •--==> METODOS
    public static void agendarConsulta() {
        System.out.println("Digite o nome do(a) Cliente");
        Scanner sc = new Scanner(System.in);
        String nomePessoa = sc.nextLine(); // guarda o nome em string do cliente
        Cliente cliente;

        if (!Cliente.listaDeClientes.isEmpty()) { // busca todos clientes
            System.out.println("Cliente na lista: ");
            for (Cliente c : Cliente.listaDeClientes) {
                if (c.getNomePessoa().equals(nomePessoa)) { // se o nome digitado estiver na lista exibe e salva
                    cliente = c;
                    System.out.println(cliente.nomePessoa);
                    System.out.println("Digite o nome do(a) Pet");
                    String nomePet = sc.nextLine();
                    Animal pet;

                    if (!Cliente.listaDePets.isEmpty()) {
                        System.out.println("Pet na lista: ");
                        for (Animal p : Cliente.listaDePets) {
                            if (p.getNomePet().equals(nomePet) && p.getDonoPet() == cliente) { // se o pet não for dessa
                                                                                               // pessoa
                                // retorna falso
                                pet = p;
                                System.out.println(pet.getNomePet());
                                System.out.println("Digite o nome do(a) Veterinário(a) responsável pela consulta:");
                                String nomeVet = sc.nextLine();
                                MedicoVeterinario vet;

                                if (!MedicoVeterinario.listaDeVeterinarios.isEmpty()) {
                                    System.out.println("Veterinário(a) na lista: ");
                                    for (MedicoVeterinario v : MedicoVeterinario.listaDeVeterinarios) {
                                        if (v.getNomePessoa().equals(nomeVet)) {
                                            vet = v;
                                            System.out.println(v.getNomePessoa());

                                            LocalDate dataConsulta;
                                            dataConsulta = LocalDate.now();
                                            EnumStatusConsulta statusConsultaA;
                                            statusConsultaA = (EnumStatusConsulta.AGENDADA);

                                            EnumProcedimento procedimentoConsulta;
                                            System.out.println(
                                                    "Qual o tipo de procedimento será realizado na consulta: ");
                                            System.out.println("[1] CONSULTA\n[2] VACINA\n[3] PROCEDIMENTOCIRURGICO;");
                                            int tipoProcedimento;
                                            procedimentoConsulta = EnumProcedimento.CONSULTA;
                                            tipoProcedimento = sc.nextInt();
                                            switch (tipoProcedimento) {
                                                case 1:
                                                    procedimentoConsulta = EnumProcedimento.CONSULTA;
                                                    break;
                                                case 2:
                                                    procedimentoConsulta = EnumProcedimento.VACINA;
                                                    break;
                                                case 3:
                                                    procedimentoConsulta = EnumProcedimento.PROCEDIMENTOCIRURGICO;
                                                    break;
                                                default:
                                                    break;
                                            }
                                            EnumProcedimento Procedimento = procedimentoConsulta;
                                            Consulta novaConsulta = new Consulta(pet, vet, cliente, dataConsulta,
                                                    procedimentoConsulta);
                                            Animal.historicoDeProntuarios.add(novaConsulta);
                                            System.out.println(
                                                    "Consulta cadastrada com sucesso: \n" +
                                                            "Data do Agendamento: " + novaConsulta.getDataConsulta() +
                                                            "\nCliente: " + novaConsulta.donoPet.getNomePessoa() +
                                                            "\nPet: " + novaConsulta.animal.getNomePet() +
                                                            "\nVeterinário(a) Responsável: "
                                                            + novaConsulta.getVeterinario().getNomePessoa()
                                            // +"Procedimento: "+ novaConsulta.procedimento.getEscolhaProcedimentoEnum()
                                            // +"Status: "+novaConsulta.statusConsulta.getStatusConsulta()
                                            );
                                        } else
                                            System.out.println(
                                                    "Pet não cadastrado no sistema ou esta pessoa não é sua dona");
                                    }
                                } else
                                    System.out.println("Pet não cadastrado no sistema ou esta pessoa não é sua dona");
                            }
                        }

                    } else
                        System.out.println("Pessoa não cadastrada no sistema");
                }
            }

        }
    }

    // metodo para saber
    public static EnumStatusConsulta analisarStatusConsulta(Consulta consulta, MedicoVeterinario medico) {
        LocalDate dataHoje = LocalDate.now();
        if (consulta.getDataConsulta().isAfter(dataHoje)) {
            return EnumStatusConsulta.AGENDADA;
        } else {
            // Verifica se a consulta está na lista de consultas do médico
            if (Animal.getHistoricoDeProntuarios().contains(consulta)) {
                return EnumStatusConsulta.FINALIZADA;
            } else {
                return EnumStatusConsulta.CANCELADA;
            }
        }
    }

    // CONSULTAR PRONTUÁRIOS DE TODOS OS PETS
    public static void consultaProntuariosDeTodosPets(){
    System.out.println("Lista de Prontuários de Pets da clinica");
    Consulta c;
        
        for (Cliente cliente : Cliente.listaDeClientes){
            for (Animal pet : Cliente.listaDePets) {
                for(Consulta consulta : Animal.historicoDeProntuarios)
                    if(consulta.getAnimal().equals(pet) && pet.getDonoPet().equals(cliente)){
                        c = consulta;
                        System.out.println(pet.getNomePet());
                        System.out.println(pet.getDonoPet().getNomePessoa());
                        System.out.println(c.procedimento.getEscolhaProcedimentoEnum());
                        System.out.println(c.dataConsulta);
                    }
                }
            }
        }

    /*
     * //medico tal
     * //cliente tal // pet vem do cliente
     * for (Cliente clienteLogin : Cliente.listaDeClientes) {
     * 
     * this.cliente = new ArrayList;
     * this.pet
     * this.medico
     * }
     * }
     * 
     * /*
     * public void agendarConsulta() {
     * Scanner scanner = new Scanner(System.in);
     * try {
     * System.out.println("=== Agendar Consulta ===");
     * System.out.print("Nome do Cliente: ");
     * String nomeCliente = scanner.nextLine();
     * Cliente cliente = buscarCliente(nomeCliente);
     * if (cliente == null) {
     * System.out.println("Cliente não encontrado.");
     * return;
     * }
     * 
     * private Cliente buscarCliente(String nome) {
     * for (Cliente cliente : clientes) {
     * if (cliente.getNome().equalsIgnoreCase(nome)) {
     * return cliente;
     * }
     * }
     * return null;
     * 
     * System.out.print("Nome do Pet: ");
     * String nomePet = scanner.nextLine();
     * Pet pet = buscarPet(cliente, nomePet);
     * if (pet == null) {
     * System.out.println("Pet não encontrado.");
     * return;
     * }
     * 
     * private Pet buscarPet(Cliente cliente, String nomePet) {
     * for (Pet pet : cliente.getPets()) {
     * if (pet.getNome().equalsIgnoreCase(nomePet)) {
     * return pet;
     * }
     * }
     * return null;
     * }
     * }
     */

    // •--==> GETTERS SETTERS

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