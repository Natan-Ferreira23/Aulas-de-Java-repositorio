package slide11Ex3;

public class Novo extends Imovel {
private int adicional;
public Novo() {
	
}
public Novo(String endereco, double preco,int adicional) {
	super(endereco,preco);
	this.adicional=adicional;
}
public int getAdicional() {
	return adicional;
}
public void setAdicional(int adicional) {
	this.adicional = adicional;
}
public double novoValorImovel() {
	return getPreco()+((getPreco()*adicional)/100);
}
public String toString() {
	return super.toString()+"\nAdicional %:"+this.adicional+"\nNovo Valor imovel com acrescimo R$:"+novoValorImovel();
}
}
