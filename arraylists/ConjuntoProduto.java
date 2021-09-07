package arraylists;

import java.util.ArrayList;
import produtos.Produto;

public class ConjuntoProduto{
	//Cria��o do ArrayList de objetos do tipo Produto
	private static final ArrayList<Produto> listaProdutos = new ArrayList<>();

	//Adicionar o objeto do tipo Produto no ArrayList
	public static void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
	}

	//Deletar o objeto do tipo Produto do ArrayList
	public static void deletarProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	//Pesquisa o objeto do tipo Perfumaria pelo c�digo dentro do ArrayList
	//e retorna esse objeto. Se o c�digo informado n�o bater com o de nenhum
	//objeto, retorna null
	public static Produto pesquisarPerfume(String codigo) {
		for (Produto produto : listaProdutos) {
			if (codigo.equals(produto.getCodigoDoProduto())) {
				return produto;
			}
		}
		return null;
	}
	
}
