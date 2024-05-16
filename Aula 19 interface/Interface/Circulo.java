package Interface;

public class Circulo implements InterfaceForma {
    private double raio;
	public Circulo() {
		
	}
	public Circulo(double r) {
		this.raio=r;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double calculaArea() {
		return Math.PI*Math.pow(raio,2);
	}
	public double calculaPerimetro() {
		return 2*Math.PI*this.raio;
	}	

}
