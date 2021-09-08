package arraylists;

import java.util.ArrayList;
import produtos.Hidratante;

public class ConjuntoHidratante {
	//Criação do ArrayList de objetos do tipo Hidratante
	private static final ArrayList<Hidratante> listaHidratantes = new ArrayList<>();
	
	//Adicionar o objeto do tipo Hidratante no ArrayList
	public static void cadastrarHidratante(Hidratante Hidratante) {
		listaHidratantes.add(Hidratante);
	}
	
	//Deletar o objeto do tipo Hidratante do ArrayList
	public static void deletarHidratante(Hidratante hidratante) {
		listaHidratantes.remove(hidratante);
	}
	
	//Pesquisa o objeto do tipo Hidratante pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static Hidratante pesquisarHidratante(String codigo) {
		for (Hidratante hidratante : listaHidratantes) {
			if(codigo.equals(hidratante.getCodigoDoProduto())) {
				return hidratante;
			}
		}
		return null;
	}
	
	//Verifica se há objeto do tipo Hidratante cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temHidratante() {
		if (listaHidratantes.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	//Lista os dados dos hidratantes do ArrayList
	public static void listaHidratantes() {
		for (Hidratante hidratante : listaHidratantes) {
			hidratante.listarDados();
		}
	}
}
