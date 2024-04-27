
public class Main {

	public static void main(String[] args) {
		Funcionario f1= new Funcionario(" Maria das Neves","023-888-2323-23", 2000);
		Gerente g1=new Gerente("Joao silva","232-990-214-87",2000,"TI");
		System.out.println("Bonificacao funcionario:"+f1.bonificacao());
		System.out.println("Bonificacao gerente:"+g1.bonificacao());
		
		Funcionario g2= new Gerente("Carla","233-984-897-23",2001,"Ti");
		
		ControleGastos totalGastos= new ControleGastos();
		System.out.println(totalGastos.getTotalGastos());
		totalGastos.adicionar(f1);
		totalGastos.adicionar(g1);
		System.out.println(totalGastos.getTotalGastos());
	}

}
