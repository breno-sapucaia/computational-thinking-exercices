package exercicios;

import java.util.Scanner;

public class Exercicio24 {
	public int op;
	public double salario;
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o seu salário");
		salario = leia.nextDouble();
		if(salario < 998) {
			System.out.println("Digite um salário superior ou igual a R$:998,00");
		}else {
		
			System.out.println(" 1. Calcular o novo salário.");
			System.out.println(" 2. Calcular o imposto.");
			System.out.println(" 3. Classificação");
			System.out.println(" 4. Sair");
			op = leia.nextInt();
		
			switch (op) {
			case 1:
				if (salario < 1008.00) {
					System.out.println("Novo salário com aumento de 240 R$:"+(salario + 240));
				}else if( (salario >=1008.00) && (salario <= 2000.00)) {
					System.out.println("Novo salário com aumento de 430 R$:"+(salario + 430));
				}else if( (salario > 2000.00) && (salario <= 7000.00)) {
					System.out.println("Novo salário com aumento de 500 R$:"+(salario + 500));
				}else {
					System.out.println("Novo salário com aumento de 630 R$:"+(salario + 630));
				}
				break;
			case 2:
				if (salario <= 1903.98) {
					System.out.printf("Novo salário com desconto de imposto de 0% R$:%.2f",(salario * 1));
				}else if ((salario > 1903.98) &&(salario <= 2826.65)){
					System.out.printf("Novo salário com desconto de imposto de 7,5% R$:%.2f",(salario * 0.99925));
				}else if ((salario > 2826.65) && ( salario <= 3751.05)){
					System.out.printf("Novo salário com desconto de imposto de 15% R$%.2f",(salario * 0.85));
				}else if((salario > 3751.05) && (salario <= 4664.68)) {
					System.out.printf("Novo salário com desconto de imposto de 22,5% R$%.2f",(salario * 0.775));
				}else {
					System.out.printf("Novo salário com desconto de imposto de 27,5% R$%.2f",(salario * 0.725));
				}
				break;
			case 3:
				if( salario)
			}
		}
		
	}
}
