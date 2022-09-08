class ContaPoupanca extends Conta
{
	
	public ContaPoupanca()
	{
		super.saldo=100.0;
	}
	public double getSaldo()
	{
		return super.saldo;
	}

	public void deposita(double valor)
	{
		super.saldo+=valor;
	}
}
