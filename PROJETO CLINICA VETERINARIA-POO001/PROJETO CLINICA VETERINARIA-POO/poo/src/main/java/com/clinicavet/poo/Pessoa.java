package com.clinicavet.poo;

public class Pessoa implements Login {
    
    // •--==> ATRITUBTOS GLOBAIS
        private int idPessoa = 0;
        public static int contadorIdPessoa = 1;
    // •--==> ATRITUBTOS
        protected  String nomePessoa;
        private String cpf;
        private String dataNascimento;
        private String email;
        private String usuario;
        private String senha;    
        private String telefone;
    
    public Pessoa(int idPessoa2, String nomePessoa2, String cpf2, String dataNascimento2, String email2,
                String usuario2, String senha2, String telefone2) {
            //TODO Auto-generated constructor stub
        }

    // •--==> CONSTRUTOR TESTE
    public Pessoa() {
    }

    // •--==> MÉTODO LOGIN
    public void login(){
        if(this instanceof MedicoVeterinario){
            _MenuVet.menuVet();
        } else if (this instanceof Cliente) {
            _MenuCliente.menuCliente();            
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