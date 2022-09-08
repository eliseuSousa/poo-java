public class Triangulo extends Figura
{
	private double base;
	private double altura;

	public Triangulo(double base, double altura, String cor) {
	
		this.base = base;
		this.altura = altura;
		super.setCor(cor);
	}

	public void setBase(double base) {
	
		this.base = base;
	}

	public double getBase() {
	
		return this.base;
	}

	public void setAltura(double altura) {
	
		this.altura = altura;
	}

	public double getAltura() {
	
		return this.altura;
	}

	public double area() {
	
		double area = (this.base*this.altura) / 2;
		return area;
	}

	public String toString() {
	
		return "[Base: "+this.base+" Altura: "+this.altura+"Cor: "+super.getCor()+"]";
	}
}
