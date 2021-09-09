package produtos;

public class ProtetorSolar extends Produto{
	//Atributos
	private String propriedadesDoProtetorSolar;
	private int fpsDoProtetorSolar;
	
	//Construtor
	public ProtetorSolar(double precoDoProduto, double volumeDoProduto, String codigoDoProduto, 
			String marcaDoProduto, String linhaDoProduto, int quantidadeProduto, 
			String propriedadesDoProtetorSolar, int fpsDoProtetorSolar) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto,
				quantidadeProduto);
		this.setPropriedadesDoProtetorSolar(propriedadesDoProtetorSolar);
		this.setFpsDoProtetorSolar(fpsDoProtetorSolar);
	}
	
	//M�todos modificadores
	public void setPropriedadesDoProtetorSolar(String propriedadesDoProtetorSolar) {
		this.propriedadesDoProtetorSolar = propriedadesDoProtetorSolar;
	}
	public void setFpsDoProtetorSolar(int fpsDoProtetorSolar) {
		this.fpsDoProtetorSolar = fpsDoProtetorSolar;
	}
	
	//M�todos acessores
	public String getPropriedadesDoProtetorSolar() {
		return this.propriedadesDoProtetorSolar;
	}
	public int getFpsDoProtetorSolar() {
		return this.fpsDoProtetorSolar;
	}
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Quantidade no estoque: " + this.getQuantidadeProduto() + 
				"\nPre�o do protetor solar: R$" + this.getPrecoDoProduto() +
				"\nVolume do protetor solar (ml): " + this.getVolumeDoProduto() +
				"\nC�digo do protetor solar: " + this.getCodigoDoProduto() + 
				"\nMarca do protetor solar: " + this.getMarcaDoProduto() + 
				"\nLinha do protetor solar: " + this.getLinhaDoProduto() + 
				"\nPropriedades do protetor solar: " + this.getPropriedadesDoProtetorSolar() + 
				"\nFPS do protetor solar: " + this.getFpsDoProtetorSolar();
	}
}
