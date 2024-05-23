package calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestaCalculadora {

	public static void main(String[] args) {
		int num1, num2;
		try {
			   Scanner sc= new Scanner(System.in);
			   System.out.println("Informe o primeiro número: ");
			   num1=sc.nextInt();
			   System.out.println("Informe o segundo numero: ");
			   num2=sc.nextInt();
			   Calculadora calc= new Calculadora (num1,num2);
			   System.out.println("Soma: "+calc.soma());
			   System.out.println("Subtração: "+calc.subtracao());
			   System.out.println("Multiplicação: "+calc.multiplicacao());
			   System.out.println("Divisao: "+calc.divisao());
		}catch(InputMismatchException e) {
			System.out.println("Deu erro: "+ e.getMessage());
		}finally {
			System.out.println("Fim da canculadora");
		}
	   
	}
}
