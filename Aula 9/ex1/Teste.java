package ex1;

public class Teste {
public static void main(String[] args) {
	
	
	Disciplina d= new Disciplina("Desenvolvimento de software",80,"linguagem java");
	Turma t1= new Turma("B","ADS","Noturno",30,d);	
	t1.info();
	System.out.println("Nome da disciplina d"+ d.getNome());
}
}
