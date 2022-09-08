public class Quadrado extends Retangulo
{
	public Quadrado(double lado, String cor) {
	
		super.setLado1(lado);
		super.setLado2(lado);
		super.setCor(cor);
	}

	public String toString() {
	
		return "[ Lado: "+super.getLado1()+" Cor: "+super.getCor()+"]";
	}
}
