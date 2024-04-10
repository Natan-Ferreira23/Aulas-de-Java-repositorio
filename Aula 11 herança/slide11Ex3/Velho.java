package slide11Ex3;

public class Velho extends Imovel{
private int desconto;
 public Velho() {
	 
 }
 public Velho(String endereco,double preco,int desconto) {
	 super(endereco,preco);
	 this.desconto=desconto;
 }
public int getDesconto() {
	return desconto;
}
public void setDesconto(int desconto) {
	this.desconto = desconto;
}
 public double novoValorImovel() {
	 return getPreco()-(getPreco()*this.desconto)/100;
 }
 public String toString() {
	 return super.toString()+"\nDesconto %:"+this.desconto+"\nNovo valor do imovel com desconto R$:"+novoValorImovel();
 }
}
