package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	private double C;
	
	public void setC(double C) {
		this.C = C;
	}
	public double getC() {
		return this.C;
	}
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite os graus célsius: ");
		setC(Double.parseDouble(leia.nextLine()));
		
		System.out.printf(getC()+ "°C em graus Fahrenheit: %.2f°F", ((9 * getC() + 160)/5));
	}
}
