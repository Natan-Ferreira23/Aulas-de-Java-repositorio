package ex5;
import java.util.Scanner;
public class Teste {
	public static void main(String[] args) {
		Exercicio5 e1= new Exercicio5();
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Informe a frase: ");
	   String frase=sc.nextLine();
	   try {
		   e1.tratarString(frase);
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	}
}
