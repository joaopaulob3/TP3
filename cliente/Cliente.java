package cliente;

public class Cliente {
	//Atributos
	private String nomeCliente;
	private String emailCliente;
	private String cpfCliente;
	private String celularCliente;
	private String generoCliente;
	private String senhaCliente;
	
	//Construtor
	public Cliente(String nomeCliente, String emailCliente, String cpfCliente,
			String celularCliente, String generoCliente, String senhaCliente) {
		this.setNomeCliente(nomeCliente);
		this.setEmailCliente(emailCliente);
		this.setCpfCliente(cpfCliente);
		this.setCelularCliente(celularCliente);
		this.setGeneroCliente(generoCliente);
		this.setSenhaCliente(senhaCliente);
	}
	
	//Métodos modificadores
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}
	public void setGeneroCliente(String generoCliente) {
		this.generoCliente = generoCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	
	//Métodos acessores
	public String getNomeCliente() {
		return nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public String getCelularCliente() {
		return celularCliente;
	}
	public String getGeneroCliente() {
		return generoCliente;
	}
	public String getSenhaCliente() {
		return this.senhaCliente;
	}
}
