package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	private double reais;
	private double Dol;

	public double getDol() {
		return Dol;
	}

	public void setDol(double dol) {
		Dol = dol;
	}

	public double getReais() {
		return reais;
	}

	public void setReais(double reais) {
		this.reais = reais;
	}
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Quanto ta valendo o Dólar? U$:");
		setDol(Double.parseDouble(leia.nextLine()));
		System.out.print("Digite o valor em R$:");
		setReais(Double.parseDouble(leia.nextLine()));
		
		System.out.println("R$:"+getReais()+" valem em U$:" + (getReais() / getDol()));
		
		
	}
}
