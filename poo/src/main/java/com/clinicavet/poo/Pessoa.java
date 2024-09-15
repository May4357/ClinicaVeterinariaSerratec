package com.clinicavet.poo;

public abstract  class Pessoa {

private String nomePessoa;
private String cpf;
private String dataNascimento;
private String email;
private String telefone;






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
public String getTelefone() {
    return telefone;
}
public void setTelefone(String telefone) {
    this.telefone = telefone;
}





}
