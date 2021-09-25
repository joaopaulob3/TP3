package controller;

import java.util.ArrayList;

import model.Condicionador;

public class ConjuntoCondicionador {
	//Criação do ArrayList de objetos do tipo Condicionador
	private static final ArrayList<Condicionador> listaCondicionadores = new ArrayList<>();

	//Adicionar o objeto do tipo Condicionador no ArrayList
	public static void cadastrarCondicionador(Condicionador condicionador) {
		listaCondicionadores.add(condicionador);
	}

	//Deletar o objeto do tipo Condicionador do ArrayList
	public static void deletarCondicionador(Condicionador condicionador) {
		listaCondicionadores.remove(condicionador);
	}
	
	//Pesquisa o objeto do tipo Condicionador pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static Condicionador pesquisarCondicionador(String codigo) {
		for (Condicionador condicionador : listaCondicionadores) {
			if (codigo.equals(condicionador.getCodigoDoProduto())) {
				return condicionador;
			}
		}
		return null;
	}
	
	//Verifica se há objeto do tipo Condicionador cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temCondicionador() {
		if (listaCondicionadores.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	//Lista os dados dos condicionadores do Arraylist
	public static void listaCondicionador() {
		int i = 1;
		
		for (Condicionador condicionador : listaCondicionadores) {
			System.out.println("\n################################### " + (i++) + " ###################################");
			System.out.println(condicionador.listarDados());
			System.out.println("#########################################################################");
		}
	}
	
	//Retorna a quantidade de objetos do tipo Condicionador no ArrayList
	public static int quantidade() {
		return listaCondicionadores.size();
	}
}
