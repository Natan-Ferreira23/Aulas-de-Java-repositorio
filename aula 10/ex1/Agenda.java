package ex1;
import java.util.ArrayList;
public class Agenda {
private ArrayList<Contato> listaContatos;
public Agenda(){
	
}
public Agenda(ArrayList<Contato> listaContatos) {
	
	this.listaContatos = listaContatos;
}

public ArrayList<Contato> getListaContatos() {
	return listaContatos;
}

public void setListaContatos(ArrayList<Contato> listaContatos) {
	this.listaContatos = listaContatos;
}
public void adicionarContato(Contato p) {
	if(listaContatos.contains(p)) {
		System.out.println("O contato já existe no celular");
	}else {
		listaContatos.add(p);
		System.out.println(p.getNome()+" foi adicionado na agenda de contatos");
	}
}
public void removerContato(Contato p) {
	if(listaContatos.contains(p)) {
		 listaContatos.remove(p);
		 System.out.println(p.getNome()+" foi removido da agenda de contatos");
	}else {
		System.out.println("O contato não existe na Agenda");
	}
}
public void buscarNome(String nome) {
	for(int i=0;i<listaContatos.size();i++) {
		if(listaContatos.get(i).getNome().contains(nome)) {
			System.out.println(nome+" foi encontrado na  agenda");
			return;
		}		
	}
	System.out.println(nome+" não foi encontrado na lista");
}
public void alterarContato(String nome,String email, String telefone) {
	for(int i=0;i<listaContatos.size();i++) {
		if(listaContatos.get(i).getNome().toUpperCase()==nome.toUpperCase()) {
			listaContatos.get(i).setEmail(email);
			listaContatos.get(i).setTelefone(telefone);
		}
	}	
}
@Override
public String toString() {
	return "Agenda [listaContatos=" + listaContatos + "]";
}
 
}
