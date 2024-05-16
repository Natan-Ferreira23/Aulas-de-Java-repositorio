package ex1;

public class Bemtevi  implements Anda,Voar {
 private  int x;
 private int y;
 private int alt;
	public Bemtevi() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void subir(int altura) {
		this.alt+=altura;
		
	}
	@Override
	public void descer(int altura) {
		// TODO Auto-generated method stub
		this.x-=altura;
	}
	@Override
	public void horizontal(int x) {
		// TODO Auto-generated method stub
		this.x+=x;
		
	}
	@Override
	public void vertical(int y) {
		// TODO Auto-generated method stub
		this.y-=y;
	}

}
