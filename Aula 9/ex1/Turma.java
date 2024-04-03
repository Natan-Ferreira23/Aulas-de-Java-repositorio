package ex1;

public class Turma {
private String nome;
private String turno;
private String nomeCurso;
private int qntAlunos;
private Disciplina disciplina;
public Turma() {
	
}

public Turma(String nome, String turno, String nomeCurso, int qntAlunos, Disciplina disciplina) {
	
	this.nome = nome;
	this.turno = turno;
	this.nomeCurso = nomeCurso;
	this.qntAlunos = qntAlunos;
	this.disciplina = disciplina;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getTurno() {
	return turno;
}
public void setTurno(String turno) {
	this.turno = turno;
}
public String getNomeCurso() {
	return nomeCurso;
}
public void setNomeCurso(String nomeCurso) {
	this.nomeCurso = nomeCurso;
}
public int getQntAlunos() {
	return qntAlunos;
}
public void setQntAlunos(int qntAlunos) {
	this.qntAlunos = qntAlunos;
}
public Disciplina getDisciplina() {
	return disciplina;
}
public void setDisciplina(Disciplina disciplina) {
	this.disciplina = disciplina;
}


public void info() {
	 System.out.println("Turma [nome=" + nome + ", turno=" + turno + ", nomeCurso=" + nomeCurso + ", qntAlunos=" + qntAlunos
			+ ", disciplina=" +disciplina+ "]");
	 
}

}
