package com.clinicavet.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.time.LocalDate;

@SpringBootApplication
public class Trabalho2Application {
	// •--==> ATRITUBTOS GLOBAIS
	public static int contadorTentativas = 3;
	public static Pessoa usuarioLogado;

	public static void main(String[] args) {
		SpringApplication.run(Trabalho2Application.class, args);
		
		MedicoVeterinario med1 = new MedicoVeterinario("Johnny");
			med1.setUsuario("a");
			med1.setSenha("a");

		// •--==> ATRITUBTOS
		Scanner usuarioLeia = new Scanner(System.in);
		Scanner senhaLeia = new Scanner(System.in);

		// •--==> MENU INICIAL DE LOGIN
		while (contadorTentativas > 0) {
			System.out.println("•---===CLINICA VET===---•");
			System.out.println("BOAS VINDAS A CLINICA VET");
			System.out.println("Faça o seu Login para acessar os serviços da clínica:");

			System.out.println("Usuário: ");
			String usuarioDigitado = usuarioLeia.nextLine();

			System.out.println("Senha: ");
			String senhaDigitada = senhaLeia.nextLine();

			if (autorizaCredenciais(usuarioDigitado, senhaDigitada)) { // ele vai no metodo abaixo
				contadorTentativas = 3;	// contador reseta se retornar true
				usuarioLogado.login(); //o Objeto logado agora vai pro Pessoa verificar se é medicovet ou cliente

			} else if (contadorTentativas > 1) {// se retornar false
				System.out.println(("Login ou Senha incorretos"));
				contadorTentativas--;
				System.out.println((contadorTentativas + " tentativas restantes."));
			} else {
				System.out.println("Cadastro Bloqueado! Entre em contato com a Coordenação.");
				//contadorTentativas--; //desativado para debug
			}
		}
	}
	public static boolean autorizaCredenciais(String usuarioDigitado, String senhaDigitada) {
		for (MedicoVeterinario vetLogin : MedicoVeterinario.listaDeVeterinarios) {
			// tenho que pegar o login e senha do p e comparar com os dados digitados
			if (vetLogin.getSenha().equals(senhaDigitada) && vetLogin.getUsuario().equals(usuarioDigitado)) {
				System.out.println(("Login realizado com sucesso"));
				System.out.println(("joga para o menu profs"));
				usuarioLogado = vetLogin;
				return true;
			}
			for (Cliente clienteLogin : Cliente.listaDeClientes) {
				// tenho que pegar o login e senha do a e comparar com os dados digitados
				if (clienteLogin.getSenha().equals(senhaDigitada) && clienteLogin.getUsuario().equals(usuarioDigitado)) {
					System.out.println(("Login realizado com sucesso"));
					System.out.println(("joga para o menu profs"));
					usuarioLogado = clienteLogin;
					return true;
				}
			}

		}
	return false;
	}
}