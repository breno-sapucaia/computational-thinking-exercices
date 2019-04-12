package exercicios;

import java.util.Scanner;

public class Exercicio22 {
	public double pUni;
	public int origem;
	public String transporte;
	public String danger;
	public double imposto;
	public double valorTransporte;
	public double seguro;
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o valor do preço unitário: ");
		pUni = leia.nextDouble();
		System.out.println("Digite a origem ex : [ 1,2,3]");
		System.out.println(" 1 - Brasil");
		System.out.println(" 2 - México");
		System.out.println(" 3 - Outros");
		origem = leia.nextInt();
		
		System.out.println("Insira o meio de Transporte ex: [T,F,A]");
		System.out.println("  T - Terrestre");
		System.out.println("  F - Fluvial");
		System.out.println("  A - Aéreo");
		transporte = leia.next().toLowerCase();
		
		System.out.println("A carga é perigosa? [S/N]");
		danger = leia.next().toLowerCase();
		if (100.0 >= pUni) {
			imposto = 5.0/100;
		}else {
			imposto = 20/100;
		}
		
		switch (danger) {
		case "s":
			if (origem == 1) {
				valorTransporte = 21;
			}else if(origem == 2) {
				valorTransporte = 27;
			}else if(origem == 3) {
				valorTransporte = 50;
			}else {
				System.out.println("Origem inválida");
			}
		case "n":
			if(origem == 1) {
				valorTransporte = 21;
			}else if(origem == 2) {
				valorTransporte = 25;
			}else if(origem == 3) {
				valorTransporte = 40;
			}else {
				System.out.println("Origem inválida");
			}
			break;
			default:
				System.out.println("Carga perigosa inválida");
		break;
		}
		if ((origem == 2) && (transporte.equals("a"))){
			seguro = pUni/2;
		}else {
			seguro = 0;
		}
		System.out.println(pUni + (pUni*imposto) + valorTransporte + seguro);
	}
}
