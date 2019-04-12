package exercicios;

import java.util.Scanner;

public class Exercicio17 {
	public int mes;
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número do mês");
		mes = leia.nextInt();
		if((mes<1)||(mes>12)) {
			System.out.println("mês inválido");
		}else {
			if(mes == 1) {
				System.out.println(" 1 - Janeiro");
			}else if(mes == 2) {
				System.out.println(" 2 - Fevereiro");
			}else if(mes == 3) {
				System.out.println(" 3 - Março");
			}else if(mes == 4) {
				System.out.println( "4 - Abril");
			}else if(mes == 5) {
				System.out.println(" 5 - Maio");
			}else if(mes == 6) {
				System.out.println(" 6 - Junho");
			}else if(mes == 7) {
				System.out.println(" 7 - Julho");
			}else if(mes == 8 ) {
				System.out.println(" 8 - Agosto");
			}else if(mes == 9) {
				System.out.println(" 9 - Setembro");
			}else if(mes == 10) {
				System.out.println(" 10 - Outubro");
			}else if(mes == 11) {
				System.out.println(" 11 - Novembro");
			}else {
				System.out.println(" 12 - Dezembro");
			}
		}
	}
}
