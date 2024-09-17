package com.clinicavet.poo;

public enum EnumStatusConsulta {
    AGENDADA ("Agendada"),
    FINALIZADO ("Finalizada"),
    CANCELADA ("Cancelada");




private final String descricao;

EnumStatusConsulta (String descricao){
    this.descricao=descricao;
}

public String get() {
    return descricao;
}
}
EnumStatusConsulta.descricao


