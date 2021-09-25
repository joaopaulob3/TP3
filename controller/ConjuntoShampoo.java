package controller;

import java.util.ArrayList;

import model.Shampoo;

public class ConjuntoShampoo {
	//Criação do ArrayList de objetos do tipo Shampoo
	private static final ArrayList<Shampoo> listaShampoos = new ArrayList<>();

	//Adicionar o objeto do tipo Shampoo no ArrayList
	public static void cadastrarShampoo(Shampoo shampoo) {
		listaShampoos.add(shampoo);
	}

	//Deletar o objeto do tipo Shampoo do ArrayList
	public static void deletarShampoo(Shampoo shampoo) {
		listaShampoos.remove(shampoo);
	}
	
	//Pesquisa o objeto do tipo Shampoo pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static Shampoo pesquisarShampoo(String codigo) {
		for (Shampoo shampoo : listaShampoos) {
			if (codigo.equals(shampoo.getCodigoDoProduto())) {
				return shampoo;
			}
		}
		return null;
	}
	
	//Verifica se há objeto do tipo Shampoo cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temShampoo() {
		if (listaShampoos.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	//Lista os dados dos shampoos do Arraylist
	public static void listaShampoo() {
		int i = 1;
		
		for (Shampoo shampoo : listaShampoos) {
			System.out.println("\n################################### " + (i++) + " ###################################");
			System.out.println(shampoo.listarDados());
			System.out.println("#########################################################################");
		}
	}
	
	//Retorna a quantidade de objetos do tipo Shampoo no ArrayList
	public static int quantidade() {
		return listaShampoos.size();
	}
}
