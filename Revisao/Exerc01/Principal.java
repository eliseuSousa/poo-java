public class Principal
{
	public static void main(String[] args) {
	
		Circulo c = new Circulo(3, "vermelho");
		System.out.println(c.area());
		System.out.println(c.toString());

		Triangulo t = new Triangulo(2, 3, "laranja");
		System.out.println(t.area());
		System.out.println(t.toString());

		Retangulo r = new Retangulo(4, 5, "Verde");
		System.out.println(r.area());
		System.out.println(r.toString());

		Quadrado q = new Quadrado(4, "Azul");
		System.out.println(q.area());
		System.out.println(q.toString());
	}
}
