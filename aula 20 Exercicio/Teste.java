package ex1;

public class Teste {
 public static void main(String[] args) {
	PratoFeito pratoFeito1=new PratoFeito("12-02-2024","12:00","Prato do dia",23.0,5.0);
	RefeicoesDiarias lista= new RefeicoesDiarias();
	lista.adicionarRefeicao(pratoFeito1);
	lista.imprimeRefeicoes();
}
}
