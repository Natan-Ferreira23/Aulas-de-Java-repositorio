package Herança;

public class Pessoa {
 protected String nome; //deixamos protected, ou seja agora podemos usar os atributos na classe filha normalmente.
 protected String cpf;
 protected String dataNasc;
 protected Pessoa() {
	 
 }
 public Pessoa(String nome,String cpf, String dataNasc) {
	 this.nome=nome;
	 this.cpf=cpf;
	 this.dataNasc=dataNasc;
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
public String getDataNasc() {
	return dataNasc;
}
public void setDataNasc(String dataNasc) {
	this.dataNasc = dataNasc;
}
 public String toString() {
	 return "nome="+this.nome+"\ncpf="+this.cpf+"\ndata de nascimento="+this.dataNasc;
 }
}
