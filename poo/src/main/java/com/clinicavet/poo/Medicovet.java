package com.clinicavet.poo;

public class Medicovet extends Pessoa {

private int crmv;//Conselho Regional de Medicina Veterinária
private String especialidade;
//acrescentar login e senha
//deve ser capaz de registrar um atendimento de um pet 
//capaz de visualizar os pets que não se consultam há mais de 6 meses .
//cadastrar novo cliente (?) ou criar uma classe recepção(?)

/*public Medicovet{

super();

}
*/

public int getCrmv() {
    return crmv;
}


public void setCrmv(int crmv) {
    this.crmv = crmv;
}


public String getEspecialidade() {
    return especialidade;
}


public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}




}
