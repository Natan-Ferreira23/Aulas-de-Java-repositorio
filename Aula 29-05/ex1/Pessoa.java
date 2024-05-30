package ex1;

public class Pessoa implements Comparable<Pessoa> { //implementa a interface comparable para usarmos o metodos

	private String nome;
	private String cpf;
	private String dataNascimento;
	public Pessoa() {
		
	}
	public Pessoa(String nome,String cpf,String dataNascimento) {
		this.nome=nome;
		this.cpf=cpf;
		this.dataNascimento=dataNascimento;
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@Override
	public String toString() {
		return "Pessoa [nome= " + nome + "\n, cpf= " + cpf + "\n, dataNascimento= " + dataNascimento + "]\n";
	}
	@Override
	public int compareTo(Pessoa o) {
		
		
		return nome.compareTo(o.nome); //
	}
	
}
