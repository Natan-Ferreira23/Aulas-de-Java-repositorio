package ex2;

public class ExcecaoConta extends Exception {
 private double valorSaldo;
 public ExcecaoConta() {
	 
 }
public ExcecaoConta(double valorSaldo) {
	 this.valorSaldo=valorSaldo;
 }
 public String toString() {
	 return "O valor do saldo é insuficiente para saque "+ "(saldo= R$"+valorSaldo+"\n"; 
 }
 public String getMessage() {
	 return "Saldo insuficiente !\n";
 }
}
