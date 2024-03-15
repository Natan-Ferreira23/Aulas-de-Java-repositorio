import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio3 {
public static void main(String[] args) {
	ArrayList <String> fila= new ArrayList<String>();
	Scanner leitura=new Scanner(System.in);
 int escolha;
 int indice;
 String nome;
 
 do {
		System.out.printf("\n ----- Menu -----\n"
				+ "1-Adicionar um paciente: essa opção deve adicionar o nome da pessoa no final da fila \n"
				+ "2-Atender um paciente: o paciente a ser atendido é o que está na primeira posição da fila\n"
				+ "3-Desistência: remove um paciente da fila, independente da sua posição"
				+ "4-Verificar posição de um paciente\n"
				+ "5-Verificar o tamanho da fila.\n"
				+ "6-Imprimir fila\n "
				+ "7-Sair \n");
		System.out.println("Digite uma opção: ");
		escolha= leitura.nextInt();
		if(escolha<1 || escolha>7) {
			System.out.println("Escolha uma opção valida !!");
		}else {
			if(escolha==1) { // adicionar paciente na fila
				System.out.println("Digite o nome: ");
				nome=leitura.next();
				fila.add(nome);
				System.out.println(nome +" foi adicionado a fila para ser atendido(a)");
			}else if(escolha==2) {//atendendo o primeiro da fila
				if(fila.size()>0) {
					System.out.println("O paciente "+ fila.get(0)+ " foi atendido ");
					fila.remove(0);
				}{
					System.out.println("A fila está vazia");
				}
				
			}// fim
			else if(escolha==3) { //desistencia
				System.out.println(" Digite o nome do paciente desistente: ");
				nome=leitura.next();
				if(fila.contains(nome)){
					fila.remove(nome);
				}else {
					System.out.println("Paciente nao encontrado");
				}
			}//fim
			else if(escolha==4) { //verificar posição do paciente
				System.out.println("Digite o nome do paciente para sabermos a posição ");
				nome=leitura.next();
				if(fila.contains(nome)) {
					System.out.println("A posição é ["+fila.indexOf(nome));
				}else {
					System.out.println("Paciente nao encontrado");
				}
			}else if(escolha==5) {
				System.out.println(" O tamanho da fila é "+ fila.size());
			}else if(escolha==6) {
				System.out.println("--- Imprimindo a fila ---");
				for(int i=0;i<fila.size();i++) {
					System.out.println("posição["+i+"], nome: "+fila.get(i));
				}
			}else {
				System.out.println("--- Saindo do menu---");
			}
		}
	}while(escolha!=7);
}
}
