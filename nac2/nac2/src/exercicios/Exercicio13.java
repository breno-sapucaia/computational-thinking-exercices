package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	public int n1;
	public int n2;
	public int n3;
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o 1� valor: ");
		n1 = leia.nextInt();
		System.out.print("Digite o 2� valor: ");
		n2 = leia.nextInt();
		System.out.print("Digite o 3� valor: ");
		n3 = leia.nextInt();
		
		
		if ((n1<n2)&& (n1<n3)) {
			if(n2 < n3) {
				System.out.println(n1+", "+ n2 + ", "+n3);
			}else {
				System.out.println(n1+", "+n3+", "+n2);
			}
		}else if((n2<n1) &&(n2 <n3)){
			if(n1<n3) {
				System.out.println(n2+","+n1+", "+n3);
			}else {
				System.out.println(n2+", "+n3+", "+n1);
			}
		}else {
			if(n2<n1) {
				System.out.println(n3+", "+n2+", "+n1);
			}else {
				System.out.println(n3+", "+n1+", "+n2);
			}
		}
		//if ((n1 < n2) && (n2n3)){
		//	System.out.println(n1+", "+ n2 + ", "+n3);
		//}else if((n1 >n2)&&(n3>n2)) {
		//	System.out.println(n1+", "+n3+", "+n2);
		//}else if((n2>n1)&&(n1>n3)) {
		//	System.out.println(n2+","+n1+", "+n3);
		//}else if ((n2>n1)&&(n3>n1)) {
		//	System.out.println(n2+", "+n3+", "+n1);
		//}else if((n3>n1)&&(n1>n2)) {
		//	System.out.println(n3+", "+n1+","+ n2);
		//}else {
		//	System.out.println(n3+", "+n2+", "+n1);
		//}
	}
}