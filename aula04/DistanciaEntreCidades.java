import java.io.*;

class DistanciaEntreCidades {

	public static void main(String[] args) {
		
		InputStreamReader inRe=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(inRe);

		boolean continuar=true;
		String finalizar="";
		int n=0;
		String cidades[];
		int distancias[][];
		int indexCidade1=0;
		int indexCidade2=0;

		try 
		{
			System.out.print("Informe a quantidade de cidades: ");
			n = Integer.valueOf(input.readLine());
		} 
		catch (Exception e) {
			continuar=false;
			System.out.println("Erro: "+e);
		}

		cidades=new String[n];
		
		for(int i=0; i < n; i++) 
		{

			try 
			{
				System.out.print("Informe o nome da "+String.valueOf(i+1)+"° cidade: ");
				cidades[i]=input.readLine();
			} catch(Exception e) 
			{
				continuar=false;				
				System.out.println("Erro :( "+ e);			
			}			
					
		}
		
		distancias = new int[n][n];
		for(int i=0; i < n; i++) 
		{

			for(int j=0; j < n; j++)
			{
				
				if (i==j) {
					distancias[i][j]=0;				
				}
				else if(i > j) {
					distancias[i][j]=distancias[j][i];				
				} else {

					try {
						System.out.print("Informe a distância entre a cidade de "+cidades[i]+" e a cidade de "+cidades[j]+": ");
						distancias[i][j]=Integer.valueOf(input.readLine());					
					} catch(Exception e) {
						continuar=false;
						System.out.println("Ops! Parece que ocorreu algum erro :(");
						System.out.println(e);					
					}
				
				}
								
			}

		}


		while(continuar) {
			
			System.out.println("---Cidades cadastradas---");
			
			for(int i=0; i<n; i++) {			
				System.out.println("Cidade: "+cidades[i]+" index: "+i);
			}
			
			System.out.println("Infome  o index de duas cidades para recuperar a distância entre elas");
			
			try {

				System.out.print("Informe o index da cidade 1: ");
				indexCidade1=Integer.valueOf(input.readLine());
				System.out.print("Informe o index da cidade 2: ");
				indexCidade2=Integer.valueOf(input.readLine());
				System.out.println("A distância entre a cidade de "+cidades[indexCidade1]+" e a cidade de "+cidades[indexCidade2]+" é "+distancias[indexCidade1][indexCidade2]);
			
			} catch(Exception e) {
				System.out.println("Ops! Parece que ocorreu algum erro :(");
				System.out.println(e);			
			}
			
			try {

				System.out.print("Deseja continuar? [sim/nao]: ");
				finalizar=input.readLine();
				finalizar=finalizar.toLowerCase();
				continuar=finalizar.equals("nao")? false:true;

			} catch (Exception e) {
				System.out.println("Ops! Parece que ocorreu um erro :(");
			}
	
		}

	}

}
