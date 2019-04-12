package exercicios;

import java.util.Scanner;

public class Exercicio23 {
	public String veiculo;
	public double tempo;
	public double valor;
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("tempo em minutos que o veículo ficou? :");
		tempo = leia.nextInt();
		System.out.print("Qual o veículo? moto ou carro? :");
		veiculo = leia.next().toLowerCase();
		
		switch (veiculo){
			case "moto":
				if (tempo<=15) {
					valor = 0;
				}else if((tempo >15) &&(tempo<180)) {
					valor = 17;
				}else {
					valor = (17 + ((tempo-180)*0.1)); 
				}			
				break;
			case "carro":
				if (tempo<=15) {
					valor = 0;
				}else if((tempo >15) &&(tempo<180)) {
					valor = 20;
				}else {
					valor = (17 + ((tempo-180)*0.015)); 
				}
			break;
				default:
					System.out.println("Veículo inválido");
				break;
		}
		System.out.printf("Valor a ser pago R$:%.2f",valor);
		
	}
}
