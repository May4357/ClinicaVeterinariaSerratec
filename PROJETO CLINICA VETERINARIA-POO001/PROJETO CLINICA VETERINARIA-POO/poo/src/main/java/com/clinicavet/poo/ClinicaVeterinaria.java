package com.clinicavet.poo;

public class ClinicaVeterinaria {

    // •--==> ATRITUBTOS
    
    //public Endereco endereco;
    private String cnpj;
    private String telefone;
    private String nome; 
    //public String MedicoVetResponsavel(?) verificar se coloca isso.
    
    
    // •--==> CONSTRUTOR
    
    // •--==> METODOS
    //listar todos os clientes
    public static void listarclientes(){
    System.out.println("Listar Clientes");
        Cliente cliente;
        for (int i = 0; i < Cliente.listaDeClientes.size(); i++) {
            System.out.println("Tutor(a): " + Cliente.listaDeClientes.get(i).getNomePessoa());
                }
            }
    
    //listar todos os pets
    public static void listarpets(){
    System.out.println("Listar Pets");
        Animal pet;
        for (int i = 0; i < Cliente.listaDePets.size(); i++) {
            System.out.println("Pet: " + Cliente.listaDePets.get(i).getNomePet());
                }
            }

    // •--==> GETTERS SETTERS
    public String getCnpj() {
            return cnpj;
        }
        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
        public String getTelefone() {
            return telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }    
}