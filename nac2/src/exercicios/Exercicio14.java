package exercicios;

import java.util.Scanner;

public class Exercicio14 {
	public int n1;
	public int n2;
	public int n3;
	public int n4;
	
	public void executar(){
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o 1� valor: ");
		n1 = leia.nextInt();
		System.out.print("Digite o 2� valor: ");
		n2 = leia.nextInt();
		System.out.print("Digite o 3� valor: ");
		n3 = leia.nextInt();
		System.out.print("Digite o 4� valor: ");
		n4 = leia.nextInt();
		if ((n1 < n2)&&(n1<n3)&&(n1<n4)) {
			System.out.println(n1 + " � o menor valor");
		}else if((n2 < n1)&&(n2<n3)&&(n2<n4)) {
			System.out.println(n2 + " � o menor valor");
		}else if((n3 < n2)&&(n3<n1)&&(n3<n4)) {
			System.out.println(n3 + " � o menor valor");
		}else {
			System.out.println(n4 + " � o menor valor");
		}
	}
}
