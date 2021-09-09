package compra;

import pessoas.Cliente;
import produtos.Produto;

public class Compra {
	//Atributos
	private Cliente cliente;
	private Produto produto;
	private double valorDaCompra;
	
	//Construtor
	public Compra(Cliente cliente, Produto produto, double valorDaCompra) {
		this.setCliente(cliente);
		this.setProduto(produto);
		this.setValorDaCompra(valorDaCompra);
	}
	
	//Métodos modificadores
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public void setValorDaCompra(double valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}
	
	//Métodos acessores
	public Cliente getCliente() {
		return this.cliente;
	}
	public Produto getProduto() {
		return this.produto;
	}
	public double getValorDaCompra() {
		return this.valorDaCompra;
	}
}
