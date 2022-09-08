class InicializandoStrings 
{
	public static void main(String args[]) 
	{
		String string1 = "String";
		String string2 = new String("string");
	
		if (string1.equals(string2)) {
			System.out.println("As strings são iguais");		
		}
		else if (string1.equalsIgnoreCase(string2)) {
			System.out.println("As strings são iguais ignorando o case");		
		} 
		else {
			System.out.println("As string não são iguais");
		}
	}
}
