package arraylists;

import java.util.ArrayList;
import produtos.Produto;

public class ConjuntoProduto{
	//Criação do ArrayList de objetos do tipo Produto
	private static final ArrayList<Produto> listaProdutos = new ArrayList<>();

	//Adicionar o objeto do tipo Produto no ArrayList
	public static void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
	}

	//Deletar o objeto do tipo Produto do ArrayList
	public static void deletarProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	//Pesquisa o objeto do tipo Produto pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static Produto pesquisarProduto(String codigo) {
		for (Produto produto : listaProdutos) {
			if (codigo.equals(produto.getCodigoDoProduto())) {
				return produto;
			}
		}
		return null;
	}
	
	//Verifica se há objeto do tipo Produto cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temProduto() {
		if (listaProdutos.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}
