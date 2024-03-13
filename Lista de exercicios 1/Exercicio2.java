
import java.util.*;
public class Exercicio2 {
 public static void  main(String args[]) {
	 Scanner leitura= new Scanner (System.in);
	 System.out.println("Digite um numero de quatro digitos: ");
	int num =leitura.nextInt();
	int dezena1;
	int dezena2;
	int soma;
	double raiz;
	 if(num>=1000 && num<=9999) {
		 dezena1=num/100;
		 dezena2=num%100;
		 System.out.println("dezena 1: "+dezena1);
		 System.out.println("dezena 2: "+ dezena2);
		 raiz=Math.sqrt(num);
		 System.out.println("Raiz quadrada de " + num + " é " + raiz);
		soma= dezena1+dezena2;
		System.out.println("A soma das dezenas é: "+ soma);
		if(raiz==soma) {
			System.out.printf("\n A soma da dezena1: %d e dezena2: %d, soma: %d é igual a raiz quadrada de %d \n",dezena1,dezena2,soma,num);
		}
		else {
			System.out.println("A soma das dezenas não é igual a raiz quadrada de "+ num);
		}
	 }
	 else {
		 System.out.println("O numero não tem 4 digitos !");
	 }
 } 
}
