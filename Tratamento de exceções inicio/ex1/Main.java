package ex1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double resultado;
		double peso=-1,altura=-1;
		Scanner sc= new Scanner(System.in);			
		try {
			System.out.println("Digite seu peso: ");
			peso=sc.nextDouble();
			System.out.println("Digite a altura: ");
			altura=sc.nextDouble();
			resultado=Math.pow((peso/altura),2);
			System.out.println("O resultado do icm é: "+ resultado);
		}catch() {
			
		}
				
	}

}
