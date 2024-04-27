
public class ControleGastos {
    private double totalGastos=0;
	public ControleGastos() {
		
	}
    public double getTotalGastos() {
    	return totalGastos;
    }
    
    public void adicionar(Funcionario f) {
    	totalGastos+=f.bonificacao();
    }
}
