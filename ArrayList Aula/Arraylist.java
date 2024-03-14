import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
 public static void main(String[] args) {
	ArrayList<Integer> numeros= new ArrayList<Integer>();
	numeros.add(3);
	numeros.add(1);
	numeros.add(10);
	System.out.println(numeros.toString());
	System.out.println("tamanho: "+numeros.size());
	
	for(int i=0;i<numeros.size();i++) {
		System.out.println("["+i+"] valor: "+numeros.get(i));
	}
	numeros.remove(2); //removendo o elemento do indice 2
	System.out.println(numeros.toString());
	
	Integer num=5; // removendo o objeto 5;
	numeros.add(num);
	System.out.println(numeros.toString());
	numeros.remove(num);
	System.out.println(numeros.toString());
	
	numeros.add(20);
	numeros.add(11);
	numeros.add(6);
	numeros.add(2);
	System.out.println(numeros.toString());
	System.out.println("Array list ordenado ");
	numeros.sort(null);
	System.out.println(numeros.toString());
	
	System.out.println("Existe o numero 20?: "+numeros.contains(20)); // retorna boolean;
}
}
