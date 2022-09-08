import java.io.*;
import java.util.*;

public class ListaClientes
{

	public static void main(String[] args)
	{
		InputStreamReader inRS=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(inRS);

		ArrayList<Cliente> clientes=new ArrayList<>();

		Cliente cliente;

		Iterator it;

		String nome;
		String telefone;

		boolean continuar=true;

		while(continuar)
		{
			try
			{
				System.out.print("Informe o nome do cliente: ");
				nome=input.readLine();
			
				System.out.print("Informe o telefone do cliente: ");
				telefone=input.readLine();

				cliente=new Cliente(nome, telefone);
	
				clientes.add(cliente);
			
				System.out.print("Digite [fim] para finalizar o cadastro: ");

				continuar=(input.readLine().equalsIgnoreCase("fim")) ? false:true;
			} 
			catch (Exception e) 
			{
				System.out.println("Erro: "+e);
			}
		}

		it=clientes.iterator();

		System.out.println("---Lista de Clientes---");

		while(it.hasNext())
		{
			cliente=(Cliente) it.next();

			System.out.println("Nome: "+cliente.getNome()+"\t"+"Telefone: "+cliente.getTelefone());
		}
	}

}
