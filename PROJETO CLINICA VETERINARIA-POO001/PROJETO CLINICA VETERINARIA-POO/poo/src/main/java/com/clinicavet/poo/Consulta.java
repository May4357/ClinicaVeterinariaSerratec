package com.clinicavet.poo;

import java.time.LocalDateTime;

public class Consulta {
    // •--==> ATRITUBTOS

    private Animal animal;
    private MedicoVeterinario veterinario;
    private LocalDateTime dataConsulta;
    private EnumStatusConsulta statusConsulta; // esse é um enum

    // •--==> CONSTRUTOR
    public Consulta(Animal animal, MedicoVeterinario veterinario, LocalDateTime dataConsulta) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.dataConsulta = dataConsulta;

    // •--==> METODOS

    // •--==> GETTERS SETTERS
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public MedicoVeterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(MedicoVeterinario veterinario) {
        this.veterinario = veterinario;
    }

    public LocalDateTime getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDateTime dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public EnumStatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(EnumStatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

}