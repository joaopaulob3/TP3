package produtos;

public class Shampoo extends Produto{
	//Atributos
	private String tipoDeCabeloDoShampoo;
	private String propriedadesDoShampoo;
	private String condicaoDosFiosDoShampoo;
	
	//Construtor
	public Shampoo(String identificador, double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto, 
			String tipoDeCabeloDoShampoo, String propriedadesDoShampoo, 
			String condicaoDosFiosDoShampoo) {
		super("Shampoo", precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, 
				linhaDoProduto);
		this.setTipoDeCabeloDoShampoo(tipoDeCabeloDoShampoo);
		this.setPropriedadesDoShampoo(propriedadesDoShampoo);
		this.setCondicaoDosFiosDoShampoo(condicaoDosFiosDoShampoo);
	}
	
	//M�todos modificadores
	public void setTipoDeCabeloDoShampoo(String tipoDeCabeloDoShampoo) {
		this.tipoDeCabeloDoShampoo = tipoDeCabeloDoShampoo;
	}
	public void setPropriedadesDoShampoo(String propriedadesDoShampoo) {
		this.propriedadesDoShampoo = propriedadesDoShampoo;
	}
	public void setCondicaoDosFiosDoShampoo(String condicaoDosFiosDoShampoo) {
		this.condicaoDosFiosDoShampoo = condicaoDosFiosDoShampoo;
	}
	
	//M�todos acessores
	public String getTipoDeCabeloDoShampoo() {
		return this.tipoDeCabeloDoShampoo;
	}
	public String getPropriedadesDoShampoo() {
		return this.propriedadesDoShampoo;
	}
	public String getCondicaoDosFiosDoShampoo() {
		return this.condicaoDosFiosDoShampoo;
	}
	
	//Retorna uma String com os dados do objeto
	public String listarDados() {
		return "Pre�o do shampoo: R$" + this.getPrecoDoProduto() +
				"\nVolume do shampoo (ml): " + this.getVolumeDoProduto() +
				"\nC�digo do shampoo: " + this.getCodigoDoProduto() + 
				"\nMarca do shampoo: " + this.getMarcaDoProduto() + 
				"\nLinha do shampoo: " + this.getLinhaDoProduto() + 
				"\nTipo de cabelo do shampoo: " + this.getTipoDeCabeloDoShampoo() + 
				"\nPropriedades do shampoo: " + this.getPropriedadesDoShampoo() + 
				"\nCondi��o dos fios do shampoo: " + this.getCondicaoDosFiosDoShampoo() + "\n";
	}
}
