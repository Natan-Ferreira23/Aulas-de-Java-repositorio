
import java.util.*;
public class Exercicio {
public static void main(String[] args) {
	Scanner leitura=new Scanner(System.in);
	int num;
	double soma=0;
	int maior=0;
	int menor=0;
	int tot=0;
	
	
	do {
		
		System.out.println("Digite um numero: ");
		 num=leitura.nextInt();		
		 if(tot==0) {
			 maior=num;
			 menor=num;
		 }
		 if(num!=-1) {
			
			 soma+=num;
			 if(num>maior) {
				 maior=num;
			 }
			 if(num<menor) {
				 menor=num;
			 }
			 tot++;
		 }
	}while(num!=-1);
	double media = soma/tot;
	System.out.println("A media dos numeros digitados: " + media);
	System.out.println("O maior numero digitado: " +  maior);
	System.out.println("O menor numero digitado: "+ menor);
}
}
