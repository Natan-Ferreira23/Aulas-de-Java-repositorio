import java.util.*;
public class Exercicio6 {
public static void main(String args[]) {
	Random rnd= new Random();
	int aleatorio=rnd.nextInt(100); // geramos um numero aleatorio de 0 até 100
	System.out.println(aleatorio);
	Scanner leitura= new Scanner(System.in);
	int chute;
	int tentativas=0;
	do {
		System.out.println("Digite um numero entre 1 até 100: ");
		chute=leitura.nextInt();
		tentativas++;
		if(chute==aleatorio) {
			System.out.println("Parabens você acertou o numero !!!");
		}
		else if(chute<aleatorio) {
			System.out.println("Digite um numero maior");
		}
		else {
			System.out.println("Digite um numero menor");
		}
		
	}while(chute!=aleatorio);
	System.out.println("O total de tentativas foi: "+tentativas);
}
}
