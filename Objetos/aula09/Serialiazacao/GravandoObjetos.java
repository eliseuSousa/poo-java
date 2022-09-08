import java.io.*;
import java.util.*;

class GravandoObjetos
{
	public static void main(String[] args)
	{
		try
		{
			Vector<Pessoa> listaPessoas = new Vector<>();
			listaPessoas.addElement(new Pessoa("Pedro"));
			listaPessoas.addElement(new Pessoa("Jão"));

			FileOutputStream file_g = new FileOutputStream("pessoas.dat");
			ObjectOutputStream out = new ObjectOutputStream(file_g);

			out.writeObject(listaPessoas);
			out.close();
		} 
		catch(Exception e) 
		{
			System.out.println("Erro "+e);
		}

		try
		{

			// Lendo Objetos
			Vector<Pessoa> lista_leitura = null;

			FileInputStream file_l = new FileInputStream("pessoas.dat");
			ObjectInputStream in = new ObjectInputStream(file_l);

			lista_leitura = (Vector) in.readObject();
			in.close();
	
			Iterator<Pessoa> it = lista_leitura.iterator();

			while(it.hasNext())
			{
				Pessoa p = (Pessoa) it.next();
				System.out.println(p.getNome());
			}	
		} catch(Exception e)
		{
			System.out.println("Erro "+e);
		}
	}
}
