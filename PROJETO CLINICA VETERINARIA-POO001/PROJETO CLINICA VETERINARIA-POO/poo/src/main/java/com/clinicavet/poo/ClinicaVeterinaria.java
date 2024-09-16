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
public ClinicaVeterinaria(String cnpj, String telefone, String nome) {
    this.cnpj = cnpj;
    this.telefone = telefone;
    this.nome = nome;
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
