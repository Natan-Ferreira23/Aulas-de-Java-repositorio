package ex1;
import java.util.ArrayList;
public class Teste {
 public static void main(String[] args) {
	Contato pessoa1= new Contato("Natan","43-899992323", "natan@gmail.com");
	Contato pessoa2= new Contato("JOAO","43-323232", "joao@gmail.com");
	Contato pessoa3= new Contato("seila","43-66666", "seila@gmail.com");
	ArrayList<Contato> lista= new ArrayList<Contato> ();
	
	lista.add(pessoa1);
	lista.add(pessoa2);
	lista.add(pessoa3);
	
	Agenda agenda= new Agenda(lista);
	
	System.out.println(agenda.toString());
	
	agenda.alterarContato("Natan", "44-999924","natanferreira@gmail.com");
	System.out.println(agenda.toString());
	agenda.buscarNome("seila");
	agenda.buscarNome("claudia");
	agenda.removerContato(pessoa2);
	System.out.println(agenda.toString());
	Contato pessoa4= new Contato("julia","45-767643", "julia@gmail.com");
	agenda.adicionarContato(pessoa4);
	System.out.println(agenda.toString());
	
	
}
}
