class ContaCorrente extends Conta
{
	private double limite;
	private double CPMF=0.38;

	public ContaCorrente(double limite)
	{
		this.limite=limite;
		super.saldo=50.0;
	}

	public void deposita(double valor)
	{
		super.saldo+=valor;
	}

	public double getSaldo()
	{
		return (limite+super.saldo) - ((super.saldo+limite)*CPMF);
	}
}
