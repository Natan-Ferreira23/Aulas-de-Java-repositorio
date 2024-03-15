import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class Exercicio2 {
public static void main(String[] args) {
	ArrayList <Integer> lista= new ArrayList <Integer>() ;
	Scanner leitura =new Scanner(System.in);
int escolha;
int num,indice;
int tamanho;
double media;
do {	
	System.out.printf("\n-- Inicio do menu ----\n"
			+ "1- Adicionar um numero (recebe um numero do usuario)\n"
			+ "2-Remover um numero(recebe um numero do usario)\n"
			+ "3-Verifica a posição de um determinado usuario\n"
			+ "4-Modificar um número de uma determinada posição. Ou seja, o usuário deve informar a posição do número e o novo número a ser colocado na posição\n"
			+ "5-Média dos valores.\n"
			+ "6-Imprimir números (de acordo com a posição).\n"
			+ "7-Fim\n"
			+ "----------- FIM do menu -----------\n");
	System.out.println("Digite a opção escolhida: ");
	escolha=leitura.nextInt();
	if(escolha<1 || escolha>7) {
		System.out.println("Digite uma opção valida !!!");
	}else {
		if(escolha==1) {//adicionando numero a lista
			System.out.println("Digite um numero para ser adicionado a lista: ");
			num=leitura.nextInt();
			lista.add(num);
			System.out.println("O numero"+num+" foi adicionado a lista");
			System.out.println(lista.toString());
		}//fim da adição
		else if(escolha==2) { // removendo um numero da lista
			System.out.println("Digite um numero a ser removido: ");
			num=leitura.nextInt();
			if(lista.contains(num)) { // vericamos se o numero digitado está na lista
				indice=lista.indexOf(num); //pegamos o indice dele
			    lista.remove(indice); // removemos usando  o seu indice
				System.out.println("O numero "+num+" foi removido com sucesso da lista ");
				System.out.println(lista.toString());
			}else {
				System.out.println("Numero não existe na lista !");
			}
		}// fim do removendo
		else if(escolha==3) { // verificar a posição de um numero
			System.out.println("Digite um numero para verificar sua posição: ");
			num=leitura.nextInt();
			if(lista.contains(num)) {
				indice=lista.indexOf(num);
				System.out.println("A posição do numero "+num+" é "+indice);
			}else {
				System.out.println("O numero digitado não existe na lista ");
			}
		}//fim da verificação de posição
		else if(escolha==4) { // adicionando um numero ou atualizando em um certo indice
			System.out.println("Digite uma posição escolhida");
			indice=leitura.nextInt();
			tamanho=lista.size();
			if(tamanho>indice) {				
		    System.out.println("Digite o novo numero a ser colocado na posição "+indice);
		    num=leitura.nextInt();
		    lista.remove(indice);
		    lista.add(indice,num);
		    System.out.println(lista.toString());
		    
			}else {
				System.out.println("Indice não existe na lista ainda ");
			}
		}//fimm
		else if(5==escolha) { // calculo da média dos valores no array
			System.out.println("--- A média dos valores será calculada ---");
			tamanho=lista.size();
			int soma=0;
			for(int i=0;i<tamanho;i++) {
				soma+=lista.get(i);
			}
			media=soma/tamanho;			
			System.out.println("A média dos numeros na lista é: "+media);
			System.out.println(" --- Fim do calculo de média---");
		}// fim do calculo
		else if(escolha==6) { // Imprimir os numeros de acordo com a posição
			tamanho=lista.size();
			for(int i=0;i<tamanho;i++) {
				System.out.println("indice["+i+"] valor: "+lista.get(i));
			}
		}//fim
		else { // encerrando o programa
			System.out.println("---- O programa foi encerrado ----");
		}
	}
	}while(escolha!=7);

}
}
