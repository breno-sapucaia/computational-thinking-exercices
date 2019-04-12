package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	private double altura;
	private double r;
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public void executar() {
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite a altura da lata em cm");
	setAltura(Double.parseDouble(leia.nextLine()));
	System.out.println("Digite o raio da lata em cm");
	setR(Double.parseDouble(leia.nextLine()));
	
	System.out.printf("o volume da lata é de %.2fcm³", (3.14 * ( getR()*getR() ) * getAltura()));
	}
}
