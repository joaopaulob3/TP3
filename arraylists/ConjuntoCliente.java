package arraylists;

import java.util.ArrayList;
import pessoas.Cliente;


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
	
	//Pesquisa o objeto do tipo Cliente pelo CPF dentro do ArrayList
	//e retorna esse objeto. Se o CPF informado não bater com o de nenhum
	//objeto, retorna null
	public static Cliente pesquisarCliente(String cpf) {
		for (Cliente cliente : listaClientes) {
			if (cpf.equals(cliente.getCpf())) {
				return cliente;
			}
		}
		return null;
	}
	
	//Verifica se há objeto do tipo Cliente cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temCliente() {
		if (listaClientes.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
	//Lista os dados dos clientes do Arraylist
	public static void listaClientes() {
		int i = 1;
		
		for (Cliente cliente : listaClientes) {
			System.out.println("\n################################### " + (i++) + " ###################################");
			System.out.println(cliente.listarDados());
			System.out.println("#########################################################################");
		}
	}
	
	//Retorna a quantidade de objetos do tipo Cliente no ArrayList
	public static int quantidade() {
		return listaClientes.size();
	}
}
