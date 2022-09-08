class Exerc09 
{

	public static void main(String args[])
	{

		double r = Math.random() * 10;
		int i = (int) r;
		String grupo = "";
		
		System.out.println(i);
		switch (i) 
		{

			case 0: case 1: case 2: case 3:
				grupo = "A";
				break;

			case 4: case 5: case 6: case 7:
				grupo = "B";
				break;

			case 8: case 9:
				grupo = "C";
				break;
		}

		System.out.println(grupo);

	}

}
