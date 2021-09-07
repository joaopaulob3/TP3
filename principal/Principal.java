package principal;

import leituraDeDados.LerDados;
import produtos.*;
import arraylists.ConjuntoProduto;

public class Principal {

	public static void main(String[] args) {
		//Declara��es
		int opcao = 0;
		char escolha = 0;
		//Perfumaria perfume;
		
		
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				cadastrarProduto();
				break;
			case 2:
				break;
			case 3:
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
	
	//OP��O 1
	public static void cadastrarProduto() {
		//Declara��es
		int opcao = 0;
		
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
		System.out.print(">>>Sua op��o:");
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
		Perfumaria perfume = new Perfumaria(preco, volume, codigo, marca, linha, categoria,
				propriedades, familia, subfamilia);
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
		Hidratante hidratante = new Hidratante(preco, volume, codigo, marca, linha, tipo);
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
		
		System.out.println(">>>FPS do protetor solar: ");
		fps = LerDados.lerInt(fps);
		System.out.println("===============================================================================================");
		System.out.println("PRODUTO CADASTRADO!");
		System.out.println("===============================================================================================");
		
		//Cria��o do objeto do tipo Perfumaria atrav�s do Construtor
		ProtetorSolar protetor = new ProtetorSolar(preco, volume, codigo, marca, linha,
				propriedades, fps);
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
		Shampoo shampoo = new Shampoo(preco, volume, codigo, marca, linha, tipo, propriedades,
				condicao);
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
		Condicionador condicionador = new Condicionador(preco, volume, codigo, marca, linha,
				tipo, propriedades, condicao);
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
		SaboneteLiquido sabonete = new SaboneteLiquido(preco, volume, codigo, marca, linha,
				propriedades);
		//Adicionando o objeto criado no ArrayList de Produto
		ConjuntoProduto.cadastrarProduto(sabonete);
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
