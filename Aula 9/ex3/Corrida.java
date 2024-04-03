package ex3;
import java.util.*;
public class Corrida {
private String data;
private String horas;
private ArrayList<Pessoa> participantes;
public Corrida() {
	
}

public Corrida(String data, String horas) {
    super();
    this.data = data;
    this.horas = horas;
    this.participantes = new ArrayList<>();
}

public Corrida(String data, String horas,ArrayList<Pessoa> pessoas) {
	super();
	this.data = data;
	this.horas = horas;
	if(pessoas.size()<=10) {
		this.participantes=pessoas;
	}else {
		System.out.println("O total de participantes não deve ser maior que 10");
	}
	
}

public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getHoras() {
	return horas;
}
public void setHoras(String horas) {
	this.horas = horas;
}
public ArrayList<Pessoa> getParticipantes() {
	return participantes;
}
public void setParticipantes(ArrayList<Pessoa> participantes) {

		this.participantes = participantes;
 
}
public void adicionarParticipante(Pessoa p) {
	if(participantes.size()<10) {
		participantes.add(p);
		System.out.println("Adicionado com sucesso");
	}
}
public void removerParticipante(Pessoa p) {
	if(participantes.size()>0) {
		participantes.remove(p);
		System.out.println(" removido com sucesso");
	}else {
		System.out.println("A lista está vazia !");
	}
}
public int totalParticipantes() {
  return	participantes.size();
}
public void verificaIdade(int idade) {
	int total=0;
	if(participantes.size()>0) {
		for(int i=0;i<participantes.size();i++) {
			if(participantes.get(i).getIdade()>idade) {
				 total++;
			}
		}
		System.out.println("A quantidade de pessoas com mais de "+idade+" anos é "+total);
	}else {
		System.out.println("A lista está vazia");
	}
}
public void verificaIMC() {
	double imc;
	int tot=0;
	if(participantes.size()>0) {
		for(int i=0;i<participantes.size();i++) {
			imc=participantes.get(i).getPeso()/Math.pow(participantes.get(i).getAltura(),2);
			if(imc>18.5 && imc<25) {
				tot++;				
			}
			
		}
		System.out.println("O total de pessoas com o imc normal: "+tot);
	}else {
		System.out.println("A lista está vazia");
	}
}

}
