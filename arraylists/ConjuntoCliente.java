package arraylists;

import java.util.ArrayList;
import cliente.Cliente;

public class ConjuntoCliente {
	//Criação do ArrayList de objetos do tipo Cliente
	private static final ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	//Adicionar o objeto do tipo Cliente no ArrayList
	public static void cadastrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	//Deletar o objeto do tipo Cliente do ArrayList
	public static void deletarCliente(Cliente cliente) {
		listaClientes.remove(cliente);
	}
	
	//Pesquisa o objeto do tipo Cliente pelo nome dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static Cliente pesquisarCliente(String nome) {
		for (Cliente cliente : listaClientes) {
			if (nome.equalsIgnoreCase(cliente.getNomeCliente())) {
				return cliente;
			}
		}
		return null;
	}
}
