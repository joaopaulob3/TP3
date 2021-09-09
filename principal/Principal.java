package principal;

import leituraDeDados.*;
import pessoas.*;
import produtos.*;
import arraylists.*;
import compra.Compra;

public class Principal {

	//Instância de objetos para pré-carregamento do programa
	//adicionando-os aos seus respectivos ArrayList
	public static void carregamentoInicial() {
		//Perfume
		Perfumaria zaad = new Perfumaria(249.90, 95, "perfume1", "ZAAD", "Santal", 10,
				"Perfumaria Masculina", "Vegano e Cruelty Free", "Amadeirado", "Amadeirado");
		ConjuntoPerfumaria.cadastrarPerfume(zaad);
		Perfumaria malbec = new Perfumaria(143.90, 100, "perfume2", "Malbec", "Bleu", 15,
				"Perfumaria Masculina", "Cruelty Free", "", "");
		ConjuntoPerfumaria.cadastrarPerfume(malbec);
		
		//Hidratante
		Hidratante nativaSPA = new Hidratante(42.90, 200, "hidratante1", "Nativa SPA", 
				"Orgânico", 4, "Todos os tipos");
		ConjuntoHidratante.cadastrarHidratante(nativaSPA);
		Hidratante lily = new Hidratante(74.90, 250, "hidratante2", "Lily", "", 6,
				"Todos os tipos");
		ConjuntoHidratante.cadastrarHidratante(lily);
		
		//ProtetorSolar
		ProtetorSolar cuidesebem = new ProtetorSolar(54.90, 50, "protetor1", 
				"Cuide-se bem", "Faciall", 5, "Cruelty Free", 50);
		ConjuntoProtetorSolar.cadastrarProtetorSolar(cuidesebem);
		ProtetorSolar cuidesebem2 = new ProtetorSolar(55.90, 200, "protetor2", 
				"Cuide-se bem", "Solar", 2, "Cruelty Free", 30);
		ConjuntoProtetorSolar.cadastrarProtetorSolar(cuidesebem2);
		
		//Shampoo
		Shampoo nativaSPA2 = new Shampoo(44.90, 300, "shampoo1", "Nativa SPA", "Matcha",
				6, "Todos os tipos", "Cruelty Free", "Resíduos");
		ConjuntoShampoo.cadastrarShampoo(nativaSPA2);
		Shampoo match = new Shampoo(35.90, 250, "shampoo2", "Match.", "Anti Oleosidade",
				12, "Oleosos ou Mistos", "Vegano e Cruelty Free", "Olesosos");
		ConjuntoShampoo.cadastrarShampoo(match);
		
		//Condicionador
		Condicionador cuidesebem3 = new Condicionador(24.90, 250, "condicionador1", 
				"Cuide-se bem", "Lisos", 20, "Todos os tipos", "Cruelty Free", 
				"Envelhecimento dos fios");
		ConjuntoCondicionador.cadastrarCondicionador(cuidesebem3);
		Condicionador sophie = new Condicionador(30.90, 200, "condicionador2", 
				"Sophie", "", 12, "Todos os tipos", "Cruelty Free", "Resíduos");
		ConjuntoCondicionador.cadastrarCondicionador(sophie);
		
		//Sabonete Líquido
		SaboneteLiquido nativaSPA3 = new SaboneteLiquido(31.90, 200, "sabonete1",
				"Nativa SPA","Lichia", 10, "Cruelty Free");
		ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(nativaSPA3);
		SaboneteLiquido floratta = new SaboneteLiquido(15.90, 75, "sabonete2", 
				"Floratta","Rose", 18, "Cruelty Free");
		ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(floratta);
		
		//Cliente
		Cliente jonas = new Cliente("12388899970", "12345", "Jonas",
				"jonas@gmail.com", "61991231231", "Masculino");
		ConjuntoCliente.cadastrarCliente(jonas);
		Cliente maria = new Cliente("127312731238", "772312", "Maria",
				"maria@gmail.com", "413123123", "Feminino");
		ConjuntoCliente.cadastrarCliente(maria);
	}
	
	public static void main(String[] args) {
		//Declarações
		int opcao = 0;
		char escolha = 0;
		
		//Chama o método de pré-carregamento dos objetos
		carregamentoInicial();
		
		//Cria um gerenciador do sistema
		GerenciadorDoSistema funcionario = new GerenciadorDoSistema("12345678900", "login");
		
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
				listarDadosDosClientes(funcionario);
				break;
			case 7:
				deletarProduto(funcionario);
				break;
			case 8:
				deletarCliente(funcionario);
				break;
			case 9:
				realizarCompra();
				break;
			case 11:
				escolha = sair();
				if (escolha == 'S' || escolha == 's') {
					System.out.println("=============================================================================");
					System.out.println("Você optou por sair do programa...");
					System.out.println("=============================================================================");
					System.exit(0);
				}
				break;
			}
		} while(opcao != 10 || escolha == 'n' || escolha == 'N');
	}

	//MENU
	public static int menu() {
		//Declarações
		int opcao = 0;
		
		//Menu com validação da opção escolhida
		System.out.println("=============== PERFUMARIA, CORPO E BANHO ================================");
		System.out.println("[1] Cadastrar um produto");
		System.out.println("[2] Cadastrar um cliente");
		System.out.println("[3] Editar informações de um produto");
		System.out.println("[4] Editar informações de um cliente");
		System.out.println("[5] Listar dados dos produtos");
		System.out.println("[6] Listar dados dos clientes");
		System.out.println("[7] Deletar um produto");
		System.out.println("[8] Deletar um cliente");
		System.out.println("[9] Realizar uma compra");
		System.out.println("[10 Listar compras");
		System.out.println("[11] Sair");
		System.out.println("===========================================================================");
		System.out.print(">>>Sua opção: ");
		do {
			opcao = LerDados.lerInt(opcao);
			if (opcao < 1 || opcao > 11) {
				System.out.print(">>>Digite um valor válido: ");
			}
		} while(opcao < 1 || opcao > 11);
		
		return opcao;
	}
	
	//Login do gerenciador do sistema. Somente o gerenciador do sistema 
	//pode cadastrar, editar ou remover um produto no sistema
	//Login (ambiente de acesso aos métodos)
	public static boolean login(GerenciadorDoSistema funcionario) {
		//Declarações
		String cpf = "", senha = "";
		
		System.out.println("=========================================================================");
		System.out.println("LOGIN:");
		System.out.print(">>>CPF: ");
		cpf = LerDados.lerString();
		System.out.print(">>>Senha: ");
		senha = LerDados.lerString();
		
		//Se o login for validado, o método retorna true, senão retorna false
		if (cpf.equals(funcionario.getCpf()) && senha.equals(funcionario.getSenha())) {
			return true;
		} else {
			return false;
		}
	}
	
	//OPÇÃO 1 - Somente o gerenciador do sistema
	//OPÇÃO 1 - Somente o gerenciador do sistema
	public static void cadastrarProduto(GerenciadorDoSistema funcionario) {
		//Declarações
		int opcao = 0;
		
		//Se o login tiver sido validado com sucesso, podemos prosseguir com o cadastro
		if (login(funcionario)) {
			//Inicia o menu de cadastro e valida a opção do usuário
			System.out.println("=========================================================================");
			System.out.println("Qual produto deseja cadastrar?");
			System.out.println("[1] Perfume");
			System.out.println("[2] Hidratante");
			System.out.println("[3] Protetor Solar");
			System.out.println("[4] Shampoo");
			System.out.println("[5] Condicionador");
			System.out.println("[6] Sabonete Líquido");
			System.out.println("[0] Voltar ao menu");
			System.out.println("=========================================================================");
			System.out.print(">>>Sua opção: ");
			do {
				opcao = LerDados.lerInt(opcao);
				if (opcao < 0 || opcao > 6) {
					System.out.print(">>>Digite um valor válido: ");
				}
			} while(opcao < 0 || opcao > 6);
			
			//Inicia os cadastros
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
			System.out.println("=========================================================================");
			System.out.println("Usuário não autenticado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	public static void cadastrarPerfume() {
		//Declarações
		double preco = 0, volume = 0;
		int quantidade = 0;
		String codigo = "", marca = "";
		String linha = "", categoria = "";
		String propriedades = "", familia = "";
		String subfamilia = "";
		
		//Leitura dos dados do usuário
		System.out.println("=========================================================================");
		System.out.print(">>>Preço do perfume: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do perfume (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>Código do perfume: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do perfume: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do perfume: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Quantidade em estoque: ");
		quantidade = LerDados.lerInt(quantidade);
		
		System.out.print(">>>Categoria do perfume: ");
		categoria = LerDados.lerString();
		
		System.out.print(">>>Propriedades do perfume: ");
		propriedades = LerDados.lerString();
		
		System.out.print(">>>Família olfativa do perfume: ");
		familia = LerDados.lerString();
		
		System.out.print(">>>Subfamília do perfume: ");
		subfamilia = LerDados.lerString();
		System.out.println("\n=========================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("=========================================================================");
		
		//Criação do objeto do tipo Perfumaria através do Construtor
		Perfumaria perfume = new Perfumaria(preco, volume, codigo, marca, linha, 
				quantidade, categoria, propriedades, familia, subfamilia);
		
		//Adicionando o objeto criado no ArrayList listaPerfumes
		ConjuntoPerfumaria.cadastrarPerfume(perfume);
	}
	public static void cadastrarHidratante() {
		//Declarações
		double preco = 0, volume = 0;
		int quantidade = 0;
		String codigo = "", marca = "";
		String linha = "", tipo = "";
		
		//Leitura dos dados do usuário
		System.out.println("=========================================================================");
		System.out.print(">>>Preço do hidratante: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do hidratante (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>Código do hidratante: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do hidratante: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do hidratante: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Quantidade em estoque: ");
		quantidade = LerDados.lerInt(quantidade);
		
		System.out.print(">>>Tipo de pele do hidratante: ");
		tipo = LerDados.lerString();
		System.out.println("\n=========================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("=========================================================================");
		
		//Criação do objeto do tipo Hidratante através do Construtor
		Hidratante hidratante = new Hidratante(preco, volume, codigo, marca, linha,
				quantidade,tipo);
		
		//Adicionando o objeto criado no ArrayList listaHidratantes
		ConjuntoHidratante.cadastrarHidratante(hidratante);
	}
	public static void cadastrarProtetorSolar() {
		//Declarações
		double preco = 0, volume = 0;
		int quantidade = 0;
		String codigo = "", marca = "";
		String linha = "", propriedades = "";
		int fps = 0;
		
		//Leitura dos dados do usuário
		System.out.println("=========================================================================");
		System.out.print(">>>Preço do protetor solar: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do protetor solar (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>Código do protetor solar: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do protetor solar: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do protetor solar: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Quantidade em estoque: ");
		quantidade = LerDados.lerInt(quantidade);
		
		System.out.print(">>>Propridades do protetor solar: ");
		propriedades = LerDados.lerString();
		
		System.out.print(">>>FPS do protetor solar: ");
		fps = LerDados.lerInt(fps);
		System.out.println("\n=========================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("=========================================================================");
		
		//Criação do objeto do tipo ProtetorSolar através do Construtor
		ProtetorSolar protetor = new ProtetorSolar(preco, volume, codigo, marca,
				linha, quantidade, propriedades, fps);
		
		//Adicionando o objeto criado no ArrayList listaProtetorSolar
		ConjuntoProtetorSolar.cadastrarProtetorSolar(protetor);
	}
	public static void cadastrarShampoo() {
		//Declarações
		double preco = 0, volume = 0;
		int quantidade = 0;
		String codigo = "", marca = "";
		String linha = "", tipo = "";
		String propriedades = "", condicao = "";
		
		//Leitura dos dados do usuário
		System.out.println("=========================================================================");
		System.out.print(">>>Preço do shampoo: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do shampoo (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>Código do shampoo: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do shampoo: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do shampoo: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Quantidade em estoque: ");
		quantidade = LerDados.lerInt(quantidade);
		
		System.out.print(">>>Tipo de cabelo do shampoo: ");
		tipo = LerDados.lerString();
		
		System.out.print(">>>Propridades do shampoo: ");
		propriedades = LerDados.lerString();
		
		System.out.print(">>>Condição dos fios do shampoo: ");
		condicao = LerDados.lerString();
		System.out.println("\n=========================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("=========================================================================");
		
		//Criação do objeto do tipo Shampoo através do Construtor
		Shampoo shampoo = new Shampoo(preco, volume, codigo, marca, linha, 
				quantidade, tipo, propriedades, condicao);
		
		//Adicionando o objeto criado no ArrayList listaShampoos
		ConjuntoShampoo.cadastrarShampoo(shampoo);
	}
	public static void cadastrarCondicionador() {
		//Declarações
		double preco = 0, volume = 0;
		int quantidade = 0;
		String codigo = "", marca = "";
		String linha = "", tipo = "";
		String propriedades = "", condicao = "";
		
		//Leitura dos dados do usuário
		System.out.println("=========================================================================");
		System.out.print(">>>Preço do condicionador: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do condicionador (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>Código do condicionador: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do condicionador: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do condicionador: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Quantidade em estoque: ");
		quantidade = LerDados.lerInt(quantidade);
		
		System.out.print(">>>Tipo de cabelo do condicionador: ");
		tipo = LerDados.lerString();
		
		System.out.print(">>>Propridades do condicionador: ");
		propriedades = LerDados.lerString();
		
		System.out.print(">>>Condição dos fios do condicionador: ");
		condicao = LerDados.lerString();
		System.out.println("\n=========================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("=========================================================================");
		
		//Criação do objeto do tipo Condicionador através do Construtor
		Condicionador condicionador = new Condicionador(preco, volume, codigo, 
				marca, linha, quantidade, tipo, propriedades, condicao);
		
		//Adicionando o objeto criado no ArrayList listaCondicionadores
		ConjuntoCondicionador.cadastrarCondicionador(condicionador);
	}
	public static void cadastrarSaboneteLiquido() {
		//Declarações
		double preco = 0, volume = 0;
		int quantidade = 0;
		String codigo = "", marca = "";
		String linha = "", propriedades = "";
		
		//Leitura dos dados do usuário
		System.out.println("=========================================================================");
		System.out.print(">>>Preço do sabonete líquido: R$");
		preco = LerDados.lerDouble(preco);
		
		System.out.print(">>>Volume do sabonete líquido (ml): ");
		volume = LerDados.lerDouble(volume);
		
		System.out.print(">>>Código do sabonete líquido: ");
		codigo = LerDados.lerString();
		
		System.out.print(">>>Marca do sabonete líquido: ");
		marca = LerDados.lerString();
		
		System.out.print(">>>Linha do sabonete líquido: ");
		linha = LerDados.lerString();
		
		System.out.print(">>>Quantidade em estoque: ");
		quantidade = LerDados.lerInt(quantidade);
		
		System.out.print(">>>Propriedades do sabonete líquido: ");
		propriedades = LerDados.lerString();
		System.out.println("\n=========================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("=========================================================================");
		
		//Criação do objeto do tipo SaboneteLiquido através do Construtor
		SaboneteLiquido sabonete = new SaboneteLiquido(preco, volume, codigo, 
				marca, linha, quantidade, propriedades);
		
		//Adicionando o objeto criado no ArrayList listaSabonetesLiquido
		ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(sabonete);
	}
	
	//OPÇÃO 2
	//OPÇÃO 2
	public static void cadastrarCliente() {
		//Declarações
		String nome = "", email = "", cpf = "", celular = "", genero = "", senha = "";
		
		//Leitura dos dados do usuário
		System.out.println("=========================================================================");
		System.out.print(">>>Nome do cliente: ");
		nome = LerDados.lerString();
		
		System.out.print(">>>E-mail do cliente: ");
		email = LerDados.lerString();
		
		System.out.print(">>>CPF do cliente: ");
		cpf = LerDados.lerString();
		
		System.out.print(">>>Celular do cliente: ");
		celular = LerDados.lerString();
		
		System.out.print(">>>Gênero do cliente: ");
		genero = LerDados.lerString();
		
		System.out.print(">>>Senha do cliente: ");
		senha = LerDados.lerString();
		System.out.println("\n=========================================================================");
		System.out.println("CLIENTE CADASTRADO!");
		System.out.println("=========================================================================");
		
		//Criação do objeto do tipo Cliente através Construtor
		Cliente cliente = new Cliente(cpf, senha, nome, email, celular, genero);
		
		//Adicionando o objeto criado no ArrayList listaClientes
		ConjuntoCliente.cadastrarCliente(cliente);
	}
	
	//OPÇÃO 3 - Somente o gerenciador do sistema
	//OPÇÃO 3 - Somente o gerenciador do sistema
	public static void editarProduto(GerenciadorDoSistema funcionario) {
		//Declarações
		int opcao = 0;
		String codigo = "";
		Perfumaria perfume;
		Hidratante hidratante;
		ProtetorSolar protetor;
		Shampoo shampoo;
		Condicionador condicionador;
		SaboneteLiquido sabonete;
		
		//Se o login tiver sido validado, podemos prosseguir com a edição
		if (login(funcionario)) {
			//Inicia o menu de edição e valida a opção do usuário
			System.out.println("=========================================================================");
			System.out.println("Qual produto deseja editar?");
			System.out.println("[1] Perfume");
			System.out.println("[2] Hidratante");
			System.out.println("[3] Protetor Solar");
			System.out.println("[4] Shampoo");
			System.out.println("[5] Condicionador");
			System.out.println("[6] Sabonete Líquido");
			System.out.println("[0] Voltar ao menu");
			System.out.println("=========================================================================");
			System.out.print(">>>Sua opção: ");
			do {
				opcao = LerDados.lerInt(opcao);
				if (opcao < 0 || opcao > 6) {
					System.out.print(">>>Digite um valor válido: ");
				}
			} while(opcao < 0 || opcao > 6);
			
			//Inicia as edições
			switch (opcao) {
			case 1:
				//Se há perfume no sistema, podemos prosseguir
				if (ConjuntoPerfumaria.temPerfume()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo Perfumaria do ArrayList listaPerfumes
					perfume = ConjuntoPerfumaria.pesquisarPerfume(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (perfume != null) {
						//Deleta o perfume e faz o recadastro
						ConjuntoPerfumaria.deletarPerfume(perfume);
						cadastrarPerfume();
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum perfume.");
					System.out.println("=========================================================================");
				}
				break;
			case 2:
				//Se há hidratante no sistema, podemos prosseguir
				if (ConjuntoHidratante.temHidratante()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo Hidratante do ArrayList listaHidratantes
					hidratante = ConjuntoHidratante.pesquisarHidratante(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (hidratante != null) {
						//Deleta o hidratante e faz o recadastro
						ConjuntoHidratante.deletarHidratante(hidratante);
						cadastrarHidratante();
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum hidratante.");
					System.out.println("=========================================================================");
				}
				break;
			case 3:
				//Se há protetor solar no sistema, podemos prosseguir
				if (ConjuntoProtetorSolar.temProtetorSolar()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo ProtetorSolar do ArrayList listaProtetorSolar
					protetor = ConjuntoProtetorSolar.pesquisarProtetorSolar(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (protetor != null) {
						//Deleta o protetor e faz o recadastro
						ConjuntoProtetorSolar.deletarProtetorSolar(protetor);
						cadastrarProtetorSolar();
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum protetor solar.");
					System.out.println("=========================================================================");
				}
				break;
			case 4:
				//Se há shampoo, podemos prosseguir
				if (ConjuntoShampoo.temShampoo()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo Shampoo do ArrayList listaShampoos
					shampoo = ConjuntoShampoo.pesquisarShampoo(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (shampoo != null) {
						//Deleta o shampoo e faz o recadastro
						ConjuntoShampoo.deletarShampoo(shampoo);
						cadastrarShampoo();
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum shampoo.");
					System.out.println("=========================================================================");
				}
				break;
			case 5:
				//Se há condicionador, podemos prosseguir
				if (ConjuntoCondicionador.temCondicionador()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo Condicionador do ArrayList listaCondicionadores
					condicionador = ConjuntoCondicionador.pesquisarCondicionador(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (condicionador != null) {
						//Deleta o condicionador e faz o recadastro
						ConjuntoCondicionador.deletarCondicionador(condicionador);
						cadastrarCondicionador();
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum condicionador.");
					System.out.println("=========================================================================");
				}
				break;
			case 6:
				//Se há sabonete líquido, podemos prosseguir
				if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo SaboneteLiquido do ArrayList listaSabonetesLiquido
					sabonete = ConjuntoSaboneteLiquido.pesquisarSaboneteLiquido(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (sabonete != null) {
						//Deleta o sabonete líquido e faz o recadastro
						ConjuntoSaboneteLiquido.deletarSaboneteLiquido(sabonete);
						cadastrarSaboneteLiquido();
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum sabonete líquido.");
					System.out.println("=========================================================================");
				}
			}
		} else {
			System.out.println("=========================================================================");
			System.out.println("Usuário não autenticado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	
	//OPÇÃO 4 - Somente o gerenciador do sistema
	//OPÇÃO 4 - Somente o gerenciador do sistema
	public static void editarCliente(GerenciadorDoSistema funcionario) {
		//Declarações
		Cliente cliente;
		String cpf = "";
		
		//Se o login tiver sido validado com sucesso, podemos prosseguir com a edição
		if (login(funcionario)) {
			//Programa continua se houver Produto cadastrado no sistema
			if (ConjuntoCliente.temCliente()) {
				System.out.print(">>>Informe o CPF do cliente: ");
				cpf = LerDados.lerString();
				//Resgata o objeto do tipo Cliente do ArrayList listaClientes
				cliente = ConjuntoCliente.pesquisarCliente(cpf);
				//Programa continua se o nome for encontrado no sistema
				if (cliente != null) {
					//Cliente é deletado e recadastrado
					ConjuntoCliente.deletarCliente(cliente);
					cadastrarCliente();
				} else {
					System.out.println("=========================================================================");
					System.out.println("O nome informado não foi encontrado no sistema.");
					System.out.println("=========================================================================");
				}
			} else {
				System.out.println("=========================================================================");
				System.out.println("Ainda não foi cadastrado nenhum cliente.");
				System.out.println("=========================================================================");
			}
		} else {
			System.out.println("=========================================================================");
			System.out.println("Usuário não autenticado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	
	//OPÇÃO 5
	public static void listarDadosDosProdutos() {
		//Declarações
		int opcao = 0;
		
		//Inicia o menu de listagem e valida a opção do usuário
		System.out.println("=========================================================================");
		System.out.println("Deseja ver os dados de quais produtos?");
		System.out.println("[1] Perfume");
		System.out.println("[2] Hidratante");
		System.out.println("[3] Protetor Solar");
		System.out.println("[4] Shampoo");
		System.out.println("[5] Condicionador");
		System.out.println("[6] Sabonete Líquido");
		System.out.println("[0] Voltar ao menu");
		System.out.println("=========================================================================");
		System.out.print(">>>Sua opção: ");
		do {
			opcao = LerDados.lerInt(opcao);
			if (opcao < 0 || opcao > 6) {
				System.out.print(">>>Digite um valor válido: ");
			}
		} while(opcao < 0 || opcao > 6);
		
		//Inicia as listagens
		switch (opcao){
		case 1:
			listarPerfume();
			break;
		case 2:
			listarHidratante();
			break;
		case 3:
			listarProtetorSolar();
			break;
		case 4:
			listarShampoo();
			break;
		case 5:
			listarCondicionador();
			break;
		case 6:
			listarSaboneteLiquido();
			break;
		}
	}
	public static void listarPerfume() {
		//Declarações
		int aux = 0;
		
		aux = ConjuntoPerfumaria.quantidade();
		ConjuntoPerfumaria.listaPerfumes();
		System.out.println("\n=========================================================================");
		System.out.println("Há " + aux + " perfumes cadastrados no sistema");
		System.out.println("=========================================================================\n");
	}
	public static void listarHidratante() {
		//Declarações
		int aux = 0;
		
		aux = ConjuntoHidratante.quantidade();
		ConjuntoHidratante.listaHidratantes();
		System.out.println("\n=========================================================================");
		System.out.println("Há " + aux + " hidratantes cadastrados no sistema");
		System.out.println("=========================================================================\n");
	}
	public static void listarProtetorSolar() {
		//Declarações
		int aux = 0;
		
		aux = ConjuntoProtetorSolar.quantidade();
		ConjuntoProtetorSolar.listaProtetorSolar();
		System.out.println("\n=========================================================================");
		System.out.println("Há " + aux + " protetores solar cadastrados no sistema");
		System.out.println("=========================================================================\n");
	}
	public static void listarShampoo() {
		//Declarações
		int aux = 0;
		
		aux = ConjuntoShampoo.quantidade();
		ConjuntoShampoo.listaShampoo();
		System.out.println("\n=========================================================================");
		System.out.println("Há " + aux + " shampoos cadastrados no sistema");
		System.out.println("=========================================================================\n");
	}
	public static void listarCondicionador() {
		//Declarações
		int aux = 0;
		
		aux = ConjuntoCondicionador.quantidade();
		ConjuntoCondicionador.listaCondicionador();
		System.out.println("\n=========================================================================");
		System.out.println("Há " + aux + " condicionadores cadastrados no sistema");
		System.out.println("=========================================================================\n");
	}
	public static void listarSaboneteLiquido() {
		//Declarações
		int aux = 0;
		
		aux = ConjuntoSaboneteLiquido.quantidade();
		ConjuntoSaboneteLiquido.listaSaboneteLiquido();
		System.out.println("\n=========================================================================");
		System.out.println("Há " + aux + " sabonetes líquido cadastrados no sistema");
		System.out.println("=========================================================================\n");
	}
	
	//OPÇÃO 6 - Somente o gerenciador do sistema
	public static void listarDadosDosClientes(GerenciadorDoSistema funcionario) {
		//Declarações
		
		//Se o login tiver sido validado com sucesso, podemos prosseguir com a listagem
		if(login(funcionario)) {
			//Se há clientes no sistema, eles serão listados
			if (ConjuntoCliente.temCliente()) {
				ConjuntoCliente.listaClientes();
			} else {
				System.out.println("=========================================================================");
				System.out.println("Ainda não foi cadastrado nenhum cliente no sistema.");
				System.out.println("=========================================================================");
			}
		} else {
			System.out.println("=========================================================================");
			System.out.println("Usuário não autenticado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	
	//OPÇÃO 7 - Somente o gerenciador do sistema
	public static void deletarProduto(GerenciadorDoSistema funcionario) {
		//Declarações
		int opcao = 0;
		String codigo = "";
		Perfumaria perfume;
		Hidratante hidratante;
		ProtetorSolar protetor;
		Shampoo shampoo;
		Condicionador condicionador;
		SaboneteLiquido sabonete;
		
		//Se o login tiver sido validado, podemos prosseguir com a edição
		if (login(funcionario)) {
			//Inicia o menu de deleção e valida a opção do usuário
			System.out.println("=========================================================================");
			System.out.println("Qual produto deseja deletar?");
			System.out.println("[1] Perfume");
			System.out.println("[2] Hidratante");
			System.out.println("[3] Protetor Solar");
			System.out.println("[4] Shampoo");
			System.out.println("[5] Condicionador");
			System.out.println("[6] Sabonete Líquido");
			System.out.println("[0] Voltar ao menu");
			System.out.println("=========================================================================");
			System.out.print(">>>Sua opção: ");
			do {
				opcao = LerDados.lerInt(opcao);
				if (opcao < 0 || opcao > 6) {
					System.out.print(">>>Digite um valor válido: ");
				}
			} while(opcao < 0 || opcao > 6);
			
			//Inicia as deleções
			switch (opcao){
			case 1:
				//Se há perfume no sistema, podemos prosseguir
				if (ConjuntoPerfumaria.temPerfume()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo Perfumaria do ArrayList listaPerfumes
					perfume = ConjuntoPerfumaria.pesquisarPerfume(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (perfume != null) {
						//Deleta o perfume
						ConjuntoPerfumaria.deletarPerfume(perfume);
						System.out.println("=========================================================================");
						System.out.println("Perfume deletado.");
						System.out.println("=========================================================================");
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum perfume.");
					System.out.println("=========================================================================");
				}
				break;
			case 2:
				//Se há hidratante no sistema, podemos prosseguir
				if (ConjuntoHidratante.temHidratante()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo Hidratante do ArrayList listaHidratantes
					hidratante = ConjuntoHidratante.pesquisarHidratante(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (hidratante != null) {
						//Deleta o hidratante
						ConjuntoHidratante.deletarHidratante(hidratante);
						System.out.println("=========================================================================");
						System.out.println("Hidratante deletado.");
						System.out.println("=========================================================================");
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum hidratante.");
					System.out.println("=========================================================================");
				}
				break;
			case 3:
				//Se há protetor solar no sistema, podemos prosseguir
				if (ConjuntoProtetorSolar.temProtetorSolar()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo ProtetorSolar do ArrayList listaProtetorSolar
					protetor = ConjuntoProtetorSolar.pesquisarProtetorSolar(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (protetor != null) {
						//Deleta o protetor solar
						ConjuntoProtetorSolar.deletarProtetorSolar(protetor);
						System.out.println("=========================================================================");
						System.out.println("Protetor Solar deletado.");
						System.out.println("=========================================================================");
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum protetor solar.");
					System.out.println("=========================================================================");
				}
				break;
			case 4:
				//Se há shampoo no sistema, podemos prosseguir
				if (ConjuntoShampoo.temShampoo()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo Shampoo do ArrayList listaShampoos
					shampoo = ConjuntoShampoo.pesquisarShampoo(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (shampoo != null) {
						//Deleta o shampoo
						ConjuntoShampoo.deletarShampoo(shampoo);
						System.out.println("=========================================================================");
						System.out.println("Shampoo deletado.");
						System.out.println("=========================================================================");
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");;
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum shampoo.");
					System.out.println("=========================================================================");
				}
				break;
			case 5:
				//Se há condicionador no sistema, podemos prosseguir
				if (ConjuntoCondicionador.temCondicionador()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata oo objeto do tipo Condicionador do ArrayList listaCondicionadores
					condicionador = ConjuntoCondicionador.pesquisarCondicionador(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (condicionador != null) {
						//Deleta o condicionador
						ConjuntoCondicionador.deletarCondicionador(condicionador);
						System.out.println("=========================================================================");
						System.out.println("Condicionador deletado.");
						System.out.println("=========================================================================");
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum condicionador.");
					System.out.println("=========================================================================");
				}
				break;
			case 6:
				//Se há sabonete líquido no sistema, podemos prosseguir
				if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
					System.out.print(">>>Informe o código do produto: ");
					codigo = LerDados.lerString();
					//Resgata o objeto do tipo SaboneteLiquido do ArrayList listaSabonetesLiquido
					sabonete = ConjuntoSaboneteLiquido.pesquisarSaboneteLiquido(codigo);
					//Se o código for reconhecido no sistema, podemos prosseguir
					if (sabonete != null) {
						//Deleta o sabonete líquido
						ConjuntoSaboneteLiquido.deletarSaboneteLiquido(sabonete);
						System.out.println("=========================================================================");
						System.out.println("Sabonete Líquido deletado.");
						System.out.println("=========================================================================");
					} else {
						System.out.println("=========================================================================");
						System.out.println("O código informado não foi encontrado no sistema.");
						System.out.println("=========================================================================");
					}
				} else {
					System.out.println("=========================================================================");
					System.out.println("Ainda não foi cadastrado nenhum sabonete líquido.");
					System.out.println("=========================================================================");
				}
				break;
			}
		} else {
			System.out.println("=========================================================================");
			System.out.println("Usuário não autenticado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	
	//OPÇÃO 8 - Somente o gerenciador do sistema
	public static void deletarCliente(GerenciadorDoSistema funcionario) {
		//Declarações
		String nome = "";
		Cliente cliente;
		
		//Se o login tiver sido validado, podemos prosseguir
		if (login(funcionario)) {
			//Se há cliente no sistema, podemos prosseguir
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
					System.out.println("O nome informado não foi encontrado no sistema.");
					System.out.println("=================================================================================================");
				}
			} else {
				System.out.println("=================================================================================================");
				System.out.println("Ainda não foi cadastrado nenhum cliente no sistema.");
				System.out.println("=================================================================================================");
			}
		} else {
			System.out.println("===============================================================================================");
			System.out.println("Usuário não autenticado. Tente novamente.");
			System.out.println("===============================================================================================");
		}
	}
	
	//OPÇÃO 9
	public static void realizarCompra() {
		//Declarações
		Cliente cliente;
		String senha = "", cpf = "";
		int opcao = 0;
		
		//Verifica se o CPF digitado existe no sistema e se a senha está correta
		System.out.print(">>>Digite o CPF: ");
		cpf = LerDados.lerString();
		//Resgata o objeto do tipo Cliente do ArrayList listaClientes
		cliente = ConjuntoCliente.pesquisarCliente(cpf);
		
		//Se o objeto Cliente tiver sido resgatado, podemos prosseguir
		if (cliente != null) {
			System.out.print(">>>Digite a senha: ");
			senha = LerDados.lerString();
			//Se a senha informada, for a senha do objeto Cliente resgatado,
			//podemos prosseguir
			if (senha.equals(cliente.getSenha())) {
				//Inicia o menu de compra e valida as informações
				System.out.println("=========================================================================");
				System.out.println("Deseja comprar qual tipo de produto?");
				System.out.println("[1] Perfume");
				System.out.println("[2] Hidratante");
				System.out.println("[3] Protetor Solar");
				System.out.println("[4] Shampoo");
				System.out.println("[5] Condicionador");
				System.out.println("[6] Sabonete Líquido");
				System.out.println("[0] Voltar ao menu");
				System.out.println("=========================================================================");
				System.out.print(">>>Sua opção: ");
				do {
					opcao = LerDados.lerInt(opcao);
					if (opcao < 0 || opcao > 6) {
						System.out.print(">>>Digite um valor válido: ");
					}
				} while(opcao < 0 || opcao > 6);
				
				//Imprime os dados do tipo de produto selecionado e realiza a compra,
				//cadastrando o objeto no ArrayList respectivo ao seu tipo
				switch (opcao) {
				case 1:
					compraPerfume(cliente, cpf);
					break;
				case 2:
					compraHidratante(cliente, cpf);
					break;
				case 3:
					compraProtetorSolar(cliente, cpf);
					break;
				case 4:
					compraShampoo(cliente, cpf);
					break;
				case 5:
					compraCondicionador(cliente, cpf);
					break;
				case 6:
					compraSaboneteLiquido(cliente, cpf);
					break;
				}
			} else {
				System.out.println("\n=========================================================================");
				System.out.println("Senha incorreta. Tente novamente.");
				System.out.println("=========================================================================");
			}
		} else {
			System.out.println("\n=========================================================================");
			System.out.println("O CPF informado não foi encontrado no sistema.");
			System.out.println("=========================================================================");
		}
	}
	public static void compraPerfume(Cliente cliente, String cpf) {
		//Declarações
		String codigo = "";
		int quantidade = 0;
		char escolha = 0;
		double valorDaCompra = 0;
		Perfumaria perfume;
		
		//Lista os perfumes existentes no sistema
		listarPerfume();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">>>Informe o código do perfume que deseja comprar: ");
		codigo = LerDados.lerString();
		//Resgata o objeto do tipo Perfumaria do ArrayList listaPerfumes
		perfume = ConjuntoPerfumaria.pesquisarPerfume(codigo);
		
		//Se o objeto do tipo Perfumaria tiver sido resgatado, podemos prosseguir
		if (perfume != null) {
			do {
				System.out.print(">>>Quantidade que deseja comprar: ");
				quantidade = LerDados.lerInt(quantidade);
				//Se a quantidade informada pelo usuário for menor ou igual à quantidade em
				//estoque, podemos prosseguir
				if (quantidade > perfume.getQuantidadeProduto()) {
					System.out.println("=========================================================================");
					System.out.println("A quantidade informada é maior que a quantidade em estoque!");
					System.out.println("=========================================================================");
				} else {
					//Valida a escolha do usuário
					System.out.print("\n>>>Deseja finalizar a compra? [S/N]: ");
					do {
						escolha = LerDados.lerChar(escolha);
						if (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S') {
							System.out.print(">>>Digite S para sim e N para não: ");
						}
					} while (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S');
					//Se a escolha for sim, prosseguimos
					if (escolha == 'S' || escolha == 's') {
						//Armazena o valor da compra
						valorDaCompra = quantidade*perfume.getPrecoDoProduto();
						//Criação do objeto Compra através do Construtor
						Compra compraPerfume = new Compra(cliente, perfume, valorDaCompra);
						//Adicionando o objeto criado no ArrayList listaCompras
						ConjuntoCompra.cadastrarCompra(compraPerfume);
						//Diminui a quantidade comprada do estoque do produto
						perfume.setQuantidadeProduto(perfume.getQuantidadeProduto() - quantidade);
						
						System.out.println("\n=========================================================================");
						System.out.println("Compra finalizada! Agradecemos a preferência");
						System.out.println("=========================================================================");
						System.out.println("Sobre o produto: ");
						System.out.println("-------------------------------------------------------------------------");
						System.out.println(perfume.listarDados());
						System.out.println("=========================================================================");
						System.out.println("Valor da compra: R$ " + valorDaCompra);
						System.out.println("=========================================================================");
						quantidade = ConjuntoCompra.quantidade(cpf);
						System.out.println("\n=========================================================================");
						System.out.println("Compras realizadas até o momento em nossa loja: " + quantidade);
						System.out.println("=========================================================================");
					}
				}
			} while(quantidade > perfume.getQuantidadeProduto());
		} else {
			System.out.println("\n=========================================================================");
			System.out.println("Código não encontrado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	public static void compraHidratante(Cliente cliente, String cpf) {
		//Declarações
		String codigo = "";
		int quantidade = 0;
		char escolha = 0;
		double valorDaCompra = 0;
		Hidratante hidratante;
		
		//Lista os hidratantes existentes no sistema
		listarHidratante();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">>>Informe o código do hidratante que deseja comprar: ");
		codigo = LerDados.lerString();
		//Resgata o objeto do tipo Hidratante do ArrayList listaHidratantes
		hidratante = ConjuntoHidratante.pesquisarHidratante(codigo);
		
		//Se o objeto do tipo Hidratante tiver sido resgatado, podemos prosseguir
		if (hidratante != null) {
			do {
				System.out.print(">>>Quantidade que deseja comprar: ");
				quantidade = LerDados.lerInt(quantidade);
				//Se a quantidade informada pelo usuário for menor ou igual à quantidade em
				//estoque, podemos prosseguir
				if (quantidade > hidratante.getQuantidadeProduto()) {
					System.out.println("=========================================================================");
					System.out.println("A quantidade informada é maior que a quantidade em estoque!");
					System.out.println("=========================================================================");
				} else {
					//Valida a escolha do usuário
					System.out.print("\n>>>Deseja finalizar a compra? [S/N]: ");
					do {
						escolha = LerDados.lerChar(escolha);
						if (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S') {
							System.out.print(">>>Digite S para sim e N para não: ");
						}
					} while (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S');
					//Se a escolha for sim, prosseguimos
					if (escolha == 'S' || escolha == 's') {
						//Armazena o valor da compra
						valorDaCompra = quantidade*hidratante.getPrecoDoProduto();
						//Criação do objeto Compra através do Construtor
						Compra compraHidratante = new Compra(cliente, hidratante, valorDaCompra);
						//Adicionando o objeto criado no ArrayList listaCompras
						ConjuntoCompra.cadastrarCompra(compraHidratante);
						//Diminui a quantidade comprada do estoque do produto
						hidratante.setQuantidadeProduto(hidratante.getQuantidadeProduto() - quantidade);
						
						System.out.println("\n=========================================================================");
						System.out.println("Compra finalizada! Agradecemos a preferência");
						System.out.println("=========================================================================");
						System.out.println("Sobre o produto: ");
						System.out.println("-------------------------------------------------------------------------");
						System.out.println(hidratante.listarDados());
						System.out.println("=========================================================================");
						System.out.println("Valor da compra: R$ " + valorDaCompra);
						System.out.println("=========================================================================");
						quantidade = ConjuntoCompra.quantidade(cpf);
						System.out.println("\n=========================================================================");
						System.out.println("Compras realizadas até o momento em nossa loja: " + quantidade);	
						System.out.println("=========================================================================");
					}
				}
			} while(quantidade > hidratante.getQuantidadeProduto());
		} else {
			System.out.println("\n=========================================================================");
			System.out.println("Código não encontrado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	public static void compraProtetorSolar(Cliente cliente, String cpf) {
		//Declarações
		String codigo = "";
		int quantidade = 0;
		char escolha = 0;
		double valorDaCompra = 0;
		ProtetorSolar protetor;
		
		//Lista os protetores existentes no sistema
		listarProtetorSolar();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">>>Informe o código do protetor que deseja comprar: ");
		codigo = LerDados.lerString();
		//Resgata o objeto do tipo ProtetorSolar do ArrayList listaProtetoresSolar
		protetor = ConjuntoProtetorSolar.pesquisarProtetorSolar(codigo);
		
		//Se o objeto do tipo ProtetorSolar tiver sido resgatado, podemos prosseguir
		if (protetor != null) {
			do {
				System.out.print(">>>Quantidade que deseja comprar: ");
				quantidade = LerDados.lerInt(quantidade);
				//Se a quantidade informada pelo usuário for menor ou igual à quantidade em
				//estoque, podemos prosseguir
				if (quantidade > protetor.getQuantidadeProduto()) {
					System.out.println("=========================================================================");
					System.out.println("A quantidade informada é maior que a quantidade em estoque!");
					System.out.println("=========================================================================");
				} else {
					//Valida a escolha do usuário
					System.out.print("\n>>>Deseja finalizar a compra? [S/N]: ");
					do {
						escolha = LerDados.lerChar(escolha);
						if (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S') {
							System.out.print(">>>Digite S para sim e N para não: ");
						}
					} while (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S');
					//Se a escolha for sim, prosseguimos
					if (escolha == 'S' || escolha == 's') {
						//Armazena o valor da compra
						valorDaCompra = quantidade*protetor.getPrecoDoProduto();
						//Criação do objeto Compra através do Construtor
						Compra compraProtetor = new Compra(cliente, protetor, valorDaCompra);
						//Adicionando o objeto criado no ArrayList listaCompras
						ConjuntoCompra.cadastrarCompra(compraProtetor);
						//Diminui a quantidade comprada do estoque do produto
						protetor.setQuantidadeProduto(protetor.getQuantidadeProduto() - quantidade);
						
						System.out.println("\n=========================================================================");
						System.out.println("Compra finalizada! Agradecemos a preferência");
						System.out.println("=========================================================================");
						System.out.println("Sobre o produto: ");
						System.out.println("-------------------------------------------------------------------------");
						System.out.println(protetor.listarDados());
						System.out.println("=========================================================================");
						System.out.println("Valor da compra: R$ " + valorDaCompra);
						System.out.println("=========================================================================");
						quantidade = ConjuntoCompra.quantidade(cpf);
						System.out.println("\n=========================================================================");
						System.out.println("Compras realizadas até o momento em nossa loja: " + quantidade);			
						System.out.println("=========================================================================");
					}
				}
			} while(quantidade > protetor.getQuantidadeProduto());
		} else {
			System.out.println("\n=========================================================================");
			System.out.println("Código não encontrado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	public static void compraShampoo(Cliente cliente, String cpf) {
		//Declarações
		String codigo = "";
		int quantidade = 0;
		char escolha = 0;
		double valorDaCompra = 0;
		Shampoo shampoo;
		
		//Lista os shampoos existentes no sistema
		listarShampoo();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">>>Informe o código do shampoo que deseja comprar: ");
		codigo = LerDados.lerString();
		//Resgata o objeto do tipo Shampoo do ArrayList listaShampoos
		shampoo = ConjuntoShampoo.pesquisarShampoo(codigo);
		
		//Se o objeto do tipo Shampoo tiver sido resgatado, podemos prosseguir
		if (shampoo != null) {
			do {
				System.out.print(">>>Quantidade que deseja comprar: ");
				quantidade = LerDados.lerInt(quantidade);
				//Se a quantidade informada pelo usuário for menor ou igual à quantidade em
				//estoque, podemos prosseguir
				if (quantidade > shampoo.getQuantidadeProduto()) {
					System.out.println("=========================================================================");
					System.out.println("A quantidade informada é maior que a quantidade em estoque!");
					System.out.println("=========================================================================");
				} else {
					//Valida a escolha do usuário
					System.out.print("\n>>>Deseja finalizar a compra? [S/N]: ");
					do {
						escolha = LerDados.lerChar(escolha);
						if (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S') {
							System.out.print(">>>Digite S para sim e N para não: ");
						}
					} while (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S');
					//Se a escolha for sim, prosseguimos
					if (escolha == 'S' || escolha == 's') {
						//Armazena o valor da compra
						valorDaCompra = quantidade*shampoo.getPrecoDoProduto();
						//Criação do objeto Compra através do Construtor
						Compra compraShampoo = new Compra(cliente, shampoo, valorDaCompra);
						//Adicionando o objeto criado no ArrayList listaCompras
						ConjuntoCompra.cadastrarCompra(compraShampoo);
						//Diminui a quantidade comprada do estoque do produto
						shampoo.setQuantidadeProduto(shampoo.getQuantidadeProduto() - quantidade);
						
						System.out.println("\n=========================================================================");
						System.out.println("Compra finalizada! Agradecemos a preferência");
						System.out.println("=========================================================================");
						System.out.println("Sobre o produto: ");
						System.out.println("-------------------------------------------------------------------------");
						System.out.println(shampoo.listarDados());
						System.out.println("=========================================================================");
						System.out.println("Valor da compra: R$ " + valorDaCompra);
						System.out.println("=========================================================================");
						quantidade = ConjuntoCompra.quantidade(cpf);
						System.out.println("\n=========================================================================");
						System.out.println("Compras realizadas até o momento em nossa loja: " + quantidade);			
						System.out.println("=========================================================================");
					}
				}
			} while(quantidade > shampoo.getQuantidadeProduto());
		} else {
			System.out.println("\n=========================================================================");
			System.out.println("Código não encontrado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	public static void compraCondicionador(Cliente cliente, String cpf) {
		//Declarações
		String codigo = "";
		int quantidade = 0;
		char escolha = 0;
		double valorDaCompra = 0;
		Condicionador condicionador;
		
		//Lista os condicionadores existentes no sistema
		listarCondicionador();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">>>Informe o código do condicionador que deseja comprar: ");
		codigo = LerDados.lerString();
		//Resgata o objeto do tipo Condicionador do ArrayList listaCondicionadores
		condicionador = ConjuntoCondicionador.pesquisarCondicionador(codigo);
		
		//Se o objeto do tipo Condicionador tiver sido resgatado, podemos prosseguir
		if (condicionador != null) {
			do {
				System.out.print(">>>Quantidade que deseja comprar: ");
				quantidade = LerDados.lerInt(quantidade);
				//Se a quantidade informada pelo usuário for menor ou igual à quantidade em
				//estoque, podemos prosseguir
				if (quantidade > condicionador.getQuantidadeProduto()) {
					System.out.println("=========================================================================");
					System.out.println("A quantidade informada é maior que a quantidade em estoque!");
					System.out.println("=========================================================================");
				} else {
					//Valida a escolha do usuário
					System.out.print("\n>>>Deseja finalizar a compra? [S/N]: ");
					do {
						escolha = LerDados.lerChar(escolha);
						if (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S') {
							System.out.print(">>>Digite S para sim e N para não: ");
						}
					} while (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S');
					//Se a escolha for sim, prosseguimos
					if (escolha == 'S' || escolha == 's') {
						//Armazena o valor da compra
						valorDaCompra = quantidade*condicionador.getPrecoDoProduto();
						//Criação do objeto Compra através do Construtor
						Compra compraCondicionador = new Compra(cliente, condicionador, valorDaCompra);
						//Adicionando o objeto criado no ArrayList listaCompras
						ConjuntoCompra.cadastrarCompra(compraCondicionador);
						//Diminui a quantidade comprada do estoque do produto
						condicionador.setQuantidadeProduto(condicionador.getQuantidadeProduto() - quantidade);
						
						System.out.println("\n=========================================================================");
						System.out.println("Compra finalizada! Agradecemos a preferência");
						System.out.println("=========================================================================");
						System.out.println("Sobre o produto: ");
						System.out.println("-------------------------------------------------------------------------");
						System.out.println(condicionador.listarDados());
						System.out.println("=========================================================================");
						System.out.println("Valor da compra: R$ " + valorDaCompra);
						System.out.println("=========================================================================");
						quantidade = ConjuntoCompra.quantidade(cpf);
						System.out.println("\n=========================================================================");
						System.out.println("Compras realizadas até o momento em nossa loja: " + quantidade);	
						System.out.println("=========================================================================");
					}
				}
			} while(quantidade > condicionador.getQuantidadeProduto());
		} else {
			System.out.println("\n=========================================================================");
			System.out.println("Código não encontrado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	public static void compraSaboneteLiquido(Cliente cliente, String cpf) {
		//Declarações
		String codigo = "";
		int quantidade = 0;
		char escolha = 0;
		double valorDaCompra = 0;
		SaboneteLiquido sabonete;
		
		//Lista os sabonetes líquido existentes no sistema
		listarSaboneteLiquido();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.print(">>>Informe o código do sabonete líquido que deseja comprar: ");
		codigo = LerDados.lerString();
		//Resgata o objeto do tipo SaboneteLiquido do ArrayList listaSabonetesLiquido
		sabonete = ConjuntoSaboneteLiquido.pesquisarSaboneteLiquido(codigo);
		
		//Se o objeto do tipo SaboneteLiquido tiver sido resgatado, podemos prosseguir
		if (sabonete != null) {
			do {
				System.out.print(">>>Quantidade que deseja comprar: ");
				quantidade = LerDados.lerInt(quantidade);
				//Se a quantidade informada pelo usuário for menor ou igual à quantidade em
				//estoque, podemos prosseguir
				if (quantidade > sabonete.getQuantidadeProduto()) {
					System.out.println("=========================================================================");
					System.out.println("A quantidade informada é maior que a quantidade em estoque!");
					System.out.println("=========================================================================");
				} else {
					//Valida a escolha do usuário
					System.out.print("\n>>>Deseja finalizar a compra? [S/N]: ");
					do {
						escolha = LerDados.lerChar(escolha);
						if (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S') {
							System.out.print(">>>Digite S para sim e N para não: ");
						}
					} while (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S');
					//Se a escolha for sim, prosseguimos
					if (escolha == 'S' || escolha == 's') {
						//Armazena o valor da compra
						valorDaCompra = quantidade*sabonete.getPrecoDoProduto();
						//Criação do objeto Compra através do Construtor
						Compra compraSabonete = new Compra(cliente, sabonete, valorDaCompra);
						//Adicionando o objeto criado no ArrayList listaCompras
						ConjuntoCompra.cadastrarCompra(compraSabonete);
						//Diminui a quantidade comprada do estoque do produto
						sabonete.setQuantidadeProduto(sabonete.getQuantidadeProduto() - quantidade);
						
						System.out.println("\n=========================================================================");
						System.out.println("Compra finalizada! Agradecemos a preferência");
						System.out.println("=========================================================================");
						System.out.println("Sobre o produto: ");
						System.out.println("-------------------------------------------------------------------------");
						System.out.println(sabonete.listarDados());
						System.out.println("=========================================================================");
						System.out.println("Valor da compra: R$ " + valorDaCompra);
						System.out.println("=========================================================================");
						quantidade = ConjuntoCompra.quantidade(cpf);
						System.out.println("\n=========================================================================");
						System.out.println("Compras realizadas até o momento em nossa loja: " + quantidade);	
						System.out.println("=========================================================================");
					}
				}
			} while(quantidade > sabonete.getQuantidadeProduto());
		} else {
			System.out.println("\n=========================================================================");
			System.out.println("Código não encontrado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	
	//OPÇÃO 10 - Somente o gerenciador do sistema
	public static void listarCompras(GerenciadorDoSistema funcionario) {
		//Declarações
		
		//Se o login tiver sido validado com sucesso, podemos prosseguir com a listagem
		if (login(funcionario)) {
			
		} else {
			System.out.println("=========================================================================");
			System.out.println("Usuário não autenticado. Tente novamente.");
			System.out.println("=========================================================================");
		}
	}
	
	//OPÇÃO 11
	public static char sair() {
		//Declarações
		char escolha = 0;
		
		//Pergunta se o usuário deseja sair do programa, valida a entrada
		//de dado e retorna um caractere 
		System.out.print("\n>>>Deseja realmente sair? [S/N]: ");
		do {
			escolha = LerDados.lerChar(escolha);
			if (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S') {
				System.out.print(">>>Digite S para sim e N para não: ");
			}
		} while (escolha != 'n' && escolha != 'N' && escolha != 's' && escolha != 'S');
		
		return escolha;
	}
}
