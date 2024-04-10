package slide11Ex2;

public class Fornecedor extends Pessoa {
 private double valorCredito;
 private double valorDivida;
public Fornecedor() {
	

}
public Fornecedor(String nome, String endereco, String telefone,double valorCredito, double valorDivida) {
	super(nome, endereco, telefone);
	this.valorCredito=valorCredito;
	this.valorDivida=valorDivida;
}
public double getValorCredito() {
	return valorCredito;
}
public void setValorCredito(double valorCredito) {
	this.valorCredito = valorCredito;
}
public double getValorDivida() {
	return valorDivida;
}
public void setValorDivida(double valorDivida) {
	this.valorDivida = valorDivida;
}
public double obterSaldo() {
	return this.valorCredito-this.valorDivida;
}

public String toString() {
	return super.toString()+"\nValor de crédito:"+this.valorCredito+"\nValor da divida:"+this.valorDivida;
}
 
}
