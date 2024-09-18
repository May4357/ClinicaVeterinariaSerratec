package com.clinicavet.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

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

    // •--==> MÉTODOS
    public static void cadastrarCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=============================================");
        System.out.println("|           * CADASTRO DE CLIENTES *          |");
        System.out.println("---------------------------------------------");
        System.out.print("Nome Completo: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        // Criação do objeto cliente
        Cliente cliente = new Cliente(nome);
        cliente.setCpf(cpf);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);
        cliente.setUsuario(usuario);
        cliente.setSenha(senha);

        listaDeClientes.add(cliente);

        System.out.println("\n---------------------------------------------");
        System.out.println("|       Cliente cadastrado com sucesso!       |");
        System.out.println("=============================================\n");

    }

    public static void cadastrarPets() {
        int repetidor = 1;
        Scanner sc = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        System.out.println("\n=============================================");
        System.out.println("|           * CADASTRO DE PETS *          |");
        System.out.println("---------------------------------------------");

        // NOME
        System.out.print("Nome Completo(Pet): ");
        String nomePet = sc.nextLine();

        // NASCIMENTO
        LocalDate dataNascimento = LocalDate.now();
        while (repetidor != 0) {
            try {
                System.out.print("Data de Nascimento(yyyy-mm-dd): ");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                System.out.print("Digite uma data no formato yyyy-MM-dd: ");
                String input = sc.nextLine();
                dataNascimento = LocalDate.now();
                dataNascimento = LocalDate.parse(input, formatter);
                System.out.println("Data inserida: " + dataNascimento);
                repetidor = 0;
            } catch (DateTimeParseException e) {
                System.out.println("Formato de data inválido. Use yyyy-MM-dd.");
                repetidor = 1;
            }
        }

        // ESPECIE
        repetidor = 1;
        System.out.print("Especie do Animal: ");
        EnumEspecieAnimal enumEspecieAnimal;
        System.out.println(
                "Qual a espécie deste pet: ");
        System.out.println("[1] CACHORRO\n[2] GATO\n[3] AVE\n[4] REPTIL\n[5] ROEDOR;");
        int tipoEspecie;

        enumEspecieAnimal = EnumEspecieAnimal.OUTRO;

        tipoEspecie = sc.nextInt();
        while (tipoEspecie < 1 || tipoEspecie > 5) {
            System.out.println("Digite uma opção válida.");
            tipoEspecie = sc.nextInt();
        }

        switch (tipoEspecie) {
            case 1:
                enumEspecieAnimal = EnumEspecieAnimal.CACHORRO;
                break;
            case 2:
                enumEspecieAnimal = EnumEspecieAnimal.GATO;
                break;
            case 3:
                enumEspecieAnimal = EnumEspecieAnimal.AVE;
                break;
            case 4:
                enumEspecieAnimal = EnumEspecieAnimal.REPTIL;
                break;
            case 5:
                enumEspecieAnimal = EnumEspecieAnimal.ROEDOR;
                break;
            default:
                break;
        }

        // RAÇA
        System.out.print("Raça: ");
        String raca;
        raca = scn.nextLine();
        System.out.print(raca + "\n");

        // COR
        System.out.print("Cor do Animal: ");
        System.out.println("Qual a cor deste pet: ");
        System.out.println(
                "[1] AMARELO\n[2] BICOLOR\n[3] BRANCO\n[4] CARAMELO\n[5] CINZA\n[6] FULVO\n[7] LARANJA\n[8] MALHADO\n[9] MARROM\n[10] PRETO\n[11] TRICOLOR\n[12] OUTRO;");
        int tipoCor;

        EnumCorPet enumCorAnimal = EnumCorPet.OUTRO;

        tipoCor = sc.nextInt();
        while (tipoCor < 1 || tipoCor > 12) {
            System.out.println("Digite uma opção válida.");
            tipoCor = sc.nextInt();
        }
        switch (tipoCor) {
            case 1:
                enumCorAnimal = EnumCorPet.AMARELO;
                break;
            case 2:
                enumCorAnimal = EnumCorPet.BICOLOR;
                break;
            case 3:
                enumCorAnimal = EnumCorPet.BRANCO;
                break;
            case 4:
                enumCorAnimal = EnumCorPet.CARAMELO;
                break;
            case 5:
                enumCorAnimal = EnumCorPet.CINZA;
                break;
            case 6:
                enumCorAnimal = EnumCorPet.FULVO;
                break;
            case 7:
                enumCorAnimal = EnumCorPet.LARANJA;
                break;
            case 8:
                enumCorAnimal = EnumCorPet.MALHADO;
                break;
            case 9:
                enumCorAnimal = EnumCorPet.MARROM;
                break;
            case 10:
                enumCorAnimal = EnumCorPet.PRETO;
                break;
            case 11:
                enumCorAnimal = EnumCorPet.TRICOLOR;
                break;
            case 12:
                enumCorAnimal = EnumCorPet.OUTRO;
                break;
            default:
                break;
        }

        // GENERO
        System.out.print("Genero do Animal: ");
        EnumGenero enumGeneroAnimal;
        System.out.println(
                "Qual o genêro deste pet: ");
        System.out.println("[1] MACHO\n[2] FEMEA\n[3] OUTRO;");
        int tipoGenero;

        enumGeneroAnimal = EnumGenero.OUTRO;

        tipoGenero = sc.nextInt();
        while (tipoGenero < 1 || tipoGenero > 3) {
            System.out.println("Digite uma opção válida.");
            tipoGenero = sc.nextInt();
        }
        switch (tipoGenero) {
            case 1:
                enumGeneroAnimal = EnumGenero.MACHO;
                break;
            case 2:
                enumGeneroAnimal = EnumGenero.FEMEA;
                break;
            case 3:
                enumGeneroAnimal = EnumGenero.OUTRO;
                break;
            default:
                break;
        }

        // TUTOR(A)
        System.out.println("Lista de Clientes");
        int tamanhoLista=0;
        Cliente cliente;
        for (int i = 0; i < Cliente.listaDeClientes.size(); i++) {
            System.out.println("Tutor(a) nº" + (i + 1) + " - " + Cliente.listaDeClientes.get(i).getNomePessoa());
            tamanhoLista++;
        }
        System.out.println("Escolha o tutor deste Pet: ");
        int escolha;
        int tutorEscolhido;

        escolha=scn.nextInt();
        while(escolha<1 || escolha>tamanhoLista){
            System.out.println("Digite uma opção disponível:");
            escolha=scn.nextInt();
        }
        tutorEscolhido = escolha-1;

        // Criação do objeto Animal
        Animal pet = new Animal();
        pet.setNomePet(nomePet);
        pet.setDataNascimento(dataNascimento);
        pet.setEspecieAnimal(enumEspecieAnimal);
        pet.setRaca(raca);
        pet.setCor(enumCorAnimal);
        pet.setDonoPet(Cliente.listaDeClientes.get(tutorEscolhido));
        pet.setGeneroPet(enumGeneroAnimal);

        listaDePets.add(pet);

        System.out.println("\n---------------------------------------------");
        System.out.println("|       Pet cadastrado com sucesso!       |");
        System.out.println("=============================================\n");

    }

    public void consultarHistoricoPet(Animal animal) { // CONSULTA HISTÓRICO DO PET
        System.out.println("Consultando histórico de consultas para o pet: " + animal.getNomePet());

        boolean encontrouConsulta = false;

        for (Consulta consulta : listaDeConsultas) {
            if (consulta.getAnimal().equals(animal)) {
                System.out.println("Consulta em: " + consulta.getDataConsulta());
                System.out.println("Veterinário: " + consulta.getVeterinario());
                // System.out.println("Status da consulta " +
                // consulta.(EnumStatusConsulta.AGENDADA));
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
