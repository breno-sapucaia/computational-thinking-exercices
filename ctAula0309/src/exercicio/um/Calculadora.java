package exercicio.um;

public class Calculadora {
	public static double Somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double Subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double Multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double Dividir(double num1, double num2){
		if(num2 == 0) {
			System.out.println("impossível dividir por 0");
		}
		
		return num1/num2;
	}
}
