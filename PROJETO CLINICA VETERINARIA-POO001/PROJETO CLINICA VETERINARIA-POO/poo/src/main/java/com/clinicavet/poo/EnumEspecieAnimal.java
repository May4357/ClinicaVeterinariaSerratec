package com.clinicavet.poo;

public enum EnumEspecieAnimal {
    CACHORRO("Cachorro"),
    GATO("Gato"),
    ROEDOR("Roedor"),
    AVE("Ave"),
    REPTIL("Réptil");


    private final String racaPorExtenso;
    
    EnumEspecieAnimal(String racaPorExtenso) {
        this.racaPorExtenso = racaPorExtenso;
    }

    public String getracaPorExtenso() {
        return racaPorExtenso;
    }
}