package ex2;

public class Teste {
public static void main(String[] args) {
	
	Conta c1= new Conta(100);
	System.out.println("valor saldo "+ c1.getValorSaldo());
	c1.depositar(50);
	System.out.println("valor saldo "+ c1.getValorSaldo());
	c1.sacar(150);
	System.out.println("valor saldo "+ c1.getValorSaldo());
	c1.sacar(1);
	System.out.println("valor saldo "+ c1.getValorSaldo());
}
}
