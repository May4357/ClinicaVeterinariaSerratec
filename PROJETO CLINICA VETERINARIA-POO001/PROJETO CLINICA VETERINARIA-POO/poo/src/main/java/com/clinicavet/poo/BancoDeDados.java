package com.clinicavet.poo;

public class BancoDeDados {
    public static void criadorPessoas() {

        MedicoVeterinario medico1 = new MedicoVeterinario("Marina");
        medico1.setUsuario("m");
        medico1.setSenha("m");
        MedicoVeterinario.listaDeVeterinarios.add(medico1);

        Cliente cliente1 = new Cliente("Johnny");
        cliente1.setUsuario("j");
        cliente1.setSenha("j");
        Cliente.listaDeClientes.add(cliente1);

        Animal animal1 = new Animal();
        animal1.setNomePet("Rex");
        animal1.setDonoPet(cliente1);
        animal1.setGeneroPet(EnumGenero.FEMEA);
        Cliente.listaDePets.add(animal1);

        Consulta consulta1 = new Consulta(animal1, medico1, cliente1);
        System.out.println(consulta1.getDataConsulta());

        System.out.println(Cliente.getListaDeClientes().contains(Cliente.class.equals("Johnny")));
        System.out.println(Cliente.getNomePessoaBusca("Johnny"));

    }
}
