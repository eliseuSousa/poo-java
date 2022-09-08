import Robos.Robo;

public class Principal
{

	public static void main(String[] args)
	{
		
		Robo.quantos;
		Robo cnc1;
		Robo cnc2;

		System.out.println(Robo.quantos);

		cnc1 = new Robo(10, 12);
		
		System.out.println(Robo.quantos);

		cnc2 = new Robo(20, 22);

		System.out.println(Robo.quantos);

	}
	
}
