import java.io.*;

public class LeTexto
{
	public static void main(String[] args)
	{
		try
		{
			String nome_arq = "teste2.txt";
			FileInputStream file = new FileInputStream(nome_arq);
			InputStreamReader isr = new InputStreamReader(file);
			BufferedReader in = new BufferedReader(isr);

			String linha = in.readLine();

			while(linha != null)
			{
				System.out.println(linha);
				linha = in.readLine();
			}
		} catch (Exception e)
		{
			System.out.println("Erro: "+e);
		}
	}
}
