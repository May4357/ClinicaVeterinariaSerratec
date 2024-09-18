
package com.clinicavet.poo;

import java.util.ArrayList;
import java.time.LocalDate;

public class Animal {//  dono 1 -> n pets
    public static ArrayList<Consulta> historicoDeProntuarios = new ArrayList<Consulta>();
    
    // •--==> ATRITUBTOS
    private String nomePet;
    private LocalDate dataNascimento;
    private LocalDate dataUltimaConsulta;
    private EnumEspecieAnimal especieAnimal; // esse é um enum
    private String raca;
    private EnumCorPet cor; // esse é um enum.
    private Cliente donoPet; // composição
    private EnumGenero generoPet;
    
    // •--==> CONSTRUTOR
    public Animal(String nomePet, LocalDate dataNascimento, EnumEspecieAnimal especieAnimal, String raca,
    EnumCorPet cor, Cliente donoPet, EnumGenero generoPet) {
        this.nomePet = nomePet;
        this.dataNascimento = dataNascimento;
        this.especieAnimal = especieAnimal;
        this.raca = raca;
        this.cor = cor;
        this.donoPet = donoPet;
        this.generoPet = generoPet;
    }
    
    public Animal() {
        
    }
    
    // •--==> METODOS
    public static void adicionarConsulta(Consulta datasDeConsultas) {        
        historicoDeProntuarios.add(datasDeConsultas);
    }
    
    
    public static ArrayList<Consulta> visualizarHistoricoPet() {
        return historicoDeProntuarios;
    }

    // •--==> GETTERS SETTERS
    public static ArrayList<Consulta> getHistoricoDeProntuarios() {
        return historicoDeProntuarios;
    }

    public static void setHistoricoDeProntuarios(ArrayList<Consulta> historicoDeProntuarios) {
        Animal.historicoDeProntuarios = historicoDeProntuarios;
    }
    
    public String getNomePet() {
        return nomePet;
    }
    
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public LocalDate getDataUltimaConsulta() {
        return dataUltimaConsulta;
    }

    public void setDataUltimaConsulta(LocalDate dataUltimaConsulta) {
        this.dataUltimaConsulta = dataUltimaConsulta;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EnumEspecieAnimal getEspecieAnimal() {
        return especieAnimal;
    }

    public void setEspecieAnimal(EnumEspecieAnimal especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public EnumCorPet getCor() {
        return cor;
    }

    public void setCor(EnumCorPet cor) {
        this.cor = cor;
    }

    public Cliente getDonoPet() {
        return donoPet;
    }

    public void setDonoPet(Cliente donoPet) {
        this.donoPet = donoPet;
    }

    public EnumGenero getGeneroPet() {
        return generoPet;
    }

    public void setGeneroPet(EnumGenero generoPet) {
        this.generoPet = generoPet;
    }
}