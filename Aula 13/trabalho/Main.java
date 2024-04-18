package exercicio;
import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
	Paciente p1=new Paciente("natan","123-2323-223-32",true,23);
	Paciente p2=new Paciente("Ze","552-123-333-22",false,26);
	Paciente p3=new Paciente("Jorge Carlos","232-113-553-82",false,26);
	Paciente p4=new Paciente("Eduardo","232-115-552-99",true,29);	
	
	AtendimentosDiarios lista=new AtendimentosDiarios();
	
	
	lista.adicionarPaciente(p1);
	lista.adicionarPaciente(p2);
	lista.adicionarPaciente(p3);
	lista.adicionarPaciente(p4);
	
	
	
	//mostrando
	lista.listar();
	lista.removerPaciente("Jorge");
	lista.listar();
	System.out.println("Quantidade de pacientes antigos:"+lista.quantidadeAntigos());//quantidade pacientes antigos
	lista.pacientesPrimeiraVez();//lista os pacientes que foram pela primeira vez
	/* criando com array parametro */
	Paciente a1=new Paciente("a","123-2323-223-32",true,23);
	Paciente b2=new Paciente("b","552-123-333-22",false,26);
	Paciente c3=new Paciente("c Carlos","232-113-553-82",false,26);
	Paciente d4=new Paciente("d","232-115-552-99",true,29);	
	ArrayList<Paciente> pacientes2=new ArrayList<Paciente>();
	pacientes2.add(a1);
	pacientes2.add(b2);
	pacientes2.add(c3);
	pacientes2.add(d4);
	
	AtendimentosDiarios lista2=new AtendimentosDiarios("23-04-2024",pacientes2);
	lista2.listar();
}
}
