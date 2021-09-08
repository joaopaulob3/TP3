package produtos;

public class SaboneteLiquido extends Produto{
	//Atributos
	private String propriedadesDoSaboneteLiquido;
	
	//Construor
	public SaboneteLiquido(double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto, 
			String propriedadesDoSaboneteLiquido) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, 
				marcaDoProduto, linhaDoProduto);
		this.setPropriedadesDoSaboneteLiquido(propriedadesDoSaboneteLiquido);
	}

	//M�todos modificadores
	public void setPropriedadesDoSaboneteLiquido(String propriedadesDoSaboneteLiquido) {
		this.propriedadesDoSaboneteLiquido = propriedadesDoSaboneteLiquido;
	}
	
	//M�todos acessores
	public String getPropriedadesDoSaboneteLiquido() {
		return this.propriedadesDoSaboneteLiquido;
	}
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Pre�o do sabonete l�quido: R$" + this.getPrecoDoProduto() +
				"\nVolume do sabonete l�quido (ml): " + this.getVolumeDoProduto() +
				"\nC�digo do sabonete l�quido: " + this.getCodigoDoProduto() + 
				"\nMarca do sabonete l�quido: " + this.getMarcaDoProduto() + 
				"\nLinha do sabonete l�quido: " + this.getLinhaDoProduto() + 
				"\nPropriedades do sabonete l�quido: " + this.getPropriedadesDoSaboneteLiquido();
	}
}
