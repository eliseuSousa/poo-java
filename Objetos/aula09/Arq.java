import java.io.*;

public class Arq
{
	public static void main(String[] args)
	{
		try
		{
			File path = new File("./");
			String[] list = path.list();

			for(int i = 0; i < list.length; i++)
			{
				System.out.println(list[i]);
			}
		} catch (Exception e)
		{
			System.out.println("Erro: "+e);
		}
	}
}
