package produtos;

public abstract class Produto {
	//Atributos
	private String identificador;
	private double precoDoProduto;
	private double volumeDoProduto;
	private String codigoDoProduto;
	private String marcaDoProduto;
	private String linhaDoProduto;
	
	//Construtor
	public Produto(String identificador, double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto) {
		this.setIdentificador(identificador);
		this.setPrecoDoProduto(precoDoProduto);
		this.setVolumeDoProduto(volumeDoProduto);
		this.setCodigoDoProduto(codigoDoProduto);
		this.setMarcaDoProduto(marcaDoProduto);
		this.setLinhaDoProduto(linhaDoProduto);
	}
	//Métodos modificadores
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
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
	
	//Métodos acessores
	public String getIdentificador() {
		return this.identificador;
	}
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
}
