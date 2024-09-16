package com.clinicavet.poo;

import java.time.LocalDateTime;

// verificar se vai manter essa classe.
public class ConsProcedimento extends Consulta{
// •--==> ATRITUBTOS
private String tipoProcedimento; // verificar se haverá : (Consulta , vacina , procedimento cirurgico(castração) )
private String dataProcedimento;
private MedicoVeterinario medicoVetResponsavel;


// •--==> CONSTRUTOR
public ConsProcedimento(Animal animal, MedicoVeterinario veterinario, LocalDateTime dataConsulta) {
    super(animal, veterinario, dataConsulta);
    //TODO Auto-generated constructor stub
}

// •--==> METODOS

// •--==> GETTERS SETTERS
}
