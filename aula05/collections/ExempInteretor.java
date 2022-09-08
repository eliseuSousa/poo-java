import java.util.*;

class ExempInteretor
{

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		v.addElement("Primeiro");
		v.addElement("Segundo");
		v.addElement("Terceiro");

		Iterator it = v.iterator();

		while(it.hasNext()) {
			System.out.println("Elemeto: "+it.next());
		}
	}

}
