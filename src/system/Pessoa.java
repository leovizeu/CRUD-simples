package system;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String email;
	private int rg;
	private int dataNascimento;
	
	public Pessoa(String nome, String sobrenome, String email, int rg, int dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public int getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
