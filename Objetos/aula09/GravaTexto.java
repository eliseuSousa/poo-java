import java.io.*;

public class GravaTexto
{
	public static void main(String[] args)
	{
		try
		{
			String nome_arq = "teste2.txt";
			FileOutputStream file = new FileOutputStream(outro_arq);
			PrintStream saida = new PrintStream(file);

			saida.println("Primeira linha");
			saida.println("Segunda linha");
		} catch (Exception e)
		{
			System.out.println("Erro: "+e);
		}
	}
}
