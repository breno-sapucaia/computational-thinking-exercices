package exercicios;

import java.util.Scanner;

public class Exercicio20 {
	public int regiao;
	public int op;
	public int preco;
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Selecione a op��o de destion ex: 1 ");
		System.out.println(" 1) Norte");
		System.out.println(" 2) Nordeste");
		System.out.println(" 3) Centro-Oeste");
		System.out.println(" 4) Sudeste");
		System.out.println(" 5) Sul ");
		regiao = leia.nextInt();
		
		switch (regiao) {
		case 1:
			System.out.println("Digite 1 para ida ou 2 para Ida e Volta");
			op = leia.nextInt();
			switch (op) {
				case 1:
					preco = 100;
				break;
				case 2:
					preco = 180;
					break;
				default:
					System.out.println("op��o inv�lida");
				break;
			}
			break;
		case 2:
			System.out.println("Digite 1 para ida ou 2 para Ida e Volta");
			op = leia.nextInt();
			switch (op) {
			case 1:
				preco = 205;
			break;
			case 2:
				preco = 375;
				break;
			default:
				System.out.println("op��o inv�lida");
			break;
		}
			break;
		case 3:
			System.out.println("Digite 1 para ida ou 2 para Ida e Volta");
			op = leia.nextInt();
			switch (op) {
				case 1:
					preco = 548;
				break;
				case 2:
					preco = 1007;
					break;
				default:
					System.out.println("op��o inv�lida");
			break;
			}
			break;
		default:
			System.out.println("N�o trabalhamos com Sul e Sudeste");
			break;
		}
		System.out.println("o preco da passagem ficar� de R$:" +preco);
		}
		
		
	}

