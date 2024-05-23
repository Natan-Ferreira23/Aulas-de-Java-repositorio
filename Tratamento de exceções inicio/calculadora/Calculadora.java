package calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
private int x;
private int y;
public Calculadora(int x, int y) {
	this.x=x;
	this.y=y;                                                   
}

public Calculadora() {
	
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int soma() {
	 return x+y;
}
public int subtracao() {
	return x-y;
}
public int multiplicacao() {
	return x*y;
}
public int divisao() { //tratamento de erros
	Scanner se= new Scanner(System.in);
	
	 while(true) {
		try {
			return x/y;
		}catch(ArithmeticException e) { // aritimético exceção
			System.out.println("Mensagem "+ e.getMessage());	
			System.out.println("Informe novamente: ");
			y=se.nextInt();
		}catch(InputMismatchException e) {
			 System.out.println("Tipo de entrada incorreto ");
			 System.out.println("Informe novamente");
			 y= se.nextInt();
		}
	 }
	
}

}
