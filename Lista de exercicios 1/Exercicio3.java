
public class Exercicio3 {
//Chico tem 1.50 e cresce 2cm por ano
//Ze tem 1.10 e cresce 3cm por ano
// Quantos anos são necessários para que Zé seja maior que chico? 

 public static void main(String args [] ) {
	 double alturaChico=1.5;
	 double alturaZe=1.1;
	 int anos=0;
	 while(alturaZe<alturaChico) {
		 alturaZe+=0.03;
		 alturaChico+=0.02;
		 anos++;
	 }
	 System.out.printf("\n Foram necessários %d anos para Zé ser maior que chico, Ze tem %.2f m de altura após %d anos \n",anos,alturaZe,anos);
 }
}
