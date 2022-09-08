import java.io.*;

class LendoDoisNumeros
{

	public static void main(String args[]) {
	
		InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader inputBuffer = new BufferedReader(inputStream);

		String finalizar="";
		boolean continuar=true;
		int opcao=0;
		float numero1=0f;
		float numero2=0f;

		while(continuar) {
		
			System.out.println("Escolha uma das opções abaixo: ");
			System.out.println("1 - Dividindo um número pelo outro");
			System.out.println("2 - Some os dois números lido");
			System.out.println("3 - Subtrair 1° pelo 2° número lido");
			System.out.println("4 - Multiplicar dois números");
			System.out.print("Informe a sua escolha: ");
			
			try {
				
				opcao=Integer.valueOf(inputBuffer.readLine());
				System.out.print("Informe o 1º número: ");
				numero1=Float.valueOf(inputBuffer.readLine());
				System.out.print("Informe o 2° número: ");
				numero2=Float.valueOf(inputBuffer.readLine());

			} catch (Exception e) {
				
				System.out.println("Informe somente números!");
			}

			switch (opcao) {
			
				case 1: {
		
							if(numero2 != 0) {
							
								float divisao =  numero1 / numero2;
								System.out.println(numero1+" / "+numero2+" = "+divisao);						
								
							} else {
								System.out.println("Impossível divisão por zero");
							}

						break;
				}

				case 2: 
						
						float soma = numero1 + numero2;
						System.out.println(numero1+" + "+numero2+" = "+soma);
						break;

				
				case 3:

					float subtracao = numero1 - numero2;
					System.out.println(numero1+" - "+numero2+" = "+subtracao);
					break;

				case 4:

					float multiplicacao = numero1 * numero2;
					System.out.println(numero1+" * "+numero2+" = "+multiplicacao);
					break;

				default:
					System.out.println("Opção informada não encontrada.");
					break;

			}

			try {

				System.out.print("Deseja continuar? [sim/nao]: ");
				finalizar = inputBuffer.readLine();

			} catch (Exception e) {
				
				System.out.println(e);

			}

			finalizar = finalizar.toLowerCase();

			continuar = finalizar.equals("nao")? false:true;

		}
	}
}
