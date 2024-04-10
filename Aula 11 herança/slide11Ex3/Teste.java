package slide11Ex3;

public class Teste {
 public static void main(String[] args) {
	Imovel i1=new Imovel("rua marrom", 2000);
	System.out.println(i1.toString());
	System.out.println("-----------");
	//imovel novo
	Novo imovelNovo= new Novo("rua roxa",2000,50);
	System.out.println(imovelNovo.toString());
	System.out.println("-----------");
	//imovel velho
	Velho imovelVelho=new Velho("rua branca",2000,50);
	System.out.println(imovelVelho.toString());
	System.out.println("-----------");
	
}
}
