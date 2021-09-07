package produtos;

public class SaboneteLiquido extends Produto{
	//Atributos
	private String propriedadesDoSaboneteLiquido;
	
	//Construor
	public SaboneteLiquido(double precoDoProduto, double volumeDoProduto, String codigoDoProduto,
			String marcaDoProduto, String linhaDoProduto, String propriedadesDoSaboneteLiquido) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto);
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
	
	//Edita e atualiza os dados do objeto
	public void editarDados(double precoDoProduto, double volumeDoProduto, String codigoDoProduto,
			String marcaDoProduto, String linhaDoProduto, String propriedadesDoSaboneteLiquido) {
		this.setPrecoDoProduto(precoDoProduto);
		this.setVolumeDoProduto(volumeDoProduto);
		this.setCodigoDoProduto(codigoDoProduto);
		this.setMarcaDoProduto(marcaDoProduto);
		this.setLinhaDoProduto(linhaDoProduto);
		this.setPropriedadesDoSaboneteLiquido(propriedadesDoSaboneteLiquido);
	}
	
	//Retorna uma String com os dados do objeto
	public String listarDados() {
		return "Preço do sabonete líquido: R$" + this.getPrecoDoProduto() +
				"\nVolume do sabonete líquido (ml): " + this.getVolumeDoProduto() +
				"\nCódigo do sabonete líquido: " + this.getCodigoDoProduto() + 
				"\nMarca do sabonete líquido: " + this.getMarcaDoProduto() + 
				"\nLinha do sabonete líquido: " + this.getLinhaDoProduto() + 
				"\nPropriedades do sabonete líquido: " + this.getPropriedadesDoSaboneteLiquido() + "\n";
	}
}
