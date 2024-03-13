import java.util.Scanner;

public class Exercicio7 {
public static void main (String args[]) {
	Scanner leitura= new Scanner(System.in);
	System.out.println("Digite seu nome completo: ");
	String nome =leitura.nextLine();
	String palavras[]=nome.split(" ");
	for(int i=0; i<palavras.length;i++) {	
	    
		if(palavras[i].length()>2) {
			String caractere[]=palavras[i].split("");			
			System.out.printf("%s .",caractere[0]);
		}
	}
	
}
}
