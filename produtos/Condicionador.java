package produtos;

public class Condicionador extends Produto{
	//Atributos
	private String tipoDeCabeloDoCondicionador;
	private String propriedadesDoCondicionador;
	private String condicaoDosFiosDoCondicionador;
		
	//Construtor
	public Condicionador(double precoDoProduto, double volumeDoProduto, String codigoDoProduto, 
			String marcaDoProduto, String linhaDoProduto, String tipoDeCabeloDoCondicionador, 
			String propriedadesDoCondicionador, String condicaoDosFiosDoCondicionador) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto);
		this.setTipoDeCabeloDoCondicionador(tipoDeCabeloDoCondicionador);
		this.setPropriedadesDoCondicionador(propriedadesDoCondicionador);
		this.setCondicaoDosFiosDoCondicionador(condicaoDosFiosDoCondicionador);
	}
		
	//Métodos modificadores
	public void setTipoDeCabeloDoCondicionador(String tipoDeCabeloDoCondicionador) {
		this.tipoDeCabeloDoCondicionador = tipoDeCabeloDoCondicionador;
	}
	public void setPropriedadesDoCondicionador(String propriedadesDoCondicionador) {
		this.propriedadesDoCondicionador = propriedadesDoCondicionador;
	}
	public void setCondicaoDosFiosDoCondicionador(String condicaoDosFiosDoCondicionador) {
		this.condicaoDosFiosDoCondicionador = condicaoDosFiosDoCondicionador;
	}
	
	//Métodos acessores
	public String getTipoDeCabeloDoCondicionador() {
		return this.tipoDeCabeloDoCondicionador;
	}
	public String getPropriedadesDoCondicionador() {
		return this.propriedadesDoCondicionador;
	}
	public String getCondicaoDosFiosDoCondicionador() {
		return this.condicaoDosFiosDoCondicionador;
	}
		
	//Edita e atualiza os dados do objeto
	public void editarDados(double precoDoProduto, double volumeDoProduto, String codigoDoProduto,
			String marcaDoProduto, String linhaDoProduto, String tipoDeCabeloDoCondicionador,
			String propriedadesDoCondicionador, String condicaoDosFiosDoCondicionador) {
		this.setPrecoDoProduto(precoDoProduto);
		this.setVolumeDoProduto(volumeDoProduto);
		this.setCodigoDoProduto(codigoDoProduto);
		this.setMarcaDoProduto(marcaDoProduto);
		this.setLinhaDoProduto(linhaDoProduto);
		this.setTipoDeCabeloDoCondicionador(tipoDeCabeloDoCondicionador);
		this.setPropriedadesDoCondicionador(propriedadesDoCondicionador);
		this.setCondicaoDosFiosDoCondicionador(condicaoDosFiosDoCondicionador);
	}
	
	//Retorna uma String com os dados do objeto
	public String listarDados() {
		return "Preço do condicionador: R$" + this.getPrecoDoProduto() +
				"\nVolume do condicionador (ml): " + this.getVolumeDoProduto() +
				"\nCódigo do condicionador: " + this.getCodigoDoProduto() + 
				"\nMarca do condicionador: " + this.getMarcaDoProduto() + 
				"\nLinha do condicionador: " + this.getLinhaDoProduto() + 
				"\nTipo de cabelo do condicionador: " + this.getTipoDeCabeloDoCondicionador() + 
				"\nPropriedades do condicionador: " + this.getPropriedadesDoCondicionador() + 
				"\nCondição dos fios do condicionador: " + this.getCondicaoDosFiosDoCondicionador() + "\n";
	}
}
