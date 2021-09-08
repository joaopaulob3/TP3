package produtos;

public class Hidratante extends Produto{
	//Atributos
	private String tipoDePeleDoHidratante;
	
	//Construtor
	public Hidratante(double precoDoProduto, double volumeDoProduto, String codigoDoProduto, 
			String marcaDoProduto, String linhaDoProduto, String tipoDePeleDoHidratante) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto);
		this.setTipoDePeleDoHidratante(tipoDePeleDoHidratante);
	}
	
	//Métodos modificadores
	public void setTipoDePeleDoHidratante(String tipoDePeleDoHidratante) {
		this.tipoDePeleDoHidratante = tipoDePeleDoHidratante;
	}
	
	//Métodos acessores
	public String getTipoDePeleDoHidratante() {
		return this.tipoDePeleDoHidratante;
	}
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Preço do hidratante: R$" + this.getPrecoDoProduto() +
				"\nVolume do hidratante (ml): " + this.getVolumeDoProduto() +
				"\nCódigo do hidratante: " + this.getCodigoDoProduto() + 
				"\nMarca do hidratante: " + this.getMarcaDoProduto() + 
				"\nLinha do hidratante: " + this.getLinhaDoProduto() + 
				"\nTipo de pele do hidratante: " + this.getTipoDePeleDoHidratante();
	}
}
