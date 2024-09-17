package com.clinicavet.poo;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class BancoDeDados {
    public static void criadorPessoas() {

        //BANCO DE VETS
        MedicoVeterinario medico0 = new MedicoVeterinario("TV");
        medico0.setUsuario("t");
        medico0.setSenha("t");
        MedicoVeterinario.listaDeVeterinarios.add(medico0);

        MedicoVeterinario medico1 = new MedicoVeterinario("Marina");
        medico1.setUsuario("m");
        medico1.setSenha("m");
        MedicoVeterinario.listaDeVeterinarios.add(medico1);
        
        MedicoVeterinario medico2 = new MedicoVeterinario("Isabella");
        medico2.setUsuario("i");
        medico2.setSenha("i");
        MedicoVeterinario.listaDeVeterinarios.add(medico2);

        //BANCO DE CLIENTES
        Cliente cliente0 = new Cliente("TC");
        cliente0.setUsuario("tc");
        cliente0.setSenha("tc");
        Cliente.listaDeClientes.add(cliente0);

        Cliente cliente1 = new Cliente("Johnny");
        cliente1.setUsuario("j");
        cliente1.setSenha("j");
        Cliente.listaDeClientes.add(cliente1);
        
        Cliente cliente2 = new Cliente("Arthur");
        cliente2.setUsuario("a");
        cliente2.setSenha("a");
        Cliente.listaDeClientes.add(cliente2);


        
        //BANCO DE PETS
        Animal animal0 = new Animal();
        animal0.setNomePet("TP");
        animal0.setDonoPet(cliente0);
        animal0.setGeneroPet(EnumGenero.MACHO);
        Cliente.listaDePets.add(animal0);

        Animal animal1 = new Animal();
        animal1.setNomePet("Rex");
        animal1.setDonoPet(cliente1);
        animal1.setGeneroPet(EnumGenero.FEMEA);
        Cliente.listaDePets.add(animal1);

        Animal animal2 = new Animal();
        animal2.setNomePet("Bob");
        animal2.setDonoPet(cliente1);
        animal2.setGeneroPet(EnumGenero.MACHO);
        Cliente.listaDePets.add(animal2);
        
        Animal animal3 = new Animal();
        animal3.setNomePet("Slash");
        animal3.setDonoPet(cliente2);
        animal3.setGeneroPet(EnumGenero.MACHO);
        Cliente.listaDePets.add(animal3);


        
        //DATAS
        LocalDate data1 = LocalDate.of(2024, 7, 5);
        LocalDate data2 = LocalDate.of(2024, 8, 5);
        LocalDate data3 = LocalDate.of(2024, 9, 5);
        //! datas não estão registrando 

        //PROCEDIMENTOS
        EnumProcedimento consultaenum = EnumProcedimento.CONSULTA;
        EnumProcedimento vacinaenum = EnumProcedimento.VACINA;
        EnumProcedimento cirurgiaenum = EnumProcedimento.PROCEDIMENTOCIRURGICO;

        //CONSULTAS
        Consulta consulta1 = new Consulta(animal0, medico0, cliente0, data1, cirurgiaenum);
        Animal.historicoDeProntuarios.add(consulta1);
        Consulta consulta2 = new Consulta(animal0, medico0, cliente0, data2, consultaenum);
        Animal.historicoDeProntuarios.add(consulta2);
        Consulta consulta3 = new Consulta(animal0, medico0, cliente0, data3, consultaenum);
        Animal.historicoDeProntuarios.add(consulta3);

        Consulta consulta4 = new Consulta(animal1, medico1, cliente1, data1, consultaenum);
        Animal.historicoDeProntuarios.add(consulta4);
        Consulta consulta5 = new Consulta(animal1, medico1, cliente1, data1, vacinaenum);
        Animal.historicoDeProntuarios.add(consulta5);
        Consulta consulta6 = new Consulta(animal1, medico1, cliente1, data2, vacinaenum);
        Animal.historicoDeProntuarios.add(consulta6);

        Consulta consulta7 = new Consulta(animal2, medico1, cliente1, data1, consultaenum);
        Animal.historicoDeProntuarios.add(consulta7);
        Consulta consulta8 = new Consulta(animal2, medico1, cliente1, data1, vacinaenum);
        Animal.historicoDeProntuarios.add(consulta8);
        Consulta consulta9 = new Consulta(animal2, medico1, cliente1, data2, vacinaenum);
        Animal.historicoDeProntuarios.add(consulta9);

        Consulta consulta10 = new Consulta(animal3, medico2, cliente2, data1, consultaenum);
        Animal.historicoDeProntuarios.add(consulta10);
        Consulta consulta11 = new Consulta(animal3, medico1, cliente2, data1, vacinaenum);
        Animal.historicoDeProntuarios.add(consulta11);
        Consulta consulta12 = new Consulta(animal3, medico1, cliente2, data2, vacinaenum);
        Animal.historicoDeProntuarios.add(consulta12);


        //Consulta consulta1 = new Consulta(animal1, medico1, cliente1);
        //System.out.println(consulta1.getDataConsulta());

    }
}
