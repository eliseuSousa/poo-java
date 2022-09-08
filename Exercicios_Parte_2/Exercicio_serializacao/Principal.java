import java.util.HashMap;
import java.io.*;
public class Principal {

	public static void menuPrincipal() 
	{
		System.out.println("---MENU---");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Consultar");
		System.out.println("3 - Finalizar");
	}

	public static void main(String[] args) {
	
		InputStreamReader inRS = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inRS);

		HashMap<Integer, Pessoa> pessoas = new HashMap<>();

		String nome = "";
		String telefone = "";
		int codigoIndexacao = 0;
		int opcao = 0;
		boolean continuar = true;

		try
		{
			// Lendo Objetos
			FileInputStream arquivo_leitura = new FileInputStream("pessoas.dat");
			ObjectInputStream oIS = new ObjectInputStream(arquivo_leitura);
			
			pessoas = (HashMap) oIS.readObject();
			oIS.close();

			while(continuar)
			{
				menuPrincipal();
				System.out.print("Informe a sua opção: ");
				opcao = Integer.valueOf(input.readLine());

				if(opcao == 1)
				{

					System.out.println("---Cadastrar Pessoa---");
					
					System.out.print("Nome: ");
					nome = input.readLine();
				
					System.out.print("Telefone: ");
					telefone = input.readLine();
				
					System.out.print("Código de indexação: ");
					codigoIndexacao = Integer.valueOf(input.readLine());
	
					pessoas.put(codigoIndexacao, new Pessoa(nome, telefone));

				} 
				else if(opcao == 2) 
				{
					System.out.println("---Buscar pessoa com base no códifgo de indexação---");

					System.out.print("Código de indexação: ");
					codigoIndexacao = Integer.valueOf(input.readLine());

					if(pessoas.containsKey(codigoIndexacao)) 
					{

						nome = pessoas.get(codigoIndexacao).getNome();
						telefone = pessoas.get(codigoIndexacao).getTelefone();

						System.out.println("Código de indexação: "+codigoIndexacao);
						System.out.println("Nome: "+nome+"\t"+" Telefone: "+telefone);
					} else {
						System.out.println("Código inválido");
					}
				} 
				else if(opcao == 3) 
				{
					System.out.print("Deseja finalizar o programa? [sim/nao]: ");
					continuar = (input.readLine().equalsIgnoreCase("sim"))? false:true;		
				}

			}

			// Gravando Objetos
			FileOutputStream arquivo_gravacao = new FileOutputStream("pessoas.dat");
			ObjectOutputStream out = new ObjectOutputStream(arquivo_gravacao);
			out.writeObject(pessoas);
			out.close();

			for(int key : pessoas.keySet()) {
				nome = pessoas.get(key).getNome();
				telefone = pessoas.get(key).getTelefone();
				System.out.println("Nome: "+nome+"\t"+"Telefone: "+telefone);
			}

		} catch(Exception e) {
			System.out.println("Erro" +e);
		}
	}
}
