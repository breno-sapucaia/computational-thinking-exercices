package exercicios;

import java.util.Scanner;

public class Exercicio16 {
	public int num;
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		num = leia.nextInt();
		
		if(num<0) {
			System.out.println(num+ " � um valor inv�lido");
			System.out.println("Digite um n�mero maior ou igual a 0");
		}else {
			System.out.println(num+ " � v�lido");
		}
	}
}
