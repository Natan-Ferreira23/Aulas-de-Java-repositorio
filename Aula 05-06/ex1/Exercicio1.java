package ex1;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashMap<String,Integer> palavras= new HashMap<String,Integer>();
		String frase;
		System.out.println("Informe uma frase");
		frase=sc.nextLine();
		String [] aux= frase.split(" ");
		for(int i=0;i<aux.length;i++) {
			if(palavras.containsKey(aux[i])) {
				palavras.replace(aux[i], palavras.get(aux[i])+1);
			}else {
				palavras.put(aux[i],1);
			}
		}
	}
}
