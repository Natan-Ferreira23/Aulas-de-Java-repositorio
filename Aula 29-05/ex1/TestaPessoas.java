package ex1;

import java.util.ArrayList;
import java.util.Collections;

public class TestaPessoas {

	public static void main(String[] args) {
		Pessoa p1= new Pessoa("Maria das Neves","982.124.987-09","23/02/1998");
		Pessoa p2= new Pessoa("Adriano Silva", "254.654.321-76", "09/10/2000");
		Pessoa p3= new Pessoa("Eliane morares", "762.092.666-12","12/01/1984");
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		System.out.println("Antes da ordenação");
		System.out.println(pessoas);
		Collections.sort(pessoas); //ordenação em ordem alfabética
		System.out.println("Depois da ordenação");
		System.out.println(pessoas);
	}
}
