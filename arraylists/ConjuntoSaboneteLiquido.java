package arraylists;

import java.util.ArrayList;
import produtos.SaboneteLiquido;

public class ConjuntoSaboneteLiquido {
	//Criação do ArrayList de objetos do tipo SaboneteLiquido
	private static final ArrayList<SaboneteLiquido> listaSabonetesLiquido = new ArrayList<>();

	//Adicionar o objeto do tipo SaboneteLiquido no ArrayList
	public static void cadastrarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.add(sabonete);
	}

	//Deletar o objeto do tipo SaboneteLiquido do ArrayList
	public static void deletarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.remove(sabonete);
	}
	
	//Pesquisa o objeto do tipo SaboneteLiquido pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static SaboneteLiquido pesquisarSaboneteLiquido(String codigo) {
		for (SaboneteLiquido sabonete : listaSabonetesLiquido) {
			if (codigo.equals(sabonete.getCodigoDoProduto())) {
				return sabonete;
			}
		}
		return null;
	}
	
	//Verifica se há objeto do tipo SaboneteLiquido cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temSaboneteLiquido() {
		if (listaSabonetesLiquido.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	//Lista os dados dos sabonetes líquido do Arraylist
	public static void listaSaboneteLiquido() {
		for (SaboneteLiquido sabonete : listaSabonetesLiquido) {
			sabonete.listarDados();
		}
	}
}
