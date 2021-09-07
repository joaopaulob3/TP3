package pessoas;

public class Cliente extends Pessoa{
	//Atributos
	private String nomeCliente;
	private String emailCliente;
	private String celularCliente;
	private String generoCliente;
	
	//Construtor
	public Cliente(String cpf, String senha, String nomeCliente, String emailCliente,
			String celularCliente, String generoCliente) {
		super(cpf, senha);
		this.setNomeCliente(nomeCliente);
		this.setEmailCliente(emailCliente);
		this.setCelularCliente(celularCliente);
		this.setGeneroCliente(generoCliente);
	}
	
	//Métodos modificadores
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}
	public void setGeneroCliente(String generoCliente) {
		this.generoCliente = generoCliente;
	}
	
	//Métodos acessores
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public String getCelularCliente() {
		return celularCliente;
	}
	public String getGeneroCliente() {
		return generoCliente;
	}
	
}
