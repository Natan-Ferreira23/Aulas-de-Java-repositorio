package ex1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Consultorio {
 ArrayList<Paciente> lista;

public Consultorio() {

	this.lista = new ArrayList<Paciente>();
}
public Consultorio(ArrayList<Paciente> lista) {
	this.lista= lista;
}
public ArrayList<Paciente> getLista() {
	return lista;
}

public void setLista(ArrayList<Paciente> lista) {
	this.lista = lista;
}
public void adicionar(Paciente p) {
 if(Collections.binarySearch(lista, p)>=0) {
	 System.out.println("A pessoa já esta na lista");
 }else {
     lista.add(p);
     System.out.println(p.getNome() + " foi adicionado a lista");
     Collections.sort(lista);
 }
}
 public void imprimir() {
	System.out.println(lista);
 }
 public void remover(String cpf) {
	 for(Paciente paciente:lista) {
		 if(paciente.getCpf().equalsIgnoreCase(cpf)) {
			 System.out.println(paciente.getNome()+" removido com sucesso");
			 lista.remove(paciente);
			 return;
		 }		 
	 }
	 System.out.println("Não foi encontrado na lista");
 }
 public void modificaStatus(Paciente p) {
	 
		 if(Collections.binarySearch(lista, p)>=0) {
			 p.setEmTratamento(true);
			 System.out.println(p.getNome()+" esta com status em tratamento agora");
			 return;
		 }	 
	 System.out.println(p.getNome()+" não foi encontrado na lista");
 }
 
}
