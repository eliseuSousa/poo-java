public class Principal
{

	public static void main(String[] args)
	{
		System.out.println("---Herança e polimorfismo---");
		Mamifero mamifero1=new Elefante();

		System.out.println("Cota diária de leite do elefante: "+mamifero1.obterCotaDeLeite());

		Mamifero mamifero2 = new Rato();

		System.out.println("Cota diaria de leite do rato: "+mamifero2.obterCotaDeLeite());
	}
}
