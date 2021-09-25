package model;

public class Hidratante extends Produto{
	//Atributos
	private String tipoDePeleDoHidratante;
	
	//Construtor
	public Hidratante(double precoDoProduto, double volumeDoProduto, String codigoDoProduto, 
			String marcaDoProduto, String linhaDoProduto, int quantidadeProduto, 
			String tipoDePeleDoHidratante) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto,
				quantidadeProduto);
		this.setTipoDePeleDoHidratante(tipoDePeleDoHidratante);
	}
	
	//Métodos modificadores
	public void setTipoDePeleDoHidratante(String tipoDePeleDoHidratante) {
		this.tipoDePeleDoHidratante = tipoDePeleDoHidratante;
	}
	
	//Métodos acessores
	public String getTipoDePeleDoHidratante() {
		return this.tipoDePeleDoHidratante;
	}
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Marca do hidratante: " + this.getMarcaDoProduto() + 
				"\nLinha do hidratante: " + this.getLinhaDoProduto() + 
				"\nTipo de pele do hidratante: " + this.getTipoDePeleDoHidratante() +
				"\nCódigo do hidratante: " + this.getCodigoDoProduto() +
				"\nPreço do hidratante: R$" + this.getPrecoDoProduto() +
				"\nVolume do hidratante (ml): " + this.getVolumeDoProduto() +
				"\n-------------------------------------------------------------------------" +
				"\nQuantidade no estoque: " + this.getQuantidadeProduto();
	}
	
	//Retorna uma String com os dados relevantes para a listagem das compras
	@Override
	public String listarDadosFormaSeletiva() {
		return "\nMarca do hidratante: " + this.getMarcaDoProduto() + 
				"\nCódigo do hidratante: " + this.getCodigoDoProduto() +
				"\nPreço do hidratante: R$" + this.getPrecoDoProduto();
	}
}
