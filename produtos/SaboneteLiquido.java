package produtos;

public class SaboneteLiquido extends Produto{
	//Atributos
	private String propriedadesDoSaboneteLiquido;
	
	//Construor
	public SaboneteLiquido(String identificador, double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto, 
			String propriedadesDoSaboneteLiquido) {
		super("Sabonete Líquido", precoDoProduto, volumeDoProduto, codigoDoProduto, 
				marcaDoProduto, linhaDoProduto);
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
	public String listarDados() {
		return "Preço do sabonete líquido: R$" + this.getPrecoDoProduto() +
				"\nVolume do sabonete líquido (ml): " + this.getVolumeDoProduto() +
				"\nCódigo do sabonete líquido: " + this.getCodigoDoProduto() + 
				"\nMarca do sabonete líquido: " + this.getMarcaDoProduto() + 
				"\nLinha do sabonete líquido: " + this.getLinhaDoProduto() + 
				"\nPropriedades do sabonete líquido: " + this.getPropriedadesDoSaboneteLiquido() 
				+ "\n";
	}
}
