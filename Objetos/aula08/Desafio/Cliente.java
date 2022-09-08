import java.util.*;

public class Cliente
{
	String nome;
	String email;
	
	List<Conta> contas = new ArrayList<>();
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setEmail(String email)
	{
		this.email=email;
	}

	public void incluirConta(Conta newConta)
	{
		contas.add(newConta);
	}

	public double getSaldoGeral()
	{
		double saldoGeral=0.0;
		Conta c;
		Iterator it = this.contas.iterator();

		while(it.hasNext())
		{
			c=(Conta) it.next();
			saldoGeral+=c.getSaldo();
		}

		return saldoGeral;
	}
}
