package ex2;

public class Teste {
public static void main(String[] args) {
	Aluno a1=new Aluno("ADS","Natan",5,5,5);
	System.out.println("Media ponderada:"+ a1.mediaPonderada());
	if(a1.verificSistuacao()==1) {
		System.out.println("Aluno aprovado");
	}else if(a1.verificSistuacao()==2){
		System.out.println("Em recuperação");
	}else {
		System.out.println("Aluno reprovado");
	}
}
}
