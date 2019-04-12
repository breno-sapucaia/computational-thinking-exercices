package exercicios;

import java.util.Scanner;

public class Exercicio18 {
	public double v1;
	public double v2;
	public String op;
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Calculadora");
		System.out.print("Digite o 1º valor: ");
		v1 = leia.nextDouble();
		System.out.println("Digite o operador [+ - / * ]");
		op = leia.next();
		System.out.println("Digite o 2º valor: ");
		v2 = leia.nextDouble();
		
			switch (op) {
				case "+":
					System.out.println(v1+" + "+v2+" = "+(v1+v2));
					break;
				case "-":
					System.out.println(v1+" - "+v2+" = "+(v1-v2));
					break;
				case "*":
					System.out.println(v1+" * "+v2+" = "+(v1*v2));
					break;
				case "/":
					if(v2 ==0) {
						System.out.println("impossível dividir por 0");
					}else {
						System.out.println(v1+" / "+v2+" = "+(v1/v2));
					}
					break;
				default:
					System.out.println("Operador inválido");
					break;
		
			}
		
		
		
	}
}
