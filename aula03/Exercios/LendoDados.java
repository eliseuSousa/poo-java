import java.io.*;

class LendoDados 
{
	public static void main(String args[]) 
	{
		String s;
		InputStreamReader ISRin = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ISRin);
		
		try 
		{
			do 
			{
				System.out.print("Iforme a entrada: ");
				s = in.readLine();
				
				System.out.println(s);
			} while (!s.equalsIgnoreCase("fim"));
		}
		catch (Exception e){
			System.out.println(e);		
		}
		 
	}
}
