package trabalho;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
	    Supermercado mercado= new Supermercado();
		System.out.println("-------------------------");
		System.out.println("1-Adicionar Produtos     ;");
		System.out.println("2-Remover Produtos       ;");
		System.out.println("3-Imprimir Produtos      ;");
		System.out.println("4-Adicionar ao estoque   ;");
		System.out.println("5-Valor total do estoque ;");
		System.out.println("6-Vender Produtos ao cliente ;");
		System.out.println("7-Valor total das vendas ;");
		System.out.println(" -1 para sair :D         ;");
		System.out.println("---------Fim-------------");
		int resp=0;
		Scanner txt= new Scanner(System.in);
		while(resp!=-1) {
			System.out.println("Digite um numero para o Menu: ");
			resp= txt.nextInt();
			
		  if(resp==1) {
			  Produtos p6= new Produtos(); 
			  System.out.println("Qual produto voce deseja adicionar? ");
			  System.out.println("Digite o nome: ");
			  String n=txt.next();
			  p6.setNome(n);
			  System.out.println("Digite o preço do produto: ");
			  double vlr= txt.nextDouble();
			  p6.setValorUnit(vlr);
			  System.out.println("Digite a quantidade do produto ");
			  int qnt=txt.nextInt();
			  p6.setQuantidade(qnt);
			  mercado.adicionarProduto(p6);
		  }else if(resp==2) {
			  System.out.println("Digite o valor da chave a ser buscada: ");
			  resp=txt.nextInt();
			  mercado.removerProduto(resp);
		  }else if(resp==3){
			  System.out.println("--Imprimindo estoque");
			  mercado.imprimir();
		  }else if(resp==4){
			  System.out.println("Adicionando ao estoque: ");
			  System.out.println("Digite a chave do produto: ");
			  int chave=txt.nextInt();
			  System.out.println("Digite quantidade a ser adicionado:");
			  int qnt=txt.nextInt();
			  mercado.adicionarProdutosEstoque(chave, qnt);
		  }else if(resp==5){
			  System.out.println("Valor total do estoque R$: "+mercado.valorTotalEstoque());
		  }else if(resp==6){
			  System.out.println("--Vender Produtos ao cliente");
			  System.out.println("Digite o cpf do cliente: ");			  
			  mercado.venderProdutos(txt.nextLine());
		  }else if(resp==7){
			  System.out.println("Valor total das vendas");
			  mercado.valorTotalVendas();
		  }else if(resp==-1) {
			  System.out.println("Programa foi encerrado");
		  }else {
			  System.out.println("Opção invalida");
		  }
		}
		
	}
}
