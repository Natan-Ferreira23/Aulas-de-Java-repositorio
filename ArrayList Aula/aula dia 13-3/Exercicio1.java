import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio1 {
 public static void main(String[] args) {
	ArrayList <String> lista= new ArrayList<String>();
	Scanner leitura= new Scanner(System.in);
	String nome;
	int controle=0;
	do {
		
		System.out.println("Digite seu nome completo para ser guardado na lista: ");
       nome=leitura.nextLine();
		if(nome.equals("fim")) {
			controle=1;
			System.out.println("--- Sistema foi encerrado ----");
			
		}else {
			lista.add(nome);
		}
	}while(controle==0);
	System.out.println(lista.toString());
	System.out.println("Digite um nome a ser buscado: ");
	String busca=leitura.nextLine();
    if(lista.contains(busca)) {
    	
    	System.out.println("O nome "+busca+" está na lista e sua posição é: "+lista.indexOf(busca));
    }else {
    	System.out.println("O nome "+busca+" não está na lista");
    }
    System.out.println("Digite um nome para ser removido do arrayList: ");
    busca=leitura.nextLine();
    if(lista.contains(busca)) {
    	lista.remove(busca);
    	System.out.println("Nome removido");
    }else {
    	System.out.println("Nome não esta na lista");
    }
    System.out.println(lista.toString());
    leitura.close();	
}
}
