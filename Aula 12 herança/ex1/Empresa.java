package ex1;
import java.util.ArrayList;
public class Empresa {
private String nome;
private String cnpj;
private ArrayList<Empregado> listaEmpregados;

public Empresa() {
	listaEmpregados=new ArrayList<Empregado>();
}

public Empresa(String nome, String cnpj, ArrayList<Empregado> listaEmpregados) {
	
	this.nome=nome;
	this.cnpj=cnpj;
	this.listaEmpregados=listaEmpregados;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

public ArrayList<Empregado> getListaEmpregados() {
	return listaEmpregados;
}

public void setListaEmpregados(ArrayList<Empregado> listaEmpregados) {
	this.listaEmpregados = listaEmpregados;
}

public void adicionarEmpregado(Empregado empregado) {
	listaEmpregados.add(empregado);
	System.out.println(empregado.getNome()+" foi adicionado a lista de empregados");
}
public int totalEmpregados() {
	return listaEmpregados.size();
}
public int qntdEmpregadosHorista() {
	int tot=0;
	 for(int i=0;i<listaEmpregados.size();i++) {
		 if(listaEmpregados.get(i) instanceof Horista) {
			 tot++;
		 }
	 }
	 return tot;
}

}
