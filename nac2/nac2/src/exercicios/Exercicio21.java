package exercicios;

import java.util.Scanner;

public class Exercicio21 {
	public int n1;
	public int n2;
	public int n3;
	public int digito1Somado;
	public int soma;
	public int digito;
	public int digitoInverso;
	public String auxiliarStringer;
	public String[] aux;
	int i;
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("digite o 1� n�mero do digito verificador");
		n1 = leia.nextInt();
		System.out.println("digite o 2� n�mero do digito verificador");
		n2 = leia.nextInt();
		System.out.println("digite o 3� n�mero do digito verificador");
		n3 = leia.nextInt();
		
		n1 = (n1 + n3);
		n2 = n2 +n2;
		n3 = n1;
		auxiliarStringer = (n1)+""+(n2)+""+(n3);
		aux = auxiliarStringer.split("");
		for(i = 0; i <aux.length ; i++) {
			soma += Integer.parseInt(aux[i]) * (i+1);
		}
		System.out.println("digito verificador:" + soma%2);
		
	}
}
