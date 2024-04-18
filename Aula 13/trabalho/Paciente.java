package exercicio;

public class Paciente {
  private String nome;
  private String cpf;
  private boolean primeiraConsulta;
  private int idade;
  
	public Paciente(String nome, String cpf, boolean primeiraConsulta, int idade) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.primeiraConsulta = primeiraConsulta;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean getPrimeiraConsulta() {
		return primeiraConsulta;
	}
	public void setPrimeiraConsulta(boolean primeiraConsulta) {
		this.primeiraConsulta = primeiraConsulta;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
  public String toString() {
	  return "\n[Nome:"+this.nome+"\nCPF:"+this.cpf+"\nPrimeira consulta?:"+this.primeiraConsulta+"\nIdade:"+this.idade+"]";
  }
}
