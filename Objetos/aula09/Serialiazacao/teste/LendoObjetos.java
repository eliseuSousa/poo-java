import java.io.*;
import java.util.*;

public class LendoObjetos
{
	public static void main(String[] args)
	{
		try
		{
			Vector lista_leitura;

			FileInputStream arquivo_leitura = new FileInputStream("pessoas.dat");
			ObjectInputStream in = new ObjectInputStream(arquivo_leitura);

			lista_leitura  = (Vector) in.readObject();
			in.close();

			Iterator it = lista_leitura.iterator();

			while(it.hasNext())
			{
				Pessoa p = (Pessoa) it.next();
				System.out.println(p.getNome());
			}
		} catch(Exception e) {
			System.out.println("Erro "+e);
		}
	}
}
