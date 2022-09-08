import java.io.*;

public class Exercicio01 {
	public static void menuPrincipal() {

		System.out.println("---MENU PRINCIPAL---");
		System.out.println("1 - Buscar palavras)");
		System.out.println("2 - Substituição de palavras");
		System.out.println("3 - Listar (Imprimi na tela os arquivos gerados)");
		System.out.println("4 - Sair");
	}

	public static void main(String[] args) {
		// Criação objetos necessários para a entrada de dados
		InputStreamReader inRS = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(inRS);

		// Objetos para a gravação de arquivos
		FileOutputStream novo_arquivo;
		PrintStream out;

		// Objeto para a leitura de arquivos
		FileInputStream arquivo_leitura;

		String linha = null;
		boolean continuar = true;
		int opcao = 0;

		try {

			while (continuar) {
				menuPrincipal();

				inRS = new InputStreamReader(System.in);
				input = new BufferedReader(inRS);
				System.out.print("Informe a sua opção: ");
				opcao = Integer.valueOf(input.readLine());

				if (opcao == 1) {

					System.out.println("---Conta o número de ocorrências de uma determinada palavra--");
					System.out.print("Informe a palavra que deseja buscar: ");
					String palavra = input.readLine();

					int ocorrencias = 0;
					linha = null;

					arquivo_leitura = new FileInputStream(args[0] + ".txt");
					inRS = new InputStreamReader(arquivo_leitura);
					input = new BufferedReader(inRS);

					linha = input.readLine();

					while (linha != null) {
						for (String str : linha.split(" ")) {
							if (str.contains(palavra)) {
								ocorrencias++;
							}
						}
						linha = input.readLine();
					}

					System.out.println("Palavra: " + palavra + "\t" + "Total de ocorrências: " + ocorrencias);

				} else if (opcao == 2) {
					System.out.println("---Gera um novo arquivo substituindo duas palavras (antiga e nova)---");

					// Lendo informação do teclado
					String antigaPalavra;
					String novaPalavra;

					inRS = new InputStreamReader(System.in);
					input = new BufferedReader(inRS);

					System.out.print("Informe a palavra antiga: ");
					antigaPalavra = input.readLine();
					System.out.print("Informe a nova palavra: ");
					novaPalavra = input.readLine();

					// Abrindo o arquivo para leitura
					linha = null;
					arquivo_leitura = new FileInputStream(args[0] + ".txt");
					inRS = new InputStreamReader(arquivo_leitura);
					input = new BufferedReader(inRS);

					// Criando um arquivo para gravação de dados
					novo_arquivo = new FileOutputStream(args[0] + "_modifield.txt");
					out = new PrintStream(novo_arquivo);

					linha = input.readLine();

					while (linha != null) {
						linha = linha.replace(antigaPalavra, novaPalavra);
						out.print(linha);
						linha = input.readLine();
					}

					System.out.println("Operação finalizada");
				} else if (opcao == 3) {
					System.out.println("---Lista os arquivos na tela---");

					GenericFilter filtro = new GenericFilter();

					filtro.add("txt");
					File path = new File(".");
					String[] list = path.list(filtro);

					for (int i = 0; i < list.length; ++i) {
						System.out.println(list[i]);
					}

				} else if (opcao == 4) {
					System.out.print("Deseja mesmo sair do programa? [sim/nao]");
					continuar = (input.readLine().equalsIgnoreCase("sim")) ? false : true;
				} else {
					System.out.println("Opção informada não encontrada!");
				}
			}

		} catch (Exception e) {
			System.out.println("Erro " + e);
		}
	}
}
