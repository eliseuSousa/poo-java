import java.io.*;
import java.util.*;

public class PrincipalHashMap
{
	public static void main(String[] args)
	{
		InputStreamReader inRS = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inRS);

		Conta conta;
		Cliente cliente;
		HashMap<String, Cliente> clientes = new HashMap<>();
		
		boolean continuar=true;
		boolean addConta=false;

		String nome;
		String email; 

		while(continuar)
		{
			System.out.println("---Novo Cliente---");
			
			try
			{
				System.out.print("Nome: ");
				nome=input.readLine();

				System.out.print("Email: ");
				email=input.readLine();
	
				cliente = new Cliente();
				cliente.setNome(nome);
				cliente.setEmail(email);
				clientes.put(nome, cliente);

				System.out.print("Deseja criar uma conta?[sim/nao]: ");
				addConta = (input.readLine().equalsIgnoreCase("sim")) ? true:false;

				while(addConta)
				{
					int tipoConta = 0;
					
					System.out.println("---Informe o tipo de conta---");
					System.out.println("1 - Criar uma conta corrente");
					System.out.println("2 - Criar uma conta poupança ");
					
					try
					{
						System.out.print("Informe a sua opção: ");
						tipoConta = Integer.valueOf(input.readLine());
					}
					catch(Exception e)
					{
						System.out.println("Erro "+e);
					}

					if(tipoConta == 1)
					{
						double limite;
						
						try
						{
							System.out.print("Informe o limite da conta corrente: ");
							limite = Double.valueOf(input.readLine());
							conta = new ContaCorrente(limite);
							cliente.incluirConta(conta);
							System.out.println("Uma nova conta corrente foi criada");
						}
						catch(Exception e)
						{
							System.out.println("Erro "+e);
						}
					}
					else if(tipoConta == 2)
					{
						conta=new ContaPoupanca();
						cliente.incluirConta(conta);
						System.out.println("Uma nova conta poupanca foi craida");
					} 
					else 
					{
						System.out.print("opção informada não encontrada");
					}

					try 
					{
						System.out.print("Deseja criar uma conta?[sim/nao]: ");
						addConta = (input.readLine().equalsIgnoreCase("sim")) ? true:false;
					} 
					catch(Exception e) {
						System.out.println("Erro: "+e);
					}
				}
			}
			catch(Exception e)
			{
				System.out.println("Erro "+e);
			}
			
			try
			{
				System.out.print("Digite [fim] para finalizar o cadastro: ");
				continuar=(input.readLine().equalsIgnoreCase("fim")) ? false:true;
			}
			catch (Exception e)
			{
				System.out.println("Erro "+e);
			}

		}

		HashMap<String, Cliente> mapaDeClientes = clientes;

		for(Map.Entry<String, Cliente> item : clientes.entrySet())
		{
			System.out.println("Nome: "+item.getKey()+"\t"+"Saldo geral: "+item.getValue().getSaldoGeral());
		}
	
	}
}
