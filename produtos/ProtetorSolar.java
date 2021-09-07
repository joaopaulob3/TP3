package produtos;

public class ProtetorSolar extends Produto{
	//Atributos
	private String propriedadesDoProtetorSolar;
	private int fpsDoProtetorSolar;
	
	//Construtor
	public ProtetorSolar(String identificador, double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto, 
			String propriedadesDoProtetorSolar, int fpsDoProtetorSolar) {
		super("Protetor Solar", precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto);
		this.setPropriedadesDoProtetorSolar(propriedadesDoProtetorSolar);
		this.setFpsDoProtetorSolar(fpsDoProtetorSolar);
	}
	
	//Métodos modificadores
	public void setPropriedadesDoProtetorSolar(String propriedadesDoProtetorSolar) {
		this.propriedadesDoProtetorSolar = propriedadesDoProtetorSolar;
	}
	public void setFpsDoProtetorSolar(int fpsDoProtetorSolar) {
		this.fpsDoProtetorSolar = fpsDoProtetorSolar;
	}
	
	//Métodos acessores
	public String getPropriedadesDoProtetorSolar() {
		return this.propriedadesDoProtetorSolar;
	}
	public int getFpsDoProtetorSolar() {
		return this.fpsDoProtetorSolar;
	}
	
	//Retorna uma String com os dados do objeto
	public String listarDados() {
		return "Preço do protetor solar: R$" + this.getPrecoDoProduto() +
				"\nVolume do protetor solar (ml): " + this.getVolumeDoProduto() +
				"\nCódigo do protetor solar: " + this.getCodigoDoProduto() + 
				"\nMarca do protetor solar: " + this.getMarcaDoProduto() + 
				"\nLinha do protetor solar: " + this.getLinhaDoProduto() + 
				"\nPropriedades do protetor solar: " + this.getPropriedadesDoProtetorSolar() + 
				"\nFPS do protetor solar: " + this.getFpsDoProtetorSolar() + "\n";
	}
}
