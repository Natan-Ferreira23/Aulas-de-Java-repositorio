package ex1;

public class PratoFeito extends Refeicao {
	private double valorServico;
public PratoFeito() {
	
}
 public PratoFeito(String data,String hora,String nome,double preco,double valorServico) {
		super(data,hora,nome,preco);
		this.valorServico = valorServico;
	}

public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

public double valorRefeicao() {
	 return valorServico+getPreco();
 }
}
