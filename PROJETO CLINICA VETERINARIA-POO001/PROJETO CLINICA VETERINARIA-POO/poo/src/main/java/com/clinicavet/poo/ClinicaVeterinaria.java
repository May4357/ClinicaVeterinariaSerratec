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
            System.out.println("------------------------");
            System.out.println("Tutor(a): " + Cliente.listaDePets.get(i).getDonoPet().getNomePessoa());
            System.out.println("------------------------");
            System.out.println("Pet: " + Cliente.listaDePets.get(i).getNomePet());
            System.out.println("Especie: " + Cliente.listaDePets.get(i).getEspecieAnimal());
            System.out.println("Raça: " + Cliente.listaDePets.get(i).getRaca());
            System.out.println("Cor: " + Cliente.listaDePets.get(i).getCor());
            System.out.println("Genero: " + Cliente.listaDePets.get(i).getGeneroPet());
            System.out.println("Última consulta: " + Cliente.listaDePets.get(i).getDataUltimaConsulta());
            System.out.println("------------------------\n");
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