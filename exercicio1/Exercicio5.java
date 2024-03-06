package exercicio5;
import java.util.Scanner;
public class Exercicio5 {
 public  static void main(String[]args) {
	 Scanner leitura=new Scanner(System.in);
	 System.out.println("Digite um texto: ");
	 String texto=leitura.nextLine();
	 
	 String frase[]=texto.split(" ");
	 String letras[]=texto.split("");
	 int totPalavra=0;
	 int totCaractere;
	 for(int i=0;i<frase.length;i++) {
		 totPalavra++;
	 }	 
	 
	 
     System.out.println("TOTAL DE  CARACTER É: " + letras.length);
	 System.out.println("O total de palavras é: "+ totPalavra);
   }
}
