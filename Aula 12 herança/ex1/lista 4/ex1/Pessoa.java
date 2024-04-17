package ex1;

public class Pessoa {
    private String nome;
    private String endereco;
    private double rendaBruta;
  
	public Pessoa(String nome, String endereco, double rendaBruta) {	
		this.nome = nome;
		this.endereco = endereco;
		this.rendaBruta = rendaBruta;
	}
	public Pessoa() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	 public double calculaImposto() {
		 return this.rendaBruta*0.1;
 }
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", rendaBruta=" + rendaBruta + "]";
	}
  
}
