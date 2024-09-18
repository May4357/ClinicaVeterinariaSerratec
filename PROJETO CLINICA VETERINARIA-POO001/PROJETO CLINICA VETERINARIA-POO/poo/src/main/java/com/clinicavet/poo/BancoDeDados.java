package com.clinicavet.poo;

import java.time.LocalDate;

public class BancoDeDados {
    public static void criadorPessoas() {

        // DATAS
        LocalDate data1 = LocalDate.of(2024, 7, 5);
        LocalDate data2 = LocalDate.of(2024, 8, 5);
        LocalDate data3 = LocalDate.of(2023, 9, 5);
        LocalDate data4 = LocalDate.of(2023, 4, 5);
        LocalDate data5 = LocalDate.of(2022, 3, 6);
        LocalDate data6 = LocalDate.of(2022, 3, 15);

        // BANCO DE VETS
        MedicoVeterinario medico0 = new MedicoVeterinario("TV");
        medico0.setUsuario("t");
        medico0.setSenha("t");
        MedicoVeterinario.listaDeVeterinarios.add(medico0);

        MedicoVeterinario medico1 = new MedicoVeterinario("Marina");
        medico1.setUsuario("m");
        medico1.setSenha("m");
        MedicoVeterinario.listaDeVeterinarios.add(medico1);
        
        MedicoVeterinario medico2 = new MedicoVeterinario("Odair");
        medico2.setUsuario("o");
        medico2.setSenha("o");
        MedicoVeterinario.listaDeVeterinarios.add(medico2);

        // BANCO DE CLIENTES
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

        Cliente cliente3 = new Cliente("Isabella");
        cliente3.setUsuario("i");
        cliente3.setSenha("i");
        Cliente.listaDeClientes.add(cliente3);
        
        // BANCO DE PETS
        Animal animal0 = new Animal();
        animal0.setNomePet("TP");
        animal0.setDonoPet(cliente0);
        animal0.setGeneroPet(EnumGenero.MACHO);
        animal0.setEspecieAnimal(EnumEspecieAnimal.GATO);
        animal0.setRaca("Siames");
        animal0.setCor(EnumCorPet.MARROM);
        animal0.setDataUltimaConsulta(data1);
        Cliente.listaDePets.add(animal0);

        Animal animal1 = new Animal();
        animal1.setNomePet("Domingas");
        animal1.setDonoPet(cliente1);
        animal1.setGeneroPet(EnumGenero.FEMEA);
        animal1.setEspecieAnimal(EnumEspecieAnimal.REPTIL);
        animal1.setRaca("Tinga");
        animal1.setCor(EnumCorPet.BICOLOR);
        animal1.setDataUltimaConsulta(data4);
        Cliente.listaDePets.add(animal1);

        Animal animal2 = new Animal();
        animal2.setNomePet("Bob");
        animal2.setDonoPet(cliente1);
        animal2.setGeneroPet(EnumGenero.MACHO);
        animal2.setEspecieAnimal(EnumEspecieAnimal.CACHORRO);
        animal2.setRaca("Caramelo");
        animal2.setCor(EnumCorPet.CARAMELO);
        animal2.setDataUltimaConsulta(data5);
        Cliente.listaDePets.add(animal2);
        
        Animal animal3 = new Animal();
        animal3.setNomePet("Tom");
        animal3.setDonoPet(cliente2);
        animal3.setEspecieAnimal(EnumEspecieAnimal.GATO);
        animal3.setRaca("Vira-Lata");
        animal3.setCor(EnumCorPet.CINZA);
        animal3.setDataUltimaConsulta(data2);
        animal3.setGeneroPet(EnumGenero.MACHO);
        Cliente.listaDePets.add(animal3);

        Animal animal4 = new Animal();
        animal4.setNomePet("Aurora");
        animal4.setDonoPet(cliente3);
        animal4.setEspecieAnimal(EnumEspecieAnimal.GATO);
        animal4.setRaca("Laranja");
        animal4.setCor(EnumCorPet.MALHADO);
        animal4.setDataUltimaConsulta(data1);
        animal4.setGeneroPet(EnumGenero.FEMEA);
        Cliente.listaDePets.add(animal4);
        
        // PROCEDIMENTOS
        EnumProcedimento consultaenum = EnumProcedimento.CONSULTA;
        EnumProcedimento vacinaenum = EnumProcedimento.VACINA;
        EnumProcedimento cirurgiaenum = EnumProcedimento.PROCEDIMENTOCIRURGICO;

        // STATUS CONSULTA
        EnumStatusConsulta statusConsulta = EnumStatusConsulta.AGENDADA;
        EnumStatusConsulta statusConsulta1 = EnumStatusConsulta.FINALIZADA;

        // CONSULTAS
        Consulta consulta1 = new Consulta(animal0, medico0, cliente0, data1, cirurgiaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta1);
        Consulta consulta2 = new Consulta(animal0, medico0, cliente0, data2, consultaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta2);
        Consulta consulta3 = new Consulta(animal0, medico0, cliente0, data3, consultaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta3);

        Consulta consulta4 = new Consulta(animal1, medico1, cliente1, data4, consultaenum, statusConsulta1);
        Animal.historicoDeProntuarios.add(consulta4);
        Consulta consulta5 = new Consulta(animal1, medico1, cliente1, data4, vacinaenum, statusConsulta1);
        Animal.historicoDeProntuarios.add(consulta5);
        Consulta consulta6 = new Consulta(animal1, medico1, cliente1, data5, vacinaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta6);

        Consulta consulta7 = new Consulta(animal2, medico1, cliente1, data5, consultaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta7);
        Consulta consulta8 = new Consulta(animal2, medico1, cliente1, data5, vacinaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta8);
        Consulta consulta9 = new Consulta(animal2, medico1, cliente1, data6, vacinaenum, statusConsulta1);
        Animal.historicoDeProntuarios.add(consulta9);

        Consulta consulta10 = new Consulta(animal3, medico2, cliente2, data2, consultaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta10);
        Consulta consulta11 = new Consulta(animal3, medico1, cliente2, data2, vacinaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta11);
        Consulta consulta12 = new Consulta(animal3, medico1, cliente2, data3, vacinaenum, statusConsulta);
        Animal.historicoDeProntuarios.add(consulta12);

        Consulta consulta13 = new Consulta(animal4, medico2, cliente3, data1, consultaenum, statusConsulta1);
        Animal.historicoDeProntuarios.add(consulta13);
        Consulta consulta14 = new Consulta(animal4, medico2, cliente3, data3, vacinaenum, statusConsulta1);
        Animal.historicoDeProntuarios.add(consulta14);
        Consulta consulta15 = new Consulta(animal4, medico2, cliente3, data6, vacinaenum, statusConsulta1);
        Animal.historicoDeProntuarios.add(consulta15);

        Consulta consulta16 = new Consulta(animal0, medico0, cliente0, data1, cirurgiaenum, statusConsulta);
        animal0.adicionarConsulta(consulta1); 
        Consulta consulta17 = new Consulta(animal0, medico0, cliente0, data2, consultaenum, statusConsulta);
        animal0.adicionarConsulta(consulta2);        
        Consulta consulta18 = new Consulta(animal0, medico0, cliente0, data3, consultaenum, statusConsulta);
        animal0.adicionarConsulta(consulta3);        
        Consulta consulta19 = new Consulta(animal1, medico1, cliente1, data4, consultaenum, statusConsulta1);
        animal1.adicionarConsulta(consulta4);
        
    }
}
