
package com.clinicavet.poo;

import java.util.ArrayList;
import java.time.LocalDate;

public class Animal  {
    public static ArrayList<Animal> listaDeClientes = new ArrayList<Animal>();

    // •--==> ATRITUBTOS
    private String nomePet;
    private String dataNascimento;
    private EnumEspecieAnimal especieAnimal; //esse é um enum
    private String raca;
    private EnumCorPet cor; // esse é um enum.
    private Cliente donoPet; //composição    
    private EnumGenero generoPet;
    
    // •--==> CONSTRUTOR
    public Animal(String nomePet, String dataNascimento, EnumEspecieAnimal especieAnimal, String raca, EnumCorPet cor,
    Cliente donoPet, EnumGenero generoPet) {
        this.nomePet = nomePet;
        this.dataNascimento = dataNascimento;
        this.especieAnimal = especieAnimal;
        this.raca = raca;
        this.cor = cor;
        this.donoPet = donoPet;
        this.generoPet = generoPet;
    }
    public Animal(){}
    
    // •--==> METODOS
    
    // •--==> GETTERS SETTERS
    public String getNomePet() {
        return nomePet;
    }
    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
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