package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	public String op;
	public double v1;
	public double v2;
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o 1� valor:");
		v1 = leia.nextDouble();
		System.out.println("Digite o operador [ +  -  *  / ]");
		op = leia.next();
		System.out.println("Digite o segundo valor");
		v2 = leia.nextDouble();
		if(op.equals("+") || op.equals("*") || op.equals("-") || op.equals("/")) {
		if (op.equals("+")) {
			System.out.println(v1+" + "+v2+" = "+(v1+v2));
		}else if(op.equals("-")) {
				System.out.println(v1+" - " +v2+ " = " + (v1-v2));
		}else if(op.equals("*")){
				System.out.println(v1+" * "+ v2 + " = " + (v1*v2));
		}else if(v2 == 0) {
				System.out.println("n�o � possivel dividir n�mero por 0");
			  }else {
					System.out.println(v1+" / "+ v2+" = " + (v1/v2));
			}
		}else {
			System.out.println("Operador inv�lido");
		}

		//System.out.println("Escolha a op��o");
		//System.out.println(" 1) +");
		//System.out.println(" 2) -");
		//System.out.println(" 3) *");
		//System.out.println(" 4) /");
		
		
	}
}