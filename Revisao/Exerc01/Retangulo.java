public class Retangulo extends Figura
{
	private double lado1;
	private double lado2;

	public Retangulo(double lado1, double lado2, String cor) {
	
		this.lado1 = lado1;
		this.lado2 = lado2;
		super.setCor(cor);
	}

	public Retangulo() {}

	public void setLado1(double lado1) {
	
		this.lado1 = lado1;
	}

	public double getLado1() {
	
		return lado1;
	}

	public void setLado2(double lado2) {
	
		this.lado2 = lado2;
	}

	public double getLado2() {
	
		return this.lado2;
	}

	public double area() {
	
		double area = this.lado1*this.lado2;
		return area;
	}

	public String toString() {
	
		return "[Lado1: "+this.lado1+" Lado2: "+this.lado2+" Cor: :"+super.getCor()+"]";
	}
}
