package exercicios;
import java.util.Scanner;
public class Exercicio2 {
	private double total;
	private double n1;
	private double n2;
	private double n3;
	
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
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
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro valor");
		setN1(Double.parseDouble(leia.nextLine()));
		System.out.println("Digite o segundo valor");
		setN2(Double.parseDouble(leia.nextLine()));
		System.out.println("Digite o terceiro valor");
		setN3(Double.parseDouble(leia.nextLine()));
		setTotal(getN1() + getN2() + getN3());
		System.out.println(getN1()+" + "+ getN2() + " + "  + getN3() + " = " + getTotal() + "\n" + getTotal() + "² = " + (getTotal()*getTotal()) );
		
		
	}
}
