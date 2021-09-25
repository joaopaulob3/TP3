package model;

public class SaboneteLiquido extends Produto{
	//Atributos
	private String propriedadesDoSaboneteLiquido;
	
	//Construor
	public SaboneteLiquido(double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto, 
			int quantidadeProduto, String propriedadesDoSaboneteLiquido) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, 
				marcaDoProduto, linhaDoProduto, quantidadeProduto);
		this.setPropriedadesDoSaboneteLiquido(propriedadesDoSaboneteLiquido);
	}

	//Métodos modificadores
	public void setPropriedadesDoSaboneteLiquido(String propriedadesDoSaboneteLiquido) {
		this.propriedadesDoSaboneteLiquido = propriedadesDoSaboneteLiquido;
	}
	
	//Métodos acessores
	public String getPropriedadesDoSaboneteLiquido() {
		return this.propriedadesDoSaboneteLiquido;
	}
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Marca do sabonete líquido: " + this.getMarcaDoProduto() + 
				"\nLinha do sabonete líquido: " + this.getLinhaDoProduto() + 
				"\nPropriedades do sabonete líquido: " + this.getPropriedadesDoSaboneteLiquido() +
				"\nCódigo do sabonete líquido: " + this.getCodigoDoProduto() +
				"\nPreço do sabonete líquido: R$" + this.getPrecoDoProduto() +
				"\nVolume do sabonete líquido (ml): " + this.getVolumeDoProduto() +
				"\n-------------------------------------------------------------------------" + 
				"\nQuantidade no estoque: " + this.getQuantidadeProduto();
	}
	
	//Retorna uma String com os dados relevantes para a listagem das compras
	@Override
	public String listarDadosFormaSeletiva() {
		return "\nMarca do sabonete líquido: " + this.getMarcaDoProduto() + 
				"\nCódigo do sabonete líquido: " + this.getCodigoDoProduto() +
				"\nPreço do sabonete líquido: R$" + this.getPrecoDoProduto();
	}
}
