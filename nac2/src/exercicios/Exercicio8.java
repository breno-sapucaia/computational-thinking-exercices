package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	private int dias;
	private double valorBoleto;
	private double juros;
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public double getValorBoleto() {
		return valorBoleto;
	}
	public void setValorBoleto(double valorBoleto) {
		this.valorBoleto = valorBoleto;
	}
	public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o valor do boleto R$:");
		setValorBoleto(Double.parseDouble(leia.nextLine()));
		System.out.print("Digite a porcentagem do juros di�rio ex: 5% = 5  :");
		setJuros(Double.parseDouble(leia.nextLine()));
		System.out.print("Digite a quantidade de dias atrasados: ");
		setDias(Integer.parseInt(leia.nextLine()));
		
		System.out.printf("O novo valor do boleto ficara de R$: %.2f", (getValorBoleto())+(getValorBoleto()*(getJuros()/100) * getDias()));
	}
}
