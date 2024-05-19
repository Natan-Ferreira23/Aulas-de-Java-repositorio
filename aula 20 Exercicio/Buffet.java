package ex1;

public class Buffet extends Refeicao{
	private double peso;
	
	public Buffet(String data,String hora,String nome,double preco,double peso) {
		super(data,hora,nome,preco);
		this.peso = peso;
	}
	public Buffet() {
		
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double valorRefeicao() {
		 return peso*getPreco();
	 }
}
