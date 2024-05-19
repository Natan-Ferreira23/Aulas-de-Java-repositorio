package ex1;
import java.util.ArrayList;
public class RefeicoesDiarias {
 private double data;
 private ArrayList<Refeicao> refeicoes;
 public RefeicoesDiarias() {
	 this.refeicoes=new ArrayList<Refeicao>();
 }
public RefeicoesDiarias(double data, ArrayList<Refeicao> refeicoes) {	
	this.data = data;
	this.refeicoes = new ArrayList<Refeicao>();
}
public double getData() {
	return data;
}
public void setData(double data) {
	this.data = data;
}
public ArrayList<Refeicao> getRefeicoes() {
	return refeicoes;
}
public void setRefeicoes(ArrayList<Refeicao> refeicoes) {
	this.refeicoes = refeicoes;
}
 public void adicionarRefeicao(Refeicao r) {
	 refeicoes.add(r);
 }
 public void removerRefeicao(String data,String hora,String nome) {
	 
	 for(int i=0;i<refeicoes.size();i++) {
		 if(refeicoes.get(i).getData().equals(data) && refeicoes.get(i).getHora().equals(hora) && refeicoes.get(i).getNome().equalsIgnoreCase(nome)) {
			 refeicoes.remove(i);
			 System.out.println("Refeição "+refeicoes.get(i).getNome()+" removida com sucesso");
		      break;
		 }		 
	 }
	 System.out.println("A refeição não foi encontrada");	 
 }
 public int qtdRefeicoes() {
	 return refeicoes.size();
 }
 public int qntRefeicoes(String nomeCliente) {
	 int tot=0;
	 for(int i=0;i<refeicoes.size();i++) {
		 if(refeicoes.get(i).getNome().equalsIgnoreCase(nomeCliente)) {
			 tot++;
		 }
	 }
	 return tot;
 }
 public double valorTotalVendido() {
	 double valor=0;
	 for(int i=0;i<refeicoes.size();i++) {
		 valor+=refeicoes.get(i).getPreco();
	 }
	 return valor;
 }
 public double valorTotalPratoFeito() {
	 double tot=0;
	 for(int i=0;i<refeicoes.size();i++) {
		 if(refeicoes.get(i) instanceof PratoFeito) {
			tot+=refeicoes.get(i).getPreco();
		 }
	 }
	 return tot;
 }
 public int qntBuffets(String hora) {
	 int tot=0;
	 for(int i=0;i<refeicoes.size();i++) {
		 if(refeicoes.get(i).getHora().equals(hora) && refeicoes.get(i) instanceof Buffet) {
			 tot++;
		 }
	 }
	 return tot;
 }
 public void imprimeRefeicoes() {
	 for(int i=0;i<refeicoes.size();i++) {
		 System.out.println("[Data:"+refeicoes.get(i).getData()+
				 ", Hora:"+refeicoes.get(i).getHora()+
				 ", Preço:"+refeicoes.get(i).getPreco()+
				 ", Nome:"+refeicoes.get(i).getNome());
	 }
	 System.out.println("Valor total vendido: "+valorTotalVendido());
 }
 
}
