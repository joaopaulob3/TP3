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
	
	//M�todos modificadores
	public void setTipoDePeleDoHidratante(String tipoDePeleDoHidratante) {
		this.tipoDePeleDoHidratante = tipoDePeleDoHidratante;
	}
	
	//M�todos acessores
	public String getTipoDePeleDoHidratante() {
		return this.tipoDePeleDoHidratante;
	}
	
	//Retorna uma String com os dados do objeto
	@Override
	public String listarDados() {
		return "Pre�o do hidratante: R$" + this.getPrecoDoProduto() +
				"\nVolume do hidratante (ml): " + this.getVolumeDoProduto() +
				"\nC�digo do hidratante: " + this.getCodigoDoProduto() + 
				"\nMarca do hidratante: " + this.getMarcaDoProduto() + 
				"\nLinha do hidratante: " + this.getLinhaDoProduto() + 
				"\nTipo de pele do hidratante: " + this.getTipoDePeleDoHidratante();
	}
}
