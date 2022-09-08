class Exerc07 
{

	public static void main(String args[])
	{
	
		int qtdLinhas=10;
		String linha;
		for(int i = qtdLinhas; i > 0; i--)
		{
			linha="";
			for (int j = 0; j < i; j++)
			{
				linha += "*";
			}
			System.out.println(linha);
		}	

	} 

}
