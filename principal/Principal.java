package principal;

import leituraDeDados.LerDados;
import pessoas.*;
import produtos.*;
import arraylists.*;

public class Principal {

	//Inst�ncia de objetos para pr�-carregamento do programa
	//adicionando-os ao ArrayList de Produto
	public static void carregamentoInicial() {
		//Perfume
		Perfumaria zaad = new Perfumaria("Perfume", 249.90, 95, "B81382", "ZAAD", "Santal",
				"Perfumaria Masculina", "Vegano e Cruelty Free", "Amadeirado", "Amadeirado");
		ConjuntoProduto.cadastrarProduto(zaad);
		Perfumaria malbec = new Perfumaria("Perfume", 143.90, 100, "B83188", "Malbec", "Bleu",
				"Perfumaria Masculina", "Cruelty Free", "", "");
		ConjuntoProduto.cadastrarProduto(malbec);
		//Hidratante
		Hidratante nativaSPA = new Hidratante("Hidratante", 42.90, 200, "B81338", "Nativa SPA", 
				"Org�nico","Todos os tipos");
		ConjuntoProduto.cadastrarProduto(nativaSPA);
		Hidratante lily = new Hidratante("Hidratante", 74.90, 250, "B77687", "Lily", "", 
				"Todos os tipos");
		ConjuntoProduto.cadastrarProduto(lily);
		//ProtetorSolar
		ProtetorSolar cuidesebem = new ProtetorSolar("Protetor Solar", 54.90, 50, "B72104", 
				"Cuide-se bem","Faciall", "Cruelty Free", 50);
		ConjuntoProduto.cadastrarProduto(cuidesebem);
		ProtetorSolar cuidesebem2 = new ProtetorSolar("Protetor Solar", 55.90, 200, "B75844", 
				"Cuide-se bem","Solar", "Cruelty Free", 30);
		ConjuntoProduto.cadastrarProduto(cuidesebem2);
		//Shampoo
		Shampoo nativaSPA2 = new Shampoo("Shampoo", 44.90, 300, "B79919", "Nativa SPA", "Matcha",
				"Todos os tipos", "Cruelty Free", "Res�duos");
		ConjuntoProduto.cadastrarProduto(nativaSPA2);
		Shampoo match = new Shampoo("Shampoo", 35.90, 250, "B81651", "Match.", "Anti Oleosidade",
				"Oleosos ou Mistos", "Vegano e Cruelty Free", "Olesosos");
		ConjuntoProduto.cadastrarProduto(match);
		//Condicionador
		Condicionador cuidesebem3 = new Condicionador("Condicionador", 24.90, 250, "B73913", 
				"Cuide-se bem", "Lisos", "Todos os tupos", "Cruelty Free", 
				"Envelhecimento dos fios");
		ConjuntoProduto.cadastrarProduto(cuidesebem3);
		Condicionador sophie = new Condicionador("Condicionador", 30.90, 200, "B75163", 
				"Sophie", "", "Todos os tipos", "Cruelty Free", "Res�duos");
		ConjuntoProduto.cadastrarProduto(sophie);
		//Sabonete L�quido
		SaboneteLiquido nativaSPA3 = new SaboneteLiquido("Sabonete L�quido", 31.90, 200, "B71196",
				"Nativa SPA","Lichia", "Cruelty Free");
		ConjuntoProduto.cadastrarProduto(nativaSPA3);
		SaboneteLiquido floratta = new SaboneteLiquido("Sabonete L�quido", 15.90, 75, "B75101", 
				"Floratta","Rose", "Cruelty Free");
		ConjuntoProduto.cadastrarProduto(floratta);
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
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
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
		System.out.println("[5] Pesquisar um produto");
		System.out.println("[6] Pesquisar um cliente");
		System.out.println("[7] Listar dados de um produto");
		System.out.println("[8] Listar dados de um cliente");
		System.out.println("[9] Deletar um produto");
		System.out.println("[10] Deletar um cliente");
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
		System.out.println("===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		Perfumaria perfume = new Perfumaria("Perfume", preco, volume, codigo, marca, linha, 
				categoria, propriedades, familia, subfamilia);
		
		//Adicionando o objeto criado no ArrayList de Produto
		ConjuntoProduto.cadastrarProduto(perfume);
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
		System.out.println("===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		Hidratante hidratante = new Hidratante("Hidratante", preco, volume, codigo, marca, linha, 
				tipo);
		
		//Adicionando o objeto criado no ArrayList de Produto
		ConjuntoProduto.cadastrarProduto(hidratante);
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
		System.out.println("===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		ProtetorSolar protetor = new ProtetorSolar("Protetor Solar", preco, volume, codigo, marca,
				linha, propriedades, fps);
		
		//Adicionando o objeto criado no ArrayList de Produto
		ConjuntoProduto.cadastrarProduto(protetor);
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
		System.out.println("===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		Shampoo shampoo = new Shampoo("Shampoo", preco, volume, codigo, marca, linha, tipo, 
				propriedades, condicao);
		
		//Adicionando o objeto criado no ArrayList de Produto
		ConjuntoProduto.cadastrarProduto(shampoo);
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
		System.out.println("===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		Condicionador condicionador = new Condicionador("Condicionador", preco, volume, codigo, 
				marca, linha, tipo, propriedades, condicao);
		
		//Adicionando o objeto criado no ArrayList de Produto
		ConjuntoProduto.cadastrarProduto(condicionador);
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
		System.out.println("===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		SaboneteLiquido sabonete = new SaboneteLiquido("Sabonete L�quido", preco, volume, codigo, 
				marca, linha, propriedades);
		
		//Adicionando o objeto criado no ArrayList de Produto
		ConjuntoProduto.cadastrarProduto(sabonete);
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
		String codigo = "";
		Produto produto;
		
		//Se o login tiver sido validado, podemos prosseguir com a edi��o
		if (login(funcionario)) {
			//Programa continua se houver Produto cadastrado no sistema
			if (ConjuntoProduto.temProduto()) {
				System.out.print(">>>Informe o c�digo do produto: ");
				codigo = LerDados.lerString();
				produto = ConjuntoProduto.pesquisarProduto(codigo);
				//Programa continua se o c�digo for encontrado no sistema
				if (produto != null) {
					//Produto � deletado e recadastrado
					ConjuntoProduto.deletarProduto(produto);
					if (produto.getIdentificador().equals("Perfume")) {
						cadastrarPerfume();
					} else if (produto.getIdentificador().equals("Hidratante")) {
						cadastrarHidratante();
					} else if (produto.getIdentificador().equals("Protetor Solar")) {
						cadastrarProtetorSolar();
					} else if (produto.getIdentificador().equals("Shampoo")) {
						cadastrarShampoo();
					} else if (produto.getIdentificador().equals("Condicionador")) {
						cadastrarCondicionador();
					} else if (produto.getIdentificador().equals("Sabonete L�quido")) {
						cadastrarSaboneteLiquido();
					}
				} else {
					System.out.println("=================================================================================================");
					System.out.println("O c�digo informado n�o foi encontrado no sistema.");
					System.out.println("=================================================================================================");
				}
			} else {
				System.out.println("=================================================================================================");
				System.out.println("Ainda n�o foi cadastrado nenhum produto.");
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
