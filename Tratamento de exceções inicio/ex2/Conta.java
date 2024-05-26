package ex2;

public class Conta {
 private double valorSaldo;

public Conta(double valorSaldo) {
	super();
	this.valorSaldo = valorSaldo;
}

public double getValorSaldo() {
	return valorSaldo;
}

public void setValorSaldo(double valorSaldo) {
	this.valorSaldo = valorSaldo;
}
public void depositar(double valor) {
	this.valorSaldo+=valor;
}
public void sacar(double valor) {
	try {
		 if(valor<=valorSaldo) {
			 valorSaldo-=valor;
		 }else {
			  throw new ExcecaoConta(valorSaldo);
		 }
		
	}catch(ExcecaoConta ec) {
		 System.out.println(ec.toString());
	}
}
public void sacar2(double valor) throws ExcecaoConta{
	if(valor<=valorSaldo) {
		valorSaldo-=valor;
	}else {
		throw new ExcecaoConta(valorSaldo);
	}
}
}
