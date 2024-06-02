package ex1;

public class Paciente implements Comparable<Paciente>{
	private String nome;
	private String cpf;
	private String telefone;
	private boolean emTratamento;
	
	public Paciente() {
		
	}
	public Paciente(String nome, String cpf, String telefone, boolean emTratamento) {		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.emTratamento = emTratamento;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isEmTratamento() {
		return emTratamento;
	}
	public void setEmTratamento(boolean emTratamento) {
		this.emTratamento = emTratamento;
	}
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ",\n cpf=" + cpf + ",\n telefone=" + telefone + ",\n emTratamento=" + emTratamento
				+ "\n]";
	}
	@Override
	public int compareTo(Paciente o) {
		return this.cpf.compareTo(o.getCpf());
		
	}
	
	
}
