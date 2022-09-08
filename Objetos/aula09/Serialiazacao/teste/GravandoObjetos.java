import java.io.*;
import java.util.*;

public class GravandoObjetos
{
	public static void main(String[] args)
	{
		try
		{
			Vector<Pessoa> lista_gravacao = new Vector<>();
			lista_gravacao.add(new Pessoa("Eliseu"));
			lista_gravacao.add(new Pessoa("Jão"));	
			FileOutputStream arquivo_gravacao = new FileOutputStream("pessoas.dat");
			ObjectOutputStream in = new ObjectOutputStream(arquivo_gravacao);
			in.writeObject(lista_gravacao);
			in.close();
		} catch(Exception e) {
			System.out.println("Erro "+e);
		}
	}
}
