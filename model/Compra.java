package model;

public class Compra {
	//Atributos
	private Cliente cliente;
	private Produto produto;
	private double valorDaCompra;
	private int quantidadeComprada;
	
	//Construtor
	public Compra(Cliente cliente, Produto produto, double valorDaCompra, int quantidadeComprada) {
		this.setCliente(cliente);
		this.setProduto(produto);
		this.setValorDaCompra(valorDaCompra);
		this.setQuantidadeComprada(quantidadeComprada);
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
	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
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
	public int getQuantidadeComprada() {
		return this.quantidadeComprada;
	}
}
