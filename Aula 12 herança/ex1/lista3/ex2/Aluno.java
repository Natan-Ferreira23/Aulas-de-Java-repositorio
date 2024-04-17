package ex2;

public class Aluno {
	private String matricula;
	private String nome;
	private double notaProva1;
	private double notaProva2;
	private double trabalho;
	public Aluno() {
		
	}
	public Aluno(String matricula,String nome, double notaProva1,double notaProva2,double trabalho) {
		this.matricula=matricula;
		this.nome=nome;
		this.notaProva1=notaProva1;
		this.notaProva2=notaProva2;
		this.trabalho=trabalho;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaProva1() {
		return notaProva1;
	}
	public void setNotaProva1(double notaProva1) {
		this.notaProva1 = notaProva1;
	}
	public double getNotaProva2() {
		return notaProva2;
	}
	public void setNotaProva2(double notaProva2) {
		this.notaProva2 = notaProva2;
	}
	public double getTrabalho() {
		return trabalho;
	}
	public void setTrabalho(double trabalho) {
		this.trabalho = trabalho;
	}
	public double mediaPonderada() {
		double r=(notaProva1*2.5+notaProva2*2.5+trabalho*2)/(2.5+2.5+2);
		return r;
	}
    public int verificSistuacao (){
		if(mediaPonderada()>=6) {
			return 1;
		}else if(mediaPonderada()>=4 && mediaPonderada()<6) {
			return 2;
		}else {
			return 3;
		}
	}
	
}
