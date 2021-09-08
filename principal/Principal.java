package principal;

import leituraDeDados.*;
import pessoas.*;
import produtos.*;
import arraylists.*;

public class Principal {

	//Inst�ncia de objetos para pr�-carregamento do programa
	//adicionando-os aos seus respectivos ArrayList
	public static void carregamentoInicial() {
		//Perfume
		Perfumaria zaad = new Perfumaria(249.90, 95, "B81382", "ZAAD", "Santal",
				"Perfumaria Masculina", "Vegano e Cruelty Free", "Amadeirado", "Amadeirado");
		ConjuntoPerfumaria.cadastrarPerfume(zaad);
		Perfumaria malbec = new Perfumaria(143.90, 100, "B83188", "Malbec", "Bleu",
				"Perfumaria Masculina", "Cruelty Free", "", "");
		ConjuntoPerfumaria.cadastrarPerfume(malbec);
		
		//Hidratante
		Hidratante nativaSPA = new Hidratante(42.90, 200, "B81338", "Nativa SPA", 
				"Org�nico","Todos os tipos");
		ConjuntoHidratante.cadastrarHidratante(nativaSPA);
		Hidratante lily = new Hidratante(74.90, 250, "B77687", "Lily", "", 
				"Todos os tipos");
		ConjuntoHidratante.cadastrarHidratante(lily);
		
		//ProtetorSolar
		ProtetorSolar cuidesebem = new ProtetorSolar(54.90, 50, "B72104", 
				"Cuide-se bem","Faciall", "Cruelty Free", 50);
		ConjuntoProtetorSolar.cadastrarProtetorSolar(cuidesebem);
		ProtetorSolar cuidesebem2 = new ProtetorSolar(55.90, 200, "B75844", 
				"Cuide-se bem","Solar", "Cruelty Free", 30);
		ConjuntoProtetorSolar.cadastrarProtetorSolar(cuidesebem2);
		
		//Shampoo
		Shampoo nativaSPA2 = new Shampoo(44.90, 300, "B79919", "Nativa SPA", "Matcha",
				"Todos os tipos", "Cruelty Free", "Res�duos");
		ConjuntoShampoo.cadastrarShampoo(nativaSPA2);
		Shampoo match = new Shampoo(35.90, 250, "B81651", "Match.", "Anti Oleosidade",
				"Oleosos ou Mistos", "Vegano e Cruelty Free", "Olesosos");
		ConjuntoShampoo.cadastrarShampoo(match);
		
		//Condicionador
		Condicionador cuidesebem3 = new Condicionador(24.90, 250, "B73913", 
				"Cuide-se bem", "Lisos", "Todos os tupos", "Cruelty Free", 
				"Envelhecimento dos fios");
		ConjuntoCondicionador.cadastrarCondicionador(cuidesebem3);
		Condicionador sophie = new Condicionador(30.90, 200, "B75163", 
				"Sophie", "", "Todos os tipos", "Cruelty Free", "Res�duos");
		ConjuntoCondicionador.cadastrarCondicionador(sophie);
		
		//Sabonete L�quido
		SaboneteLiquido nativaSPA3 = new SaboneteLiquido(31.90, 200, "B71196",
				"Nativa SPA","Lichia", "Cruelty Free");
		ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(nativaSPA3);
		SaboneteLiquido floratta = new SaboneteLiquido(15.90, 75, "B75101", 
				"Floratta","Rose", "Cruelty Free");
		ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(floratta);
		
		//Cliente
		Cliente cliente1 = new Cliente("12388899970", "12345", "Jonas",
				"jonas@gmail.com", "61991231231", "Masculino");
		ConjuntoCliente.cadastrarCliente(cliente1);
		Cliente cliente2 = new Cliente("127312731238", "772312", "Maria",
				"maria@gmail.com", "413123123", "Feminino");
		ConjuntoCliente.cadastrarCliente(cliente2);
	}
	
	
	public static void main(String[] args) {
		//Declara��es
		int opcao = 0;
		char escolha = 0;
		
		//Cria um gerenciador do sistema
		GerenciadorDoSistema funcionario = new GerenciadorDoSistema("12345678900", "login");
		
		//Chama o m�todo de pr�-carregamento dos objetos
		carregamentoInicial();
		
		//Inicia o menu com suas funcionalidades
		do {
			System.out.println();
			opcao = menu();
			switch (opcao) {
			case 1:
				cadastrarProduto(funcionario);
				break;
			case 2:
				cadastrarCliente();
				break;
			case 3:
				editarProduto(funcionario);
				break;
			case 4:
				editarCliente(funcionario);
				break;
			case 5:
				listarDadosDosProdutos();
				break;
			case 6:
				listarDadosDosClientes();
				break;
			case 7:
				deletarProduto(funcionario);
				break;
			case 8:
				deletarCliente(funcionario);
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				escolha = sair();
				if (escolha == 'S' || escolha == 's') {
					System.out.println("=============================================================================");
					System.out.println("Voc� optou por sair do programa...");
					System.out.println("=============================================================================");
					System.exit(0);
					break;
				}
			}
		} while(opcao != 12 || escolha == 'n' || escolha == 'N');
	}

	
	public static int menu() {
		//Declara��es
		int opcao = 0;
		
		System.out.println("=============== PERFUMARIA, CORPO E BANHO ========================================================");
		System.out.println("[1] Cadastrar um produto");
		System.out.println("[2] Cadastrar um cliente");
		System.out.println("[3] Editar informa��es de um produto");
		System.out.println("[4] Editar informa��es de um cliente");
		System.out.println("[5] Listar dados dos produtos");
		System.out.println("[6] Listar dados dos clientes");
		System.out.println("[7] Deletar um produto");
		System.out.println("[8] Deletar um cliente");
		System.out.println("[11] Realizar uma compra");
		System.out.println("[12] Sair");
		System.out.println("===============================================================================================");
		System.out.print(">>>Sua op��o: ");
		do {
			opcao = LerDados.lerInt(opcao);
			if (opcao < 1 || opcao > 12) {
				System.out.print(">>>Digite um valor v�lido: ");
			}
		} while(opcao < 1 || opcao > 12);
		
		return opcao;
	}
	
	
	//Login (ambiente de acesso aos m�todos)
	public static boolean login(GerenciadorDoSistema funcionario) {
		//Declara��es
		String cpf = "", senha = "";
		
		//Somente o administrador pode cadastrar, editar ou remover um produto no sistema
		System.out.println("===============================================================================================");
		System.out.println("LOGIN:");
		System.out.print(">>>CPF: ");
		cpf = LerDados.lerString();
		System.out.print(">>>Senha: ");
		senha = LerDados.lerString();
		
		//Se o login for validado, o m�todo retorna true, sen�o retorna false
		if (cpf.equals(funcionario.getCpf()) && senha.equals(funcionario.getSenha())) {
			return true;
		} else {
			return false;
		}
	}
	
	//OP��O 1
	public static void cadastrarProduto(GerenciadorDoSistema funcionario) {
		//Declara��es
		int opcao = 0;
		
		//Se o login tiver sido validado com sucesso, podemos prosseguir com o cadastro
		if (login(funcionario)) {
			System.out.println("===============================================================================================");
			System.out.println("Qual produto deseja cadastrar?");
			System.out.println("[1] Perfume");
			System.out.println("[2] Hidratante");
			System.out.println("[3] Protetor Solar");
			System.out.println("[4] Shampoo");
			System.out.println("[5] Condicionador");
			System.out.println("[6] Sabonete L�quido");
			System.out.println("[0] Voltar ao menu");
			System.out.println("===============================================================================================");
			System.out.print(">>>Sua op��o: ");
			do {
				opcao = LerDados.lerInt(opcao);
				if (opcao < 0 || opcao > 6) {
					System.out.print(">>>Digite um valor v�lido: ");
				}
			} while(opcao < 0 || opcao > 6);
			
			switch (opcao) {
			case 1:
				cadastrarPerfume();
				break;
			case 2:
				cadastrarHidratante();
				break;
			case 3:
				cadastrarProtetorSolar();
				break;
			case 4:
				cadastrarShampoo();
				break;
			case 5:
				cadastrarCondicionador();
				break;
			case 6:
				cadastrarSaboneteLiquido();
				break;
			}
		} else {
			System.out.println("===============================================================================================");
			System.out.println("Usu�rio n�o autenticado. Tente novamente.");
			System.out.println("===============================================================================================");
		}
	}
	public static void cadastrarPerfume() {
		//Declara��es
		double preco = 0, volume = 0;
		String codigo = "", marca = "";
		String linha = "", categoria = "";
		String propriedades = "", familia = "";
		String subfamilia = "";
		
		//Leitura dos dados do usu�rio
		System.out.println("===============================================================================================");
		System.out.print(">>>Pre�o do perfume: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do perfume (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>C�digo do perfume: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do perfume: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do perfume: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Categoria do perfume: ");
		categoria = LerDados.lerString();
		
		System.out.print(">>>Propriedades do perfume: ");
		propriedades = LerDados.lerString();
		
		System.out.print(">>>Fam�lia olfativa do perfume: ");
		familia = LerDados.lerString();
		
		System.out.print(">>>Subfam�lia do perfume: ");
		subfamilia = LerDados.lerString();
		System.out.println("\n===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		Perfumaria perfume = new Perfumaria(preco, volume, codigo, marca, linha, 
				categoria, propriedades, familia, subfamilia);
		
		//Adicionando o objeto criado no ArrayList ConjuntoPerfumaria
		ConjuntoPerfumaria.cadastrarPerfume(perfume);
	}
	public static void cadastrarHidratante() {
		//Declara��es
		double preco = 0, volume = 0;
		String codigo = "", marca = "";
		String linha = "", tipo = "";
		
		//Leitura dos dados do usu�rio
		System.out.println("===============================================================================================");
		System.out.print(">>>Pre�o do hidratante: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do hidratante (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>C�digo do hidratante: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do hidratante: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do hidratante: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Tipo de pele do hidratante: ");
		tipo = LerDados.lerString();
		System.out.println("\n===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		Hidratante hidratante = new Hidratante(preco, volume, codigo, marca, linha, tipo);
		
		//Adicionando o objeto criado no ArrayList ConjuntoHidratante
		ConjuntoHidratante.cadastrarHidratante(hidratante);
	}
	public static void cadastrarProtetorSolar() {
		//Declara��es
		double preco = 0, volume = 0;
		String codigo = "", marca = "";
		String linha = "", propriedades = "";
		int fps = 0;
		
		//Leitura dos dados do usu�rio
		System.out.println("===============================================================================================");
		System.out.print(">>>Pre�o do protetor solar: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do protetor solar (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>C�digo do protetor solar: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do protetor solar: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do protetor solar: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Propridades do protetor solar: ");
		propriedades = LerDados.lerString();
		
		System.out.print(">>>FPS do protetor solar: ");
		fps = LerDados.lerInt(fps);
		System.out.println("\n===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		ProtetorSolar protetor = new ProtetorSolar(preco, volume, codigo, marca,
				linha, propriedades, fps);
		
		//Adicionando o objeto criado no ArrayList ConjuntoProtetorSolar
		ConjuntoProtetorSolar.cadastrarProtetorSolar(protetor);
	}
	public static void cadastrarShampoo() {
		//Declara��es
		double preco = 0, volume = 0;
		String codigo = "", marca = "";
		String linha = "", tipo = "";
		String propriedades = "", condicao = "";
		
		//Leitura dos dados do usu�rio
		System.out.println("===============================================================================================");
		System.out.print(">>>Pre�o do shampoo: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do shampoo (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>C�digo do shampoo: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do shampoo: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do shampoo: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Tipo de cabelo do shampoo: ");
		tipo = LerDados.lerString();
		
		System.out.print(">>>Propridades do shampoo: ");
		propriedades = LerDados.lerString();
		
		System.out.print(">>>Condi��o dos fios do shampoo: ");
		condicao = LerDados.lerString();
		System.out.println("\n===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		Shampoo shampoo = new Shampoo(preco, volume, codigo, marca, linha, tipo, 
				propriedades, condicao);
		
		//Adicionando o objeto criado no ArrayList ConjuntoShampoo
		ConjuntoShampoo.cadastrarShampoo(shampoo);
	}
	public static void cadastrarCondicionador() {
		//Declara��es
		double preco = 0, volume = 0;
		String codigo = "", marca = "";
		String linha = "", tipo = "";
		String propriedades = "", condicao = "";
		
		//Leitura dos dados do usu�rio
		System.out.println("===============================================================================================");
		System.out.print(">>>Pre�o do condicionador: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do condicionador (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>C�digo do condicionador: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do condicionador: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do condicionador: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Tipo de cabelo do condicionador: ");
		tipo = LerDados.lerString();
		
		System.out.print(">>>Propridades do condicionador: ");
		propriedades = LerDados.lerString();
		
		System.out.print(">>>Condi��o dos fios do condicionador: ");
		condicao = LerDados.lerString();
		System.out.println("\n===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		Condicionador condicionador = new Condicionador(preco, volume, codigo, 
				marca, linha, tipo, propriedades, condicao);
		
		//Adicionando o objeto criado no ArrayList ConjuntoCondicionador
		ConjuntoCondicionador.cadastrarCondicionador(condicionador);
	}
	public static void cadastrarSaboneteLiquido() {
		//Declara��es
		double preco = 0, volume = 0;
		String codigo = "", marca = "";
		String linha = "", propriedades = "";
		
		//Leitura dos dados do usu�rio
		System.out.println("===============================================================================================");
		System.out.print(">>>Pre�o do sabonete l�quido: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do sabonete l�quido (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>C�digo do sabonete l�quido: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do sabonete l�quido: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do sabonete l�quido: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Propriedades do sabonete l�quido: ");
		propriedades = LerDados.lerString();
		System.out.println("\n===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		SaboneteLiquido sabonete = new SaboneteLiquido(preco, volume, codigo, 
				marca, linha, propriedades);
		
		//Adicionando o objeto criado no ArrayList ConjuntoSaboneteLiquido
		ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(sabonete);
	}
	
	//OP��O 2
	public static void cadastrarCliente() {
		//Declara��es
		String nome = "", email = "", cpf = "", celular = "", genero = "", senha = "";
		
		//Leitura dos dados do usu�rio
		System.out.println("===================================================================================================");
		System.out.print(">>>Nome do cliente: ");
		nome = LerDados.lerString();
		
		System.out.print(">>>E-mail do cliente: ");
		email = LerDados.lerString();
		
		System.out.print(">>>CPF do cliente: ");
		cpf = LerDados.lerString();
		
		System.out.print(">>>Celular do cliente: ");
		celular = LerDados.lerString();
		
		System.out.print(">>>G�nero do cliente: ");
		genero = LerDados.lerString();
		
		System.out.print(">>>Senha do cliente: ");
		senha = LerDados.lerString();
		System.out.println("===================================================================================================");
		System.out.println("CLIENTE CADASTRADO!");
		System.out.println("===================================================================================================");
		
		//Cria��o do objeto do tipo Cliente atrav�s Construtor
		Cliente cliente = new Cliente(cpf, senha, nome, email, celular, genero);
		
		//Adicionando o objeto criado no ArrayList de Produto
		ConjuntoCliente.cadastrarCliente(cliente);
	}
	
	//OP��O 3
	public static void editarProduto(GerenciadorDoSistema funcionario) {
		//Declara��es
		int opcao = 0;
		String codigo = "";
		Perfumaria perfume;
		Hidratante hidratante;
		ProtetorSolar protetor;
		Shampoo shampoo;
		Condicionador condicionador;
		SaboneteLiquido sabonete;
		
		//Se o login tiver sido validado, podemos prosseguir com a edi��o
		if (login(funcionario)) {
			System.out.println("===============================================================================================");
			System.out.println("Qual produto deseja editar?");
			System.out.println("[1] Perfume");
			System.out.println("[2] Hidratante");
			System.out.println("[3] Protetor Solar");
			System.out.println("[4] Shampoo");
			System.out.println("[5] Condicionador");
			System.out.println("[6] Sabonete L�quido");
			System.out.println("[0] Voltar ao menu");
			System.out.println("===============================================================================================");
			System.out.print(">>>Sua op��o: ");
			do {
				opcao = LerDados.lerInt(opcao);
				if (opcao < 0 || opcao > 6) {
					System.out.print(">>>Digite um valor v�lido: ");
				}
			} while(opcao < 0 || opcao > 6);
			
			//Inicia as edi��es
			switch (opcao) {
			case 1:
				//Se h� perfume no sistema, podemos prosseguir
				if (ConjuntoPerfumaria.temPerfume()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					perfume = ConjuntoPerfumaria.pesquisarPerfume(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (perfume != null) {
						//Deleta o perfume e faz o recadastro
						ConjuntoPerfumaria.deletarPerfume(perfume);
						cadastrarPerfume();
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum perfume.");
					System.out.println("=================================================================================================");
				}
				break;
			case 2:
				//Se h� hidratante no sistema, podemos prosseguir
				if (ConjuntoHidratante.temHidratante()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					hidratante = ConjuntoHidratante.pesquisarHidratante(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (hidratante != null) {
						//Deleta o hidratante e faz o recadastro
						ConjuntoHidratante.deletarHidratante(hidratante);
						cadastrarHidratante();
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum hidratante.");
					System.out.println("=================================================================================================");
				}
				break;
			case 3:
				//Se h� protetor solar no sistema, podemos prosseguir
				if (ConjuntoProtetorSolar.temProtetorSolar()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					protetor = ConjuntoProtetorSolar.pesquisarProtetorSolar(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (protetor != null) {
						//Deleta o protetor e faz o recadastro
						ConjuntoProtetorSolar.deletarProtetorSolar(protetor);
						cadastrarProtetorSolar();
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum protetor solar.");
					System.out.println("=================================================================================================");
				}
				break;
			case 4:
				//Se h� shampoo, podemos prosseguir
				if (ConjuntoShampoo.temShampoo()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					shampoo = ConjuntoShampoo.pesquisarShampoo(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (shampoo != null) {
						//Deleta o shampoo e faz o recadastro
						ConjuntoShampoo.deletarShampoo(shampoo);
						cadastrarShampoo();
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum shampoo.");
					System.out.println("=================================================================================================");
				}
				break;
			case 5:
				//Se h� condicionador, podemos prosseguir
				if (ConjuntoCondicionador.temCondicionador()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					condicionador = ConjuntoCondicionador.pesquisarCondicionador(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (condicionador != null) {
						//Deleta o condicionador e faz o recadastro
						ConjuntoCondicionador.deletarCondicionador(condicionador);
						cadastrarCondicionador();
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum condicionador.");
					System.out.println("=================================================================================================");
				}
				break;
			case 6:
				//Se h� sabonete l�quido, podemos prosseguir
				if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					sabonete = ConjuntoSaboneteLiquido.pesquisarSaboneteLiquido(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (sabonete != null) {
						//Deleta o sabonete l�quido e faz o recadastro
						ConjuntoSaboneteLiquido.deletarSaboneteLiquido(sabonete);
						cadastrarSaboneteLiquido();
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum sabonete l�quido.");
					System.out.println("=================================================================================================");
				}
			}
		} else {
			System.out.println("===============================================================================================");
			System.out.println("Usu�rio n�o autenticado. Tente novamente.");
			System.out.println("===============================================================================================");
		}
	}
	
	//OP��O 4
	public static void editarCliente(GerenciadorDoSistema funcionario) {
		//Declara��es
		Cliente cliente;
		String nome = "";
		
		//Se o login tiver sido validado com sucesso, podemos prosseguir com a edi��o
		if (login(funcionario)) {
			//Programa continua se houver Produto cadastrado no sistema
			if (ConjuntoCliente.temCliente()) {
				System.out.print(">>>Informe o nome do cliente: ");
				nome = LerDados.lerString();
				cliente = ConjuntoCliente.pesquisarCliente(nome);
				//Programa continua se o nome for encontrado no sistema
				if (cliente != null) {
					//Cliente � deletado e recadastrado
					ConjuntoCliente.deletarCliente(cliente);
					cadastrarCliente();
				} else {
					System.out.println("=================================================================================================");
					System.out.println("O nome informado n�o foi encontrado no sistema.");
					System.out.println("=================================================================================================");
				}
			} else {
				System.out.println("=================================================================================================");
				System.out.println("Ainda n�o foi cadastrado nenhum cliente.");
				System.out.println("=================================================================================================");
			}
		} else {
			System.out.println("===============================================================================================");
			System.out.println("Usu�rio n�o autenticado. Tente novamente.");
			System.out.println("===============================================================================================");
		}
	}
	
	//OP��O 5
	public static void listarDadosDosProdutos() {
		//Declara��es
		int opcao = 0, aux = 0;
		
		System.out.println("===============================================================================================");
		System.out.println("Deseja ver os dados de quais produtos?");
		System.out.println("[1] Perfume");
		System.out.println("[2] Hidratante");
		System.out.println("[3] Protetor Solar");
		System.out.println("[4] Shampoo");
		System.out.println("[5] Condicionador");
		System.out.println("[6] Sabonete L�quido");
		System.out.println("[0] Voltar ao menu");
		System.out.println("===============================================================================================");
		System.out.print(">>>Sua op��o: ");
		do {
			opcao = LerDados.lerInt(opcao);
			if (opcao < 0 || opcao > 6) {
				System.out.print(">>>Digite um valor v�lido: ");
			}
		} while(opcao < 0 || opcao > 6);
		
		switch (opcao){
		//Listagem dos dados dos perfumes
		case 1:
			aux = ConjuntoPerfumaria.quantidade();
			ConjuntoPerfumaria.listaPerfumes();
			System.out.println("\n==========================================================================================================");
			System.out.println("H� " + aux + " perfumes cadastrados no sistema");
			System.out.println("==========================================================================================================\n");
			break;
		//Listagem dos dados dos hidratantes
		case 2:
			aux = ConjuntoHidratante.quantidade();
			ConjuntoHidratante.listaHidratantes();
			System.out.println("\n==========================================================================================================");
			System.out.println("H� " + aux + " hidratantes cadastrados no sistema");
			System.out.println("==========================================================================================================\n");
			break;
		//Listagem dos dados dos protetores solar
		case 3:
			aux = ConjuntoProtetorSolar.quantidade();
			ConjuntoProtetorSolar.listaProtetorSolar();
			System.out.println("\n==========================================================================================================");
			System.out.println("H� " + aux + " protetores solar cadastrados no sistema");
			System.out.println("==========================================================================================================\n");
			break;
		//Listagem dos dados dos shampoos
		case 4:
			aux = ConjuntoShampoo.quantidade();
			ConjuntoShampoo.listaShampoo();
			System.out.println("\n==========================================================================================================");
			System.out.println("H� " + aux + " shampoos cadastrados no sistema");
			System.out.println("==========================================================================================================\n");
			break;
		//Listagem dos dados dos condicionadores
		case 5:
			aux = ConjuntoCondicionador.quantidade();
			ConjuntoCondicionador.listaCondicionador();
			System.out.println("\n==========================================================================================================");
			System.out.println("H� " + aux + " condicionadores cadastrados no sistema");
			System.out.println("==========================================================================================================\n");
			break;
		//Listagem dos dados dos sabonetes l�quidos
		case 6:
			aux = ConjuntoSaboneteLiquido.quantidade();
			ConjuntoSaboneteLiquido.listaSaboneteLiquido();
			System.out.println("\n==========================================================================================================");
			System.out.println("H� " + aux + " sabonetes l�quido cadastrados no sistema");
			System.out.println("==========================================================================================================\n");
			break;
		}
	}
	
	//OP��O 6
	public static void listarDadosDosClientes() {
		//Declara��es
		
		if (ConjuntoCliente.temCliente()) {
			ConjuntoCliente.listaClientes();
		} else {
			System.out.println("===============================================================================================");
			System.out.println("Ainda n�o foi cadastrado nenhum cliente no sistema.");
			System.out.println("===============================================================================================");
		}
	}
	
	//OP��O 7
	public static void deletarProduto(GerenciadorDoSistema funcionario) {
		//Declara��es
		int opcao = 0;
		String codigo = "";
		Perfumaria perfume;
		Hidratante hidratante;
		ProtetorSolar protetor;
		Shampoo shampoo;
		Condicionador condicionador;
		SaboneteLiquido sabonete;
		
		//Se o login tiver sido validado, podemos prosseguir com a edi��o
		if (login(funcionario)) {
			System.out.println("===============================================================================================");
			System.out.println("Qual produto deseja deletar?");
			System.out.println("[1] Perfume");
			System.out.println("[2] Hidratante");
			System.out.println("[3] Protetor Solar");
			System.out.println("[4] Shampoo");
			System.out.println("[5] Condicionador");
			System.out.println("[6] Sabonete L�quido");
			System.out.println("[0] Voltar ao menu");
			System.out.println("===============================================================================================");
			System.out.print(">>>Sua op��o: ");
			do {
				opcao = LerDados.lerInt(opcao);
				if (opcao < 0 || opcao > 6) {
					System.out.print(">>>Digite um valor v�lido: ");
				}
			} while(opcao < 0 || opcao > 6);
			
			//Inicia as dele��es
			switch (opcao){
			case 1:
				//Se h� perfume no sistema, podemos prosseguir
				if (ConjuntoPerfumaria.temPerfume()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					perfume = ConjuntoPerfumaria.pesquisarPerfume(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (perfume != null) {
						//Deleta o perfume
						ConjuntoPerfumaria.deletarPerfume(perfume);
						System.out.println("=================================================================================================");
						System.out.println("Perfume deletado.");
						System.out.println("=================================================================================================");
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum perfume.");
					System.out.println("=================================================================================================");
				}
				break;
			case 2:
				//Se h� hidratante no sistema, podemos prosseguir
				if (ConjuntoHidratante.temHidratante()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					hidratante = ConjuntoHidratante.pesquisarHidratante(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (hidratante != null) {
						//Deleta o hidratante
						ConjuntoHidratante.deletarHidratante(hidratante);
						System.out.println("=================================================================================================");
						System.out.println("Hidratante deletado.");
						System.out.println("=================================================================================================");
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum hidratante.");
					System.out.println("=================================================================================================");
				}
				break;
			case 3:
				//Se h� protetor solar no sistema, podemos prosseguir
				if (ConjuntoProtetorSolar.temProtetorSolar()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					protetor = ConjuntoProtetorSolar.pesquisarProtetorSolar(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (protetor != null) {
						//Deleta o protetor solar
						ConjuntoProtetorSolar.deletarProtetorSolar(protetor);
						System.out.println("=================================================================================================");
						System.out.println("Protetor Solar deletado.");
						System.out.println("=================================================================================================");
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum protetor solar.");
					System.out.println("=================================================================================================");
				}
				break;
			case 4:
				//Se h� shampoo no sistema, podemos prosseguir
				if (ConjuntoShampoo.temShampoo()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					shampoo = ConjuntoShampoo.pesquisarShampoo(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (shampoo != null) {
						//Deleta o shampoo
						ConjuntoShampoo.deletarShampoo(shampoo);
						System.out.println("=================================================================================================");
						System.out.println("Shampoo deletado.");
						System.out.println("=================================================================================================");
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum shampoo.");
					System.out.println("=================================================================================================");
				}
				break;
			case 5:
				//Se h� condicionador no sistema, podemos prosseguir
				if (ConjuntoCondicionador.temCondicionador()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					condicionador = ConjuntoCondicionador.pesquisarCondicionador(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (condicionador != null) {
						//Deleta o condicionador
						ConjuntoCondicionador.deletarCondicionador(condicionador);
						System.out.println("=================================================================================================");
						System.out.println("Condicionador deletado.");
						System.out.println("=================================================================================================");
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum condicionador.");
					System.out.println("=================================================================================================");
				}
				break;
			case 6:
				//Se h� sabonete l�quido no sistema, podemos prosseguir
				if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
					System.out.print(">>>Informe o c�digo do produto: ");
					codigo = LerDados.lerString();
					sabonete = ConjuntoSaboneteLiquido.pesquisarSaboneteLiquido(codigo);
					//Se o c�digo for reconhecido no sistema, podemos prosseguir
					if (sabonete != null) {
						//Deleta o sabonete l�quido
						ConjuntoSaboneteLiquido.deletarSaboneteLiquido(sabonete);
						System.out.println("=================================================================================================");
						System.out.println("Sabonete L�quido deletado.");
						System.out.println("=================================================================================================");
					} else {
						System.out.println("=================================================================================================");
						System.out.println("O c�digo informado n�o foi encontrado no sistema.");
						System.out.println("=================================================================================================");
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("Ainda n�o foi cadastrado nenhum sabonete l�quido.");
					System.out.println("=================================================================================================");
				}
				break;
			}
		} else {
			System.out.println("===============================================================================================");
			System.out.println("Usu�rio n�o autenticado. Tente novamente.");
			System.out.println("===============================================================================================");
		}
	}
	
	//OP��O 8
	public static void deletarCliente(GerenciadorDoSistema funcionario) {
		//Declara��es
		String nome = "";
		Cliente cliente;
		
		//Se o login tiver sido validado, podemos prosseguir
		if (login(funcionario)) {
			//Se h� cliente no sistema, podemos prosseguir
			if (ConjuntoCliente.temCliente()) {
				System.out.println("===============================================================================================");
				System.out.print(">>>Informe o nome do cliente: ");
				nome = LerDados.lerString();
				cliente = ConjuntoCliente.pesquisarCliente(nome);
				//Se o nome for encontrado no sistema, podemos prosseguir
				if (cliente != null) {
					//Deleta o cliente
					ConjuntoCliente.deletarCliente(cliente);
				} else {
					System.out.println("=================================================================================================");
					System.out.println("O nome informado n�o foi encontrado no sistema.");
					System.out.println("=================================================================================================");
				}
			} else {
				System.out.println("=================================================================================================");
				System.out.println("Ainda n�o foi cadastrado nenhum cliente no sistema.");
				System.out.println("=================================================================================================");
			}
		} else {
			System.out.println("===============================================================================================");
			System.out.println("Usu�rio n�o autenticado. Tente novamente.");
			System.out.println("===============================================================================================");
		}
	}
	
	public static char sair() {
		//Declara��es
		char escolha = 0;
		
		System.out.print("\n>>>Deseja realmente sair? [S/N]: ");
		do {
			escolha = LerDados.lerChar(escolha);
			if (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S') {
				System.out.print(">>>Digite S para sim e N para n�o: ");
			}
		} while (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S');
		
		return escolha;
	}
}
