package arraylists;

import java.util.ArrayList;
import compra.Compra;

public class ConjuntoCompra {
	//Criação do ArrayList contendo objetos do tipo Compra (com Cliente e Produto)
	private static final ArrayList<Compra> listaCompras = new ArrayList<>();
	
	//Cadastro de uma compra
	public static void cadastrarCompra(Compra compra) {
		listaCompras.add(compra);
	}
	
	//Deleção de uma compra
	public static void deletarCompra(Compra compra) {
		listaCompras.remove(compra);
	}
	
	//Retorna a quantidade de objetos do tipo Compra dentro do ArrayList
	public static int quantidade() {
		return listaCompras.size();
	}
	
	//Retorna a quantidade de compras que um cliente específico fez
	public static int quantidade(String cpf) {
		int contador = 0;
		
		for (Compra compra : listaCompras) {
			if (cpf.equals(compra.getCliente().getCpf())) {
				++contador;
			}
		}
		
		return contador;
	}
	
	//Retorna o valor financeiro gasto de um cliente específico na loja
	public static double valorGasto(String cpf) {
		double valor = 0;
		
		for (Compra compra : listaCompras) {
			if (cpf.equals(compra.getCliente().getCpf())) {
				valor += compra.getValorDaCompra();
			}
		}
		
		return valor;
	}
}
