package com.clinicavet.poo;

import java.util.ArrayList;
import java.time.LocalDate;

public class Cliente extends Pessoa implements Login{

// •--==> LISTA DE CLIENTES
    public static ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

// •--==> ATRITUBTOS
//private int idCliente;
    private LocalDate dataCadastro;

// •--==> CONSTRUTOR
public Cliente(int idPessoa, String nomePessoa, String cpf, String dataNascimento, String email,
    String usuario, String senha, String telefone){
        super(idPessoa, nomePessoa, cpf, dataNascimento, email, usuario, senha, telefone);
    }
public Cliente(String nomeCliente) {
    this.setNomePessoa(nomeCliente);
}

// •--==> METODOS
public void login(){}
// •--==> GETTERS SETTERS

//login e senha 
//deve consultar os prontuários (historicos de atendimento) de TODOS os SEUS pets. 



}