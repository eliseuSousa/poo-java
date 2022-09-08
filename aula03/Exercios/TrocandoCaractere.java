import java.io.*;
class TrocandoCaractere 
{
	public static void main(String args[])
	{
		String s = "";
		String novaString = "";
		InputStreamReader ISRin = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ISRin);		
		
		try 
		{
			System.out.print("Escreva: ");
			s = in.readLine();
			novaString = s.replace('a', '#');
		} catch (Exception e) {
			System.out.println(e);		
		}

		System.out.println(novaString);
	}
}
