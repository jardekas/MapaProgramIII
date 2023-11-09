package Entities;

public class Aluguel {
	private double kmInicial;
	private double kmFinal;
	private double total;
	public int quantidadeDeDias;

	public Aluguel(double kmInicial, double kmFinal, int quantidadeDeDias) {
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
		this.quantidadeDeDias = quantidadeDeDias;
	}

	public double getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public double getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}

	public int getQuantidadeDeDias() {
		return quantidadeDeDias;
	}

	public void setQuantidadeDeDias(int quantidadeDeDias) {
		this.quantidadeDeDias = quantidadeDeDias;
	}

	@Override
	public String toString() {
		return "Aluguel [kmInicial=" + kmInicial + ", kmFinal=" + kmFinal + ", quantidadeDeDias=" + quantidadeDeDias
				+ "]";
	}

	Carro carro;
	// Inicia o aluguel
	double ValorPorKm = carro.getValorPorkm();

	// Calcula o valor total do aluguel
	public void calcularValorTotalAluguel(int quantidadeDeDias, double ValorPorKm)
	{
	total = quantidadeDeDias * ValorPorKm;
	}

	if(quantidadeDeDias>10)
	{
		total = total * 0.9;
	}
	else if(quantidadeDeDias>20)
	{
		total = total * 0.8;
	}
	// Mostra o resumo da locação
	JOptionPane.showMessageDialog(null,
			"Resumo Aluguel\n\nCliente\n"
			+ cliente
			+"\nCarro\n"
			+carro
			+"\nAluguel\n"
			+ quantidadeDeDias
			+" dias\n"
			+ KmInicial
			+" km\n"
			+ KmFinal
			+" km\n"
			+ total
			+" reais");
}