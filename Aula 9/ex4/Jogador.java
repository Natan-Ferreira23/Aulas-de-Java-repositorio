package ex4;

public class Jogador {
 private String nome;
 private int numero;
 private String apelido;
 private int cartoes;
 private boolean suspenso;
 
 public Jogador() {
	 
 }
 
public Jogador(String nome, int numero, String apelido, int cartoes, boolean suspenso) {
	
	this.nome = nome;
	this.numero = numero;
	this.apelido = apelido;
	this.cartoes = cartoes;
	this.suspenso = suspenso;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getApelido() {
	return apelido;
}
public void setApelido(String apelido) {
	this.apelido = apelido;
}
public int getCartoes() {
	return cartoes;
}
public void setCartoes(int cartoes) {
	this.cartoes = cartoes;
}
public boolean getSuspenso() {
	return suspenso;
}
public void setSuspenso(boolean suspenso) {
	this.suspenso = suspenso;
}
 
 
}
