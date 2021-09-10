package produtos;

public class Perfumaria extends Produto{
	//Atributos
	private String categoriaDoPerfume;
	private String propriedadesDoPerfume;
	private String familiaOlfativaDoPerfume;
	private String subfamiliaDoPerfume;
	
	//Construtor
	public Perfumaria(double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto,
			int quantidadeProduto, String categoriaDoPerfume, String propriedadesDoPerfume, 
			String familiaOlfativaDoPerfume, String subfamiliaDoPerfume) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, 
				linhaDoProduto, quantidadeProduto);
		this.setCategoriaDoPerfume(categoriaDoPerfume);
		this.setPropriedadesDoPerfume(propriedadesDoPerfume);
		this.setFamiliaOlfativaDoPerfume(familiaOlfativaDoPerfume);
		this.setSubfamiliaDoPerfume(subfamiliaDoPerfume);
	}
	
	//Métodos modificadores
	public void setCategoriaDoPerfume(String categoriaDoPerfume) {
		this.categoriaDoPerfume = categoriaDoPerfume;
	}
	public void setPropriedadesDoPerfume(String propriedadesDoPerfume) {
		this.propriedadesDoPerfume = propriedadesDoPerfume;
	}
	public void setFamiliaOlfativaDoPerfume(String familiaOlfativaDoPerfume) {
		this.familiaOlfativaDoPerfume = familiaOlfativaDoPerfume;
	}
	public void setSubfamiliaDoPerfume(String subfamiliaDoPerfume) {
		this.subfamiliaDoPerfume = subfamiliaDoPerfume;
	}
	
	//Métodos acessores
	public String getCategoriaDoPerfume() {
		return this.categoriaDoPerfume;
	}
	public String getPropriedadesDoPerfume() {
		return this.propriedadesDoPerfume;
	}
	public String getFamiliaOlfativaDoPerfume() {
		return this.familiaOlfativaDoPerfume;
	}
	public String getSubfamiliaDoPerfume() {
		return this.subfamiliaDoPerfume;
	}
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Marca do perfume: " + this.getMarcaDoProduto() + 
				"\nLinha do perfume: " + this.getLinhaDoProduto() + 
				"\nCategoria do perfume: " + this.getCategoriaDoPerfume() + 
				"\nPropriedades do perfume: " + this.getPropriedadesDoPerfume() + 
				"\nFamília olfativa do perfume: " + this.getFamiliaOlfativaDoPerfume() +
				"\nSubfamília do perfume: " + this.getSubfamiliaDoPerfume() +
				"\nCódigo do perfume: " + this.getCodigoDoProduto() +
				"\nPreço do perfume: R$" + this.getPrecoDoProduto() +
				"\nVolume do perfume (ml): " + this.getVolumeDoProduto() +
				"\n-------------------------------------------------------------------------" + 
				"\nQuantidade no estoque: " + this.getQuantidadeProduto();
	}
	
	//Retorna uma String com os dados relevantes para a listagem das compras
	@Override
	public String listarDadosFormaSeletiva() {
		return "\nMarca do perfume: " + this.getMarcaDoProduto() + 
				"\nCódigo do perfume: " + this.getCodigoDoProduto() +
				"\nPreço do perfume: R$" + this.getPrecoDoProduto();
	}
}
