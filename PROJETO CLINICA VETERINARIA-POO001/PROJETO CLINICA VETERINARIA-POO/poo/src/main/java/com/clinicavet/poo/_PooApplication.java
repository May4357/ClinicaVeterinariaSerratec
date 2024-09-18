package com.clinicavet.poo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class _PooApplication {
    // •--==> ATRIBUTOS GLOBAIS
    public static int contadorTentativas = 3;
    public static Pessoa usuarioLogado;

    public static void main(String[] args) {
        SpringApplication.run(_PooApplication.class, args);
        BancoDeDados.criadorPessoas();
        
        // •--==> ATRIBUTOS
        Scanner usuarioLeia = new Scanner(System.in);
        Scanner senhaLeia = new Scanner(System.in);
        
        // Códigos ANSI para cores
        final String ANSI_CYAN = "\u001B[36m"; // Ciano
        final String ANSI_GREEN = "\u001B[32m"; // Verde
        final String ANSI_RESET = "\u001B[0m"; // Resetar cor

        System.out.println(ANSI_CYAN + "\n===================================================");
        System.out.println("||   __  __                           __   ___   ||");
        System.out.println("||  |  \\|   |\\  /|    \\      /||\\   ||  \\ |   |  ||");
        System.out.println("||  |__/|__ | \\/ | ___ \\    / || \\  ||   \\|   |  ||");
        System.out.println("||  |  \\|   |    |      \\  /  ||  \\ ||   /|   |  ||");
        System.out.println("||  |__/|__ |    |       \\/   ||   \\||__/ |___|  ||");
        System.out.println("||                                               ||");
        System.out.println("===================================================" + ANSI_RESET);
        
        // Arte do cachorro em verde
        System.out.println( ANSI_GREEN +
            "       _=,_                   ((`\\      \n" +
            "    o_/6 /#\\                ___ \\\\ '--._  \n" +
            "    \\__ |##/               .'`   `'    o  ) \n" +
            "     ='|--\\               /    \\   '. __.'  \n" +
            "       /   #'-.           _|    /_  \\ \\_\\_   \n" +
            "       \\#|_   _'-. /     {_\\______\\-'\\__\\_\\  \n" +
            "        |/ \\_( # |\"       \n" +
            "       C/ ,--___/          \n" + ANSI_RESET
        );

        // •--==> MENU INICIAL DE LOGIN
        while (contadorTentativas > 0) {
            System.out.println(ANSI_CYAN +"\n=============================");
            System.out.println("|| CLINICA VET VIDA ANIMAL ||");
            System.out.println("=============================" + ANSI_RESET);			
            System.out.println("BOAS VINDAS A CLINICA VET");
            System.out.println("Faça o seu Login para acessar os serviços da clínica:");
            
			System.out.print("Para entrar com o login de cliente:\n");
            System.out.print("Usuários: 'tc', 'i', 'j' e 'a'.\n");
            System.out.print("Senhas: 'tc', 'j', 'i' e 'a'.\n");

            System.out.println("para testes use 't' e 't'\n");
            System.out.print("Usuário: ");
            String usuarioDigitado = usuarioLeia.nextLine();

            System.out.print("Senha: ");
            String senhaDigitada = senhaLeia.nextLine();

            if (autorizaCredenciais(usuarioDigitado, senhaDigitada)) { // ele vai no metodo abaixo
                contadorTentativas = 3;	// contador reseta se retornar true
                usuarioLogado.login(); //o Objeto logado agora vai pro Pessoa verificar se é medicovet ou cliente
            } else if (contadorTentativas > 1) {// se retornar false
                System.out.println("Login ou Senha incorretos");
                contadorTentativas--;
                System.out.println(contadorTentativas + " tentativas restantes.");
            } else {
                System.out.println("Cadastro Bloqueado! Entre em contato com a Coordenação.");
                // contadorTentativas--; //desativado para debug
            }
        }
    }

    public static boolean autorizaCredenciais(String usuarioDigitado, String senhaDigitada) {
        for (MedicoVeterinario vetLogin : MedicoVeterinario.listaDeVeterinarios) {
            // tenho que pegar o login e senha do p e comparar com os dados digitados
            if (vetLogin.getSenha().equalsIgnoreCase(senhaDigitada) && vetLogin.getUsuario().equalsIgnoreCase(usuarioDigitado)) {
                System.out.println("Login realizado com sucesso");
                usuarioLogado = vetLogin;
                return true;
            }
        }
        for (Cliente clienteLogin : Cliente.listaDeClientes) {
            // tenho que pegar o login e senha do a e comparar com os dados digitados
            if (clienteLogin.getSenha().equalsIgnoreCase(senhaDigitada) && clienteLogin.getUsuario().equalsIgnoreCase(usuarioDigitado)) {
                System.out.println("Login realizado com sucesso");
                usuarioLogado = clienteLogin;
                return true;
            }
        }
        return false;
    }
}