import java.util.*;
class ExemList
{
	
	public static void main(String[] args) {

		List<String> minhaLista = new LinkedList<String>();

		minhaLista.add("Gato");
		minhaLista.add("Cachorro");
		minhaLista.add("Peixe");

		for(int i=0; i < minhaLista.size(); i++) {
			System.out.println(minhaLista.get(i));
		}

		for(String item:minhaLista) {
			System.out.println(item);
		}
	
	}

}
