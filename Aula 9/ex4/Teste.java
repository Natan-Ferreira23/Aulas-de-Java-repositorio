package ex4;
import java.util.ArrayList;
public class Teste {
public static void main(String[] args) {
	Jogador j1=new Jogador("Alexandre",1,"Pato branco",2,false);
	Jogador j2=new Jogador("Carlos",2,"Gorila",2,false);
	Jogador j3=new Jogador("Fernando",4,"Guido",0,false);
	Jogador j4=new Jogador("Jose",5,"Ze",6,false);
	Jogador j5=new Jogador("Matheus",3,"Mat",1,false);
	ArrayList<Jogador> lista=new ArrayList();
	lista.add(j1);
	lista.add(j2);
	lista.add(j3);
	lista.add(j4);
	lista.add(j5);
    Time t1= new Time("OGN", lista);
    t1.nomeJogadores();
    System.out.println("Total de cartoes "+t1.totCartoesTime());
    System.out.println("Total jogadores suspensos "+ t1.totJogadorSuspenso());
    System.out.println("Total jogadores no time  "+ t1.totalJogadores());
    j5.setSuspenso(true);
    t1.tirarSuspensao(j5);
    t1.supenderJogador(j1);
    System.out.println("Total jogadores suspensos "+ t1.totJogadorSuspenso());
}
}
