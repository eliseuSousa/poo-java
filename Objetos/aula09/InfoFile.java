import java.io.*;

public class InfoFile
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("teste.txt");

			System.out.println(file.getAbsolutePath());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.getName());
			System.out.println(file.getParent());
			System.out.println(file.length());
			System.out.println(file.lastModified());
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
		} catch (Exception e)
		{
			System.out.println("Erro: "+e);
		}
	}
}
