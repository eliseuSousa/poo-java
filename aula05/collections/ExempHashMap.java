import java.util.*;

class ExempHashMap
{

	public static void main(String[] args) {
		
		HashMap<String, String> telefones = new HashMap<String, String>();
		telefones.put("Pizza", "00000000");
		telefones.put("Locadora", "11111111");

		
		String locadora = (String) telefones.get("Locadora");		

		System.out.println(locadora);
		System.out.println(telefones.get("Pizza"));

	}

}
