package ex3;
import java.util.*;
public class Teste {
public static void main(String[] args) {
	Pessoa p1= new Pessoa("Natan",21,65,1.7);
	Pessoa p2= new Pessoa("Joao",19,70,1.8);
	Pessoa p3= new Pessoa("Maria",25,65,1.5);
	Pessoa p4= new Pessoa("Ze", 30,75,1.76);
	Pessoa p5=new Pessoa("Fernando color", 45,85,1.82);
	Pessoa p6=new Pessoa("Carlos",26,69,1.76);
	Pessoa p7=new Pessoa("Juan", 24,76,1.73);
	Pessoa p8= new Pessoa("Cleber",21,78,1.91);
	Pessoa p9=new Pessoa("Julia",20,96,1.95);
	Pessoa p10=new Pessoa("Clara",21,63,1.75);
	//Pessoa p11=new Pessoa("Camila",20,61,1.69);
 
	

   /* ArrayList<Pessoa> listaParticipantes = new ArrayList<>();
    listaParticipantes.add(p1);
    listaParticipantes.add(p2);
    listaParticipantes.add(p3);
    listaParticipantes.add(p4);
    listaParticipantes.add(p5);
    listaParticipantes.add(p6);
    listaParticipantes.add(p7);
    listaParticipantes.add(p8);
    listaParticipantes.add(p9);
    listaParticipantes.add(p10);
    
    
    Corrida c1= new Corrida("23-06-2024","7:50", listaParticipantes);
    System.out.println("Total participantes: "+ c1.totalParticipantes());
     */
	Corrida c2=new Corrida("16-01-2024","8:25");
	c2.adicionarParticipante(p1);
	c2.adicionarParticipante(p2);
	c2.adicionarParticipante(p3);
	c2.adicionarParticipante(p4);
	c2.adicionarParticipante(p5);
	c2.adicionarParticipante(p6);
	c2.adicionarParticipante(p7);
	c2.adicionarParticipante(p8);
	c2.adicionarParticipante(p9);
	c2.adicionarParticipante(p10);	
	System.out.println("Total de participantes da corrida 2 é: "+c2.totalParticipantes());
	c2.verificaIdade(44);
	c2.verificaIMC();
	c2.removerParticipante(p9);
	System.out.println("Total de participantes da corrida 2 é: "+c2.totalParticipantes());
	
     
	
	
}
}
