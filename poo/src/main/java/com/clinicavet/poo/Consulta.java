package com.clinicavet.poo;

import java.time.LocalDateTime;

public class Consulta extends Procedimento {

    private Animal animal;
    private Medicovet veterinario;
    private LocalDateTime dataConsulta;
    private StatusConsulta statusConsulta; //esse é um enum 


public Consulta(Animal animal, Medicovet veterinario, LocalDateTime dataConsulta) {
    this.animal = animal;
    this.veterinario = veterinario;
    this.dataConsulta = dataConsulta;

}
public Animal getAnimal() {
    return animal;
}
public void setAnimal(Animal animal) {
    this.animal = animal;
}
public Medicovet getVeterinario() {
    return veterinario;
}
public void setVeterinario(Medicovet veterinario) {
    this.veterinario = veterinario;
}
public LocalDateTime getDataConsulta() {
    return dataConsulta;
}
public void setDataConsulta(LocalDateTime dataConsulta) {
    this.dataConsulta = dataConsulta;
}
 public StatusConsulta getStatusConsulta() {
    return statusConsulta;
}

public void setStatusConsulta(StatusConsulta statusConsulta) {
    this.statusConsulta = statusConsulta;
    }

}