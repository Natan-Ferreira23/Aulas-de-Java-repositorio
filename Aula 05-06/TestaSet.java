import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class TestaSet {

	public static void main(String[] args) {
		Set<String> cargos= new HashSet<String>(); //caracteristica dos conjuntos é não deixar os valores se repetirem, por exemplo dois objetos
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretaria");
		cargos.add("Analista de Ti");
		System.out.println("Cargos: "+cargos);
		//não trabalhamos com indices
		//não há ordem
		for(String cargo:cargos) { 
			System.out.println(cargo);
		}
		Iterator<String> i= cargos.iterator(); //ele transforme o cargo como se fosse um documento e guarda na variavel i
		while(i.hasNext()) { //enquanto houver proxima linha ele continua imprimindo
			System.out.println(i.next());
		}
	}
}
