
public class Retangulo extends Forma {
  private double lado;
  private double altura;
	public Retangulo() {
	  
  }
public Retangulo(double alt, double lad) {
	this.altura=alt;
	this.lado=lad;
}
  
	public double calculaArea() {
		return lado*altura;
	}
	public double calculaPerimetro() {
		return 2*(altura+lado);
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
