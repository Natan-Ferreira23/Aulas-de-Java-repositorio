package trabalho;
import java.util.*;
public class Supermercado {
	private double valorVenda=0;
	private int id=1;
	private HashMap<Integer,Produtos> estoque= new HashMap<Integer,Produtos>();
	
	
	public void adicionarProduto(Produtos produtos) {
		
		
		
		for(int key:estoque.keySet()) {
			if(estoque.get(key).getNome().equalsIgnoreCase(produtos.getNome())) {
				System.out.println("Não é possivel adicionar dois produtos com o mesmo nome !");
				return;
			}
		}
		estoque.put(id,produtos);
		System.out.println(this.id+":"+produtos.getNome()+" foi adicionado com sucesso !");
		id++;
	}
	public void removerProduto(int chave) {
	   if(estoque.containsKey(chave)) {
		   System.out.println(" produto "+ estoque.get(chave).getNome() +" com chave "+chave+" foi removido com sucesso");
		  estoque.remove(chave);
		  
	   }else {
		   System.out.println("produto nao encontrado");
	   }
	}
	public void imprimir() {
		int i=1;
		for(int key: estoque.keySet()) {
			System.out.println(i+":"+estoque.get(key).toString());
			i++;
		}
	}
    public void adicionarProdutosEstoque(int chave,int quantidade) {
    	
    		if(estoque.containsKey(chave)){
    		  estoque.get(chave).setQuantidade(estoque.get(chave).getQuantidade()+quantidade);
    		  System.out.println("Você adicionou "+quantidade+" ao estoque, seu novo saldo é: "+estoque.get(chave).getQuantidade());
    		}else {
    			System.out.println(estoque.get(chave).getNome()+" não se encontra na lista");
    		}
    	}
    public double valorTotalEstoque() {
    	double tot=0;
    	for(int key : estoque.keySet()) {
    		tot+=estoque.get(key).getQuantidade()*estoque.get(key).getValorUnit();
    	}
    	return tot;
    }
    public double venderProdutos(String cpf) {
    	int resp=-1;
    	double valorCliente=0;
    	Scanner txt= new Scanner(System.in);
    	while(resp!=0) { 
    	    System.out.println("Qual produto quer comprar ");
    	    resp=txt.nextInt();
    	    if(estoque.containsKey(resp)) {
    	    	valorCliente+=estoque.get(resp).getValorUnit();
    	    }
    	    if(resp==0) {
    	    	System.out.println(" fim do programa ");
    	    }
    	}
    	System.out.println("O valor gasto pelo cliente com cpf o "+cpf+" foi R$"+valorCliente);
    	this.valorVenda+=valorCliente;
    	return valorCliente;
    }
    public double valorTotalVendas() {
    	return this.valorVenda;
    }
}
