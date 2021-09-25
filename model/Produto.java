package model;

public abstract class Produto {
	//Atributos
	private double precoDoProduto;
	private double volumeDoProduto;
	private String codigoDoProduto;
	private String marcaDoProduto;
	private String linhaDoProduto;
	private int quantidadeProduto;
	
	//Construtor
	public Produto(double precoDoProduto, double volumeDoProduto, String codigoDoProduto, 
			String marcaDoProduto, String linhaDoProduto, int quantidadeProduto) {
		this.setPrecoDoProduto(precoDoProduto);
		this.setVolumeDoProduto(volumeDoProduto);
		this.setCodigoDoProduto(codigoDoProduto);
		this.setMarcaDoProduto(marcaDoProduto);
		this.setLinhaDoProduto(linhaDoProduto);
		this.setQuantidadeProduto(quantidadeProduto);
	}
	//Métodos modificadores
	public void setPrecoDoProduto(double precoDoProduto) {
		this.precoDoProduto = precoDoProduto;
	}
	public void setVolumeDoProduto(double volumeDoProduto) {
		this.volumeDoProduto = volumeDoProduto;
	}
	public void setCodigoDoProduto(String codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}
	public void setMarcaDoProduto(String marcaDoProduto) {
		this.marcaDoProduto = marcaDoProduto;
	}
	public void setLinhaDoProduto(String linhaDoProduto) {
		this.linhaDoProduto = linhaDoProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	//Métodos acessores
	public double getPrecoDoProduto() {
		return this.precoDoProduto;
	}
	public double getVolumeDoProduto() {
		return this.volumeDoProduto;
	}
	public String getCodigoDoProduto() {
		return this.codigoDoProduto;
	}
	public String getMarcaDoProduto() {
		return this.marcaDoProduto;
	}
	public String getLinhaDoProduto() {
		return this.linhaDoProduto;
	}
	public int getQuantidadeProduto() {
		return this.quantidadeProduto;
	}
	
	//Método abstrato de listar comum a todos os produtos que será sobreposto em cada classe
	public abstract String listarDados();
	
	//Método abstrato de listar de forma seletiva comum a todos os produtos que será sobreposto
	//em cada classe
	public abstract String listarDadosFormaSeletiva();
}
