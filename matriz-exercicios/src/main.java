import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int op = -1;
		do {
			System.out.println("Escolha o exercicio");
			System.out.println(" 1 - primeiro");
			System.out.println(" 2 - segundo");
			System.out.println(" 3 - terceiro");
			System.out.println(" 0 - sair");
			op = read.nextInt();
			switch (op) {
			case 0 :
				System.out.println("falou");
				break;
			case 1:
				Ex1.execute();
				break;
			case 2:
				Ex2.execute();
				break;
			case 3: 
				Ex3.execute();
				break;
			default:
				System.out.println("essa merda ta errada digite um número válido");
				break;
			}
			
		}while( op != 0);
	}
}
