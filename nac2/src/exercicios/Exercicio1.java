package exercicios;
import java.util.Scanner;
public class Exercicio1 {
	private double num;
	Scanner leia = new Scanner(System.in);
	
	public void setNum(double num) {
		this.num = num;
	}
	public double getNum() {
		return this.num;
	}
	
	public void executar() {
		
		System.out.println("Digite o n�mero desejado");
		setNum(Double.parseDouble(leia.nextLine()));
		System.out.println("O "+getNum()+"� do numero � igual a: " + (getNum() * getNum()));
	
	}
}
