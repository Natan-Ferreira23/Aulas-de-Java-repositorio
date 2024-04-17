package ex1;

public class PessoaFisica extends Pessoa {
    private String cpf;
	public PessoaFisica() {
		
	}
	public PessoaFisica(String nome, String endereco, double rendaBruta, String cpf) {
		super(nome, endereco, rendaBruta);
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double calculaImposto() {
		double resp=0;
		if(getRendaBruta()<=1400 && getRendaBruta()>0) {
		   resp=0;
		}else if(getRendaBruta()>1400 && getRendaBruta()<=2100) {
			resp=(getRendaBruta()*0.1)-100;
		}else if(getRendaBruta()>2100 && getRendaBruta()<=2800) {
			resp=(getRendaBruta()*0.15)-270;
		}else if(getRendaBruta()>2800 && getRendaBruta()<=3600) {
			resp=(getRendaBruta()*0.25)-500;
		}else {
			resp=(getRendaBruta()*.3)-700;
		}
		return resp;		
	}
	@Override
	public String toString() {
		return super.toString()+"\nPessoaFisica [cpf=" + cpf + "]";
	}
	 
}
