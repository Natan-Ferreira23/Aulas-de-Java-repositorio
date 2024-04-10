package slide11Ex2;

public class Teste {
 public static void main(String[] args) {
	 // preenchendo objeto pessoas
	 Pessoa p1=new Pessoa("natan","ali abdul", "44-2832-9823");
	 System.out.println(p1.toString());
	 p1.setEndereco("jd. fiqueiras, rua casa verde, casa 202");
	 p1.setNome("Jose alves");
	 p1.setTelefone("43-9876-9923");
	 System.out.println(p1.toString());
	 //fim objeto pessoas
	 System.out.println("-- fim objeto pessoa --");
	 //preenchendo objeto filho Fornecedor;
	 Fornecedor f1= new Fornecedor("João fernando","jd.azul, rua roxa","(44)-9765-4921", 1500.0,1900.0);
	 System.out.println(f1.toString());
	 System.out.println("A diferença entre credito e divida é R$:"+f1.obterSaldo());
	 System.out.println("-- fim objeto fornecedor --");
	 //fim objeto fornecedor;
	 
	 //preenchendo objeto filho Empregado;
	 Empregado e1=new Empregado("Carlos","jd.ouro branco, rua marrom, casa 577","(43)-9876-8723",23, 10000.00,50);
	 System.out.println(e1.toString());
	 System.out.println("--Fim do objeto Empregado --");
}
 
}
