package ex1;

public class Teste {
public static void main(String[] args) {
	 Paciente p1= new Paciente("Zezao", "921-129-421-21","432323",false);
	 Paciente p2= new Paciente("Julio","322.121.872-55","232",true);
	 Paciente p3= new Paciente("Orlando","322.122.872-52","121",true);
	 Paciente p4= new Paciente("anderson","322.120.872-52","666",true); 
	 Paciente p5= new Paciente("bernardo","412.111.254-42","534666",false);
	 
	 Consultorio c1=new Consultorio();
	 
	 c1.adicionar(p1);
	// c1.adicionar(p2);
	// c1.adicionar(p3);
	// c1.adicionar(p4);
	 c1.adicionar(p5);
	 
	 c1.imprimir();
	 c1.remover("322.120.872-52");
     System.out.println("_----");
     c1.imprimir();
     c1.modificaStatus(p5);//modifica o status para em tratamento
     c1.imprimir();
}
}
