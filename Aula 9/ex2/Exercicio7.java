package ex2;
import java.util.ArrayList;
public class Exercicio7 {
private ArrayList<Integer> numeros;


public Exercicio7() {	
	this.numeros =new ArrayList<Integer>();
}
public void adicionar(int num) {
	if(!numeros.contains(num)) {
		numeros.add(num);
	}else {
		System.out.println("O numero:"+num+" já está presente na lista, tente outro");
	}
}
public void remove(int num) {
	if(numeros.contains(num)) {
		Integer n=num;
		numeros.remove(n);
	    System.out.println("Numero removido com sucesso");
}else {
	System.out.println("O numero nao esta no conjunto");
}
}
public int busca(int num) {
	return numeros.indexOf(num);
}
public int tamanho() {
	return numeros.size();
}
public void imprimiLista() {
	System.out.println(numeros.toString());
}
}
