import java.io.*;

public class ChamarPessoa
{

	public static void main(String[] args)
	{
		
		InputStreamReader inRS = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inRS);

		Pessoa p;

		String nome="";
		String telefone="";

		try 
		{
			System.out.print("Informe o nome: ");
			nome=input.readLine();

			System.out.print("Informe o telefone: ");
			telefone=input.readLine();		
	
		} catch(Exception e) {
			System.out.println("Erro "+e);
		}

		 p = new Pessoa(nome, telefone);

		System.out.println("Nome: "+p.getNome());
		System.out.println("Telefone: "+p.getTelefone());

	}

}
