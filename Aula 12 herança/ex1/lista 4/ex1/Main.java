package ex1;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
	Pessoa p1= new Pessoa("natan","rua roxa",1000.0);
	System.out.println("Total do imposto a ser pago: "+p1.calculaImposto());
	PessoaFisica pf= new PessoaFisica("Jefe","rua amarela",2000,"124-221-223-99");
	PessoaJuridica pj= new PessoaJuridica("bebidaltd", "rua roxa",10000,"111.111.11");
	ReceitaFederal lista= new ReceitaFederal();
	lista.adicionar(pj);
	lista.adicionar(pf);
	//lista.adicionar(p1);
	lista.listar();
	PessoaFisica pf2= new PessoaFisica("joao","rua amarela",2000,"124-221-223-99");
	lista.adicionar(pf2);
	lista.listar();
  /* 
      lista.remover("bebidaltd");
    lista.listar();
    lista.remover("natan");
    lista.listar();
    lista.remover("Jefe");
    lista.listar();
    */
	System.out.println("Quantidade de PF: "+ lista.qtdPf());
	System.out.println("Quantidade PJ: "+lista.qtdPj());
	
}
}
