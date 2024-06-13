package ex2;

import java.util.HashMap;
import java.util.Map;


public class Estoque {
 private  HashMap<Integer,Produto> produtos= new HashMap<Integer,Produto>();
  public Estoque() {
	  produtos= new HashMap<Integer,Produto>();
  }

  public Estoque(HashMap<Integer,Produto> produto) {
	  this.produtos=produto;
  }
  
  public HashMap<Integer, Produto> getProdutos() {
	return produtos;
}

public void setProdutos(HashMap<Integer, Produto> produtos) {
	this.produtos = produtos;
}

public void adicionar(Produto p) { // adicionamos o produto ao indice que vai aumentando conforme a lista cresce
	int chave=produtos.size();
	  produtos.put(chave,p);	  
  }
public void remover(int chave) {
	if(produtos.containsKey(chave)) {
	 System.out.println( produtos.get(chave).getNome()+" removido com sucesso");;
	  produtos.remove(chave);
	}else {
		System.out.println("Não foi encontrado");
	}
	
}
public double calcularValorEstoque() {
	double valor =0;
	for(int key:produtos.keySet()) {
		valor+=produtos.get(key).getQuantidade()*produtos.get(key).getValor();
	}
     return valor;
}
public void receberMercadoria(int chave, int qnt) {
	if(produtos.containsKey(chave)) {
		produtos.get(chave).setQuantidade(produtos.get(chave).getQuantidade()+qnt);
		
		System.out.println("O estoque atual do produto: "+ produtos.get(chave).getNome()+ " é "+ produtos.get(chave).getQuantidade() );
	}else {
		System.out.println(" O produto não foi encontrado no estoquek,");
	}
}
public void retirarMercadoria(int chave, int qnt) {
	if(produtos.containsKey(chave)) {
		if(produtos.get(chave).getQuantidade()>=qnt) {
			produtos.get(chave).setQuantidade(produtos.get(chave).getQuantidade()-qnt);
			System.out.println("O saldo atual do produto "+produtos.get(chave).getNome() +" é: "+ produtos.get(chave).getQuantidade());
		}else {
			System.out.println("O saldo não pode ficar negativo");
		}
	}else {
		System.out.println("O produto não foi encontrado");
	}
}
public double verificarQuantidade(int chave) {
	
	if(produtos.containsKey(chave)) {
		return produtos.get(chave).getQuantidade();
	}
	return -1;
}

public void imprimir() {
	for(int key:produtos.keySet()) {
		System.out.println(produtos.get(key).toString());
	}
}
}
