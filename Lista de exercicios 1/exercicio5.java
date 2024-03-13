import java.util.*;
public class exercicio5 {
public static void main (String args[]) {
	Scanner leitura= new Scanner(System.in);
	
	System.out.println("Qual a velocidade do motorista em Km?: ");
	double velMotorista=leitura.nextDouble();
	System.out.println("Qual a velocidade maxima da pista: ");
	double velMax=leitura.nextDouble();
	double excesso= ((velMotorista-velMax)/velMax)*100; //pegamos a velocidade do motorista e achamos a diferença, em seguida dividimos pelo total e ai sim ganhamos o valor em decimal, logo após só multiplicar por 100% para transformar em %;
	System.out.printf("\n O valor em  porcentagem de excesso de velocidade é:  %.0f%% \n",excesso);
	double multa;
	if(excesso<20 && excesso>0) {
	  	multa=130.16;
	  
	}else if( excesso>=20 && excesso<=50) {
		multa=195.23;
		
	}else {
		multa=880.41;		
	}
	System.out.println("Você recebeu uma multa de R$: "+multa);
}
}
