package trabalho;

public class Produtos {
 
	private String nome;
	private double valorUnit;
	private int quantidade;
	
	public Produtos() {
		
	}
	public Produtos (String nome,double valorUnit,int quantidade) {
		this.nome=nome;
		this.valorUnit=valorUnit;
		this.quantidade=quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Produtos [nome=" + nome + ", valorUnit=" + valorUnit + ", quantidade=" + quantidade + "]";
	}
	

}
