package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	private double n1;
	private double n2;
	private double n3;
	private double n4;
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do 1º número");
		setN1(Double.parseDouble(leia.nextLine()));
		System.out.println("Digite o valor do 2º número");
		setN2(Double.parseDouble(leia.nextLine()));
		System.out.println("Digite o valor do 3º número");
		setN3(Double.parseDouble(leia.nextLine()));
		System.out.println("Digite o valor do 4º número");
		setN4(Double.parseDouble(leia.nextLine()));
		
		System.out.println(getN1() + " + " + getN3() + " = "  + (getN1() + getN2()));
		System.out.println(getN2() +  " x " + getN4() + " = " + (getN2() * getN4()));
	}
	
}
