import java.util.*;
public class Exercicio4 {
/* 
 Um determinado material radioativo perde metade de sua massa a cada 50segundos.
  Dada a massa inicial em gramas informada pelo usuário, fazer umprograma que calcula o tempo necessário para que essa massa se torne
   menor que 0,5 grama. O programa deve escrever a massa inicial, a massa final e o tempocal culado em horas, minutos e segundos.
 */
	public static void main(String args[]) {
		Scanner leitura=new Scanner(System.in);
		System.out.println("Digite a massa inicial do material: ");
		double massaInicial=leitura.nextDouble();
		double massa=massaInicial;
		int tempo=0;
		while(massa>0.5) {
			massa=massa/2;
			tempo+=50;
		}		
		
		int minutos=(int) ((tempo%3600)/60);
		int segundos=(int) tempo%60;
		int horas= (int) (tempo/3600);
		System.out.printf("\n Horas: %d, Minutos: %d, Segundos %d \n",horas,minutos,segundos);
	}
}
