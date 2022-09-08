import java.io.*;

class Pessoa implements Serializable
{
	private String nome;

	public Pessoa(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

}
