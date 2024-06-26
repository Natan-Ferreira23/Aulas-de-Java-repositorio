package slide11Ex2;

public class Empregado extends Pessoa {
 private int codigoSetor;
 private double salarioBase;
 private double imposto;
 
 public Empregado() {
	 
 }
 
public Empregado(String nome,String endereco,String telefone,int codigoSetor, double salarioBase, int imposto) {
	super(nome,endereco,telefone);
	this.codigoSetor = codigoSetor;
	this.salarioBase = salarioBase;
	this.imposto = imposto;
}

public int getCodigoSetor() {
	return codigoSetor;
}
public void setCodigoSetor(int codigoSetor) {
	this.codigoSetor = codigoSetor;
}
public double getSalarioBase() {
	return salarioBase;
}
public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
}
public double getImposto() {
	return imposto;
}
public void setImposto(int imposto) {
	this.imposto = imposto;
}
public double calculoSalario() {
	return this.salarioBase-(this.salarioBase*(this.imposto/100));
}
public String toString() {
	return super.toString()+"\nCodigo do Setor:"+this.codigoSetor+"\nSalario base R$:"+this.salarioBase+"\nImposto:"+this.imposto+"\nSalario liquido R$:"+calculoSalario();
}
}
