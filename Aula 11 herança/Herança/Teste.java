package Herança;

public class Teste {
public static void main(String[] args) {
	Aluno a1= new Aluno("natan","232323-53532-22","23-02-2003","ADS",2023);
	Pessoa p1= new Pessoa("Carlos", "44444-34232-23","19-09-1981");
	System.out.println(a1.toString());
	System.out.println("----------------------------------------------------------------------------------------");
	System.out.println(p1.toString());
}
}
