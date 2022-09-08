class Exerc06 {

	public static void main(String args[]) {

		int qtdLinhas=5;
		String linha;

		for(int i=0; i < qtdLinhas; i++) {
			
			linha="";
			for(int j=0; j <= i; j++) {
				linha += "*";			
			}			
			
			System.out.println(linha);	
		}		
	
	}

}
