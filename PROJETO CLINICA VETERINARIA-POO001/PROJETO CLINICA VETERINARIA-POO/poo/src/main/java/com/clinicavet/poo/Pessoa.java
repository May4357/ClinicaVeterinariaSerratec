package com.clinicavet.poo;

public abstract class Pessoa implements Login {
// •--==> ATRITUBTOS GLOBAIS
    private int idPessoa = 0;
    public static int contadorIdPessoa = 1;
// •--==> ATRITUBTOS
    private String nomePessoa;
    private String cpf;
    private String dataNascimento;
    private String email;
    private String usuario;
    private String senha;    
    private String telefone;

// •--==> MÉTODO LOGIN
public void login(){
    if(this instanceof MedicoVeterinario){
        //MenuVet.menuVet();
    } else if (this instanceof Cliente) {
        //MenuCliente.menuCliente();            
    }
}

// •--==> GETTERS SETTERS
    public String getNomePessoa() {
        return nomePessoa;
    }
    
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = (usuario);
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
