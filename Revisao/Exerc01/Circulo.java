public class Circulo extends Figura
{
	private double raio;

	public Circulo(double raio, String cor) {
	
		this.raio = raio;
		super.setCor(cor);
	}

	public void setRaio(double raio) {
	
		this.raio = raio;
	}

	public double getRaio() {
	
		return this.raio;
	}

	public double area() {
	
		double area = Math.pow(this.raio, 2)*Math.PI;
		return area;
	}

	public double getDiametro() {
	
		double diamentro = Math.PI*(2*this.raio);
		return diamentro;
	}

	@Override
	public String toString() {
	
		return "[ Raio: "+this.raio+" Cor: "+super.getCor()+"]";
	}
}
