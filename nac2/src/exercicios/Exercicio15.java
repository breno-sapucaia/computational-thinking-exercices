package exercicios;

import java.util.Scanner;

public class Exercicio15 {
	public int aux;
	public int x;
	public int y;
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		x = 5;y = 18;
		System.out.println("valor da variavel x = "+x);
		System.out.println("valor da variavel y = "+y);
		aux = x; x = y; y = aux;
		System.out.println("valor da variavel x depois do Troca Troca = "+x);
		System.out.println("valor da variavel y depois do Troca Troca = "+y);	
	}
}
