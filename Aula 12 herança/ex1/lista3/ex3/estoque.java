package ex3;

public class estoque {
 private String nome;
 private double preco;
 private int quantidade;
 
 public estoque() {
	 
 }
public estoque(String nome, double preco, int quantidade) {	
	this.nome = nome;
	this.preco = preco;
	this.quantidade = quantidade;
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
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
 
public double valorEstoque() {
	return this.preco*this.quantidade;
}
public void vende(int qtd) {
	this.quantidade-=qtd;
}
public void estoca(int qtd){
	this.quantidade+=qtd;
}
}
