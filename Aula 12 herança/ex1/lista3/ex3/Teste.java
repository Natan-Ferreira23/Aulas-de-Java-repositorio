package ex3;

public class Teste {
public static void main(String[] args) {
	estoque e1= new estoque("coca-cola",8.00,2);
	System.out.println(" Qual é o valor do estoque: R$"+e1.valorEstoque());
	e1.vende(1);
	System.out.println("Valor estoque: R$"+e1.valorEstoque());
	e1.estoca(2);
	System.out.println("Valor estoque: R$"+e1.valorEstoque());
}
}
