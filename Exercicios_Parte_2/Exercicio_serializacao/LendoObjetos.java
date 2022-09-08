import java.io.*;
import java.util.*;
public class LendoObjetos
{
	public static void main(String[] args)
	{
		try {
		// Lendo Objts
		Vector lista_l = null;
		FileInputStream file_l = new FileInputStream( "pesoas.dat" );
		ObjectInputStream in = new ObjectInputStream( file_l );lista_l = (Vector) in.readObject();
		in.close();
		Iterator it = lista_l.iterator();
		while( it.hasNext() )
		{
			Pessoa p = (Pessoa) it.next();
			System.out.println( p.getNome() );
		}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
