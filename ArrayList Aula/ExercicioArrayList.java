import java.util.*;
public class ExercicioArrayList {
public static void main(String[] args) {
	ArrayList<Integer> numeros= new ArrayList<Integer>();
	Scanner leitura= new Scanner(System.in);
	int num;
	do {
		System.out.println("Digite um numero: ");
		num=leitura.nextInt();
		if(num!=-1) {
			if(numeros.contains(num)) {
				System.out.println("Numero já está contido no Array List, não foi possivel adicionar ");
			}else {
				numeros.add(num);
				numeros.sort(null);
			}
		}else {
			System.out.println("Programa foi encerrado !");
		}
	}while(num!=-1);
	System.out.println(numeros.toString());
}
}
