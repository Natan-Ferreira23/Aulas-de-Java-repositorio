package exercicio;
import java.util.ArrayList;
public class AtendimentosDiarios {
 public String data;
 public ArrayList<Paciente> listaAtendimentos;
public AtendimentosDiarios() {
	listaAtendimentos=new ArrayList<Paciente>();
}
 
public AtendimentosDiarios(String data, ArrayList<Paciente> listaAtendimentos) {
	
	this.data = data;
	this.listaAtendimentos = listaAtendimentos;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public ArrayList<Paciente> getListaAtendimentos() {
	return listaAtendimentos;
}
public void setListaAtendimentos(ArrayList<Paciente> listaAtendimentos) {
	this.listaAtendimentos = listaAtendimentos;
}
public void adicionarPaciente(Paciente paciente) {
  listaAtendimentos.add(paciente);
}
public void removerPaciente(String nomeCompleto) {
	for(int i=0;i<listaAtendimentos.size();i++) {
		if(listaAtendimentos.get(i).getNome().contains(nomeCompleto)) {
			listaAtendimentos.remove(i);
			System.out.println(nomeCompleto+" foi removido com sucesso");
			break;
		}
	}
	System.out.println("Paciente não encontrado na lista");
}
public void listar() {
	System.out.println("---Começo da lista ---");
	for(int i=0;i<listaAtendimentos.size();i++) {		
		System.out.println("[nome:"+listaAtendimentos.get(i).getNome()+"| Idade:"+listaAtendimentos.get(i).getIdade()+"]");
		
	}
	System.out.println("---fim da lista ---");
}
public void pacientesPrimeiraVez() {
	System.out.println("---Pacientes pela primeira vez ---");
	for(int i=0;i<listaAtendimentos.size();i++) {
		if(listaAtendimentos.get(i).getPrimeiraConsulta()==true) {
			System.out.println(listaAtendimentos.get(i).toString());
		}
	}
	System.out.println("---Fim da lista ---");
}
public int quantidadeAntigos() {
	int tot=0;
	for(int i=0;i<listaAtendimentos.size();i++) {
		if(listaAtendimentos.get(i).getPrimeiraConsulta()==false) {
			tot++;
		}
	}
	return tot;
}
 
}
