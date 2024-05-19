package ex1;

public abstract class Refeicao {
 private String data;
 private String hora;
 private String nome;
 private double preco;
 public Refeicao() {
	 
 }
 public Refeicao(String data,String hora, String nome,double preco) {
	 this.data=data;
	 this.hora=hora;
	 this.nome=nome;
	 this.preco=preco;
 }
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getHora() {
	return hora;
}
public void setHora(String hora) {
	this.hora = hora;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public abstract double valorRefeicao();
}
