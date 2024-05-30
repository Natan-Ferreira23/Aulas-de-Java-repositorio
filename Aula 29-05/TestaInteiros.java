import java.util.ArrayList;
import java.util.Collections;
public class TestaInteiros {

	public static void main(String[] args) {
		ArrayList<Integer> inteiros = new ArrayList<Integer> ();
	  inteiros.add(10);
	  inteiros.add(50);
	  inteiros.add(41);
	  inteiros.add(0);
	  inteiros.add(-1);
	  System.out.println("Antes da ordenação ");
	  System.out.println(inteiros);
	  Collections.sort(inteiros); //utilizando classe Colletions para usar metódos
	  System.out.println("Depois da ordenação");
	  System.out.println(inteiros);
	  System.out.println(41+" esta no indice "+Collections.binarySearch(inteiros, 41));
      System.out.println("Maior elemento: "+ Collections.max(inteiros));
      System.out.println("Menor elemento: "+ Collections.min(inteiros));
      Collections.reverse(inteiros);
      System.out.println("Lista invertida: "+ inteiros);
      inteiros.add(50);
      System.out.println(inteiros);
      System.out.println("Frequência do numero 50:" + Collections.frequency(inteiros,50));
      ArrayList<Integer> inteiros2 = new ArrayList<Integer>();
      inteiros2.add(30);
      inteiros2.add(100);
      inteiros2.add(-4);
      System.out.println(inteiros2);
      System.out.println("Conjuntos iguais? "+ Collections.disjoint(inteiros, inteiros2)); // compara se são iguais
	  
	}

}
