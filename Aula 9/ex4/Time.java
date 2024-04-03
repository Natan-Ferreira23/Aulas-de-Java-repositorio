package ex4;
import java.util.ArrayList;
public class Time {
 private String nome;
 private ArrayList<Jogador> listaJogadores;
 public Time() {
	 
 }
 public Time(String nome) {
	 
	 this.nome=nome;
	 this.listaJogadores= new ArrayList();
 }
public Time(String nome, ArrayList<Jogador> listaJogadores) {
	super();
	this.nome = nome;
	this.listaJogadores = listaJogadores;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public ArrayList<Jogador> getListaJogadores() {
	return listaJogadores;
}
public void setListaJogadores(ArrayList<Jogador> listaJogadores) {
	this.listaJogadores = listaJogadores;
}
public void adicionarJogador(Jogador j) {
  if(listaJogadores.size()<=5) {
	  listaJogadores.add(j);
	  System.out.println("jogador "+j.getNome()+" adicionado a lista");
  }
}
public void removerJogador(Jogador j) {
	if(listaJogadores.size()>0) {
		listaJogadores.remove(j);
		System.out.println(j.getNome()+" foi removido da lista de jogadores ");
	}else {
		System.out.println("A lista já esta vazia !");
	}
}
public void supenderJogador(Jogador j) {
  if(listaJogadores.contains(j)) {
	    if(j.getSuspenso()==true) {
	    	System.out.println("Jogador já estava suspenso");
	    }else {
	    	j.setSuspenso(true);
	        System.out.println(j.getNome() +" foi suspenso ");
	    
	    }
  }	    
  else {
	        System.out.println(j.getNome()+" não pertence ao time");
  }
  

}
public void tirarSuspensao(Jogador j) {
	if(listaJogadores.contains(j)) {
		if(j.getSuspenso()==true) {
			j.setSuspenso(false);
		}
	}else {
		System.out.println(j.getNome()+" Não esta no time ");
	}
}
public int totJogadorSuspenso() {
	int tot=0;
	for(int i=0;i<listaJogadores.size();i++) {
		if(listaJogadores.get(i).getSuspenso()==true) {
			tot++;
		}
	}
	return tot;
}
public int totCartoesTime() {
	int tot=0;
	for(int i=0;i<listaJogadores.size();i++) {
		tot+=listaJogadores.get(i).getCartoes();
	}
	
	return tot;
}
public int totalJogadores() {
	return listaJogadores.size();
}
public void nomeJogadores() {
if(listaJogadores.size()>0) {
	for(int i=0;i<listaJogadores.size();i++) {
		System.out.println("nome: "+listaJogadores.get(i).getNome());
	}
}
} 
}
