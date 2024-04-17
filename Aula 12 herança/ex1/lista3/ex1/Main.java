package ex1;

public class Main {
	public static void main(String[] args) {
	 int[] vetor= {10,2,11,2,9,22,13,11,4,2,56};
	 Operacoes operacao= new Operacoes();
	 System.out.println("Fatorial: "+ operacao.fatorial(0));
	 System.out.println("Exponencial: "+ operacao.exponencial(2,8));
	 System.out.println("O maior valor do vetor:"+ operacao.maior(vetor));
	}	
}
