package MAP;

public class Conta {
private String tipo;
private int agencia;
private int numero;
private double saldo;

public Conta(String tipo, int agencia,int numero,double saldo) {
	this.tipo=tipo;
	this.agencia=agencia;
	this.numero=numero;
	this.saldo=saldo;
	
}
public Conta() {
	
}
public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public int getAgencia() {
	return agencia;
}

public void setAgencia(int agencia) {
	this.agencia = agencia;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

}
