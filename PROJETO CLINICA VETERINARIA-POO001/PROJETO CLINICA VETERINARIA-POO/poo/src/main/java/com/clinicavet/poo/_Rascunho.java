package com.clinicavet.poo;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class _Rascunho {

    
    /*
    public LocalDate dataLoc() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Digite uma data no formato yyyy-MM-dd: ");
        String input = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(input, formatter);
            System.out.println("Data inserida: " + date);
            return date;
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido. Use yyyy-MM-dd.");
        }
    }
        
 * 1 PooApplication - Login
 * • O usuário deve ser capaz de logar no sistema
 * 
 * 2.1 Menu Vet:
 * 
 * 2.1.1 Registrar um atendimento de um Pet
 * • O usuário deve ser capaz de cadastrar uma tarefa
 * • O médico deve ser capaz de registrar um atendimento de um Pet
 * 
 * 2.1.2 Histórico de prontuários de todos pets
 * • A tarefa deve possuir obrigatoriamente descrição, tipo, data prazo de
 * conclusão e um responsável
 * • O médico e o Cliente devem ser capazes de consultar os prontuários
 * (Histórico de todos os atendimentos) do Pet
 * 
 * 2.1.3 Lista de pets consultados e prontos para revisita (+ de 6meses sem
 * consultar)
 * • O usuário deve ser capaz de listar todas as tarefas, todas as atrasadas,
 * todas atribuídas a mim, todas concluídas
 * • O médico deve ser capaz de visualizar os Pets que não se consultam há mais
 * de 6 meses
 * 
 * 2.1.4 Atualizar ou remover dados
 * • O usuário deve ser capaz de remover somente as tarefas criadas por ele
 * 
 * 2.2 Menu Cliente:
 * 
 * 2.2.1 Agendar consulta para seu pet? (fica legal mas deve dar trabalho pois
 * teria que criar uma agenda?)
 * 
 * 2.2.2 Histórico de prontuários de todos pets
 * • O médico e o Cliente devem ser capazes de consultar os prontuários
 * (Histórico de todos os atendimentos) do Pet
 * • O Cliente deve ser capaz de consultar os prontuários de cada um dos seus
 * Pets (mas não dos outros)
 * 
 * 
 * 
 * CLASSES:
 * PooApplication
 * Login
 * MenuCliente
 * MenuVet
 * 
 * ClinicaVet
 * Consulta
 * Procedimento
 * StatusConsulta
 * Pessoa
 * Cliente
 * MedicoVet
 * Animal
 * EnumCorPet
 * EnumEspecie
 * 
 * 
 * 
 * // •--==> ATRITUBTOS
 * 
 * // •--==> CONSTRUTOR
 * 
 * // •--==> METODOS
 * 
 * // •--==> GETTERS SETTERS
 * 
 * 
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
 */

}
