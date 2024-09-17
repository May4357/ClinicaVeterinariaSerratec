package com.clinicavet.poo;

import java.time.LocalDate;

public class Consulta {
    // •--==> ATRITUBTOS

    private Animal animal;
    private Cliente donoPet;
    private MedicoVeterinario medicoVetResponsavel;
    private LocalDate dataConsulta;
    private EnumStatusConsulta statusConsulta;
    private EnumProcedimento procedimento;

    // •--==> CONSTRUTOR
    public Consulta(Animal animal, MedicoVeterinario veterinario) {
        this.animal = animal;
        this.medicoVetResponsavel = veterinario;
        this.dataConsulta = LocalDate.now();
            

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
        return medicoVetResponsavel;
    }

    public void setVeterinario(MedicoVeterinario veterinario) {
        this.medicoVetResponsavel = veterinario;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public EnumStatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(EnumStatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

}