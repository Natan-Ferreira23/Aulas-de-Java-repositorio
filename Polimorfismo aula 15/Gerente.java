
public class Gerente extends Funcionario {
    private String setor;
	public Gerente() {
		// TODO Auto-generated constructor stub
	}
	
	public Gerente(String nome, String cpf, double salario,String setor) {
		super(nome,cpf,salario);
		this.setor=setor;
	}
	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double bonificacao() {
		return getSalario()*0.15;
	}
	public String toString() {
		return super.toString()+" \nSetor: "+this.setor;
	}

}
