package controller;

import java.util.ArrayList;

import model.ProtetorSolar;

public class ConjuntoProtetorSolar {
	//Criação do ArrayList de objetos do tipo ProtetorSolar
	private static final ArrayList<ProtetorSolar> listaProtetorSolar = new ArrayList<>();

	//Adicionar o objeto do tipo ProtetorSolar no ArrayList
	public static void cadastrarProtetorSolar(ProtetorSolar protetor) {
		listaProtetorSolar.add(protetor);
	}

	//Deletar o objeto do tipo ProtetorSolar do ArrayList
	public static void deletarProtetorSolar(ProtetorSolar protetor) {
		listaProtetorSolar.remove(protetor);
	}
	
	//Pesquisa o objeto do tipo ProtetorSolar pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static ProtetorSolar pesquisarProtetorSolar(String codigo) {
		for (ProtetorSolar protetor : listaProtetorSolar) {
			if (codigo.equals(protetor.getCodigoDoProduto())) {
				return protetor;
			}
		}
		return null;
	}
	
	//Verifica se há objeto do tipo ProtetorSolar cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temProtetorSolar() {
		if (listaProtetorSolar.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	//Lista os dados dos protetores do Arraylist
	public static void listaProtetorSolar() {
		int i = 1;
		
		for (ProtetorSolar protetor : listaProtetorSolar) {
			System.out.println("\n################################### " + (i++) + " ###################################");
			System.out.println(protetor.listarDados());
			System.out.println("#########################################################################");
		}
	}
	
	//Retorna a quantidade de objetos do tipo ProtetorSolar no ArrayList
	public static int quantidade() {
		return listaProtetorSolar.size();
	}
}
