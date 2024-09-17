package com.clinicavet.poo;

public enum EnumProcedimento {
    CONSULTA("Consulta"),
    VACINA("Vacinas"),
    PROCEDIMENTOCIRURGICO("Procedimento Cirurgico");


    // Atributo
    private final String escolhaEnumProcedimento;

    // Construtor
    EnumProcedimento(String enumConsultaPorExtenso) {
        this.escolhaEnumProcedimento = enumConsultaPorExtenso;
    }

    // Getter
    public String getEscolhaProcedimentoEnum() {
        return escolhaEnumProcedimento;
    }
}
