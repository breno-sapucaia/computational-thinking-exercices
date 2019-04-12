package exercicios;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op;
		System.out.println("selecione o exercicio:");
		System.out.println("1 - x²");
		System.out.println("2 - n1 + n2 + n3  = total²");
		System.out.println("3 - 1º + 3º / 3º x 4º");
		System.out.println("4 - R$ -> U$ ");
		System.out.println("5 - R$ -> Litro ");
		System.out.println("6 - °C -> °F");
		System.out.println("7 - cm³");
		System.out.println("8 - Boleto");
		System.out.println("9 - R$1.000.000,00");
		System.out.println("10 - Eleições 2019.");
		System.out.println("11 - +18");
		System.out.println("12 - Calculadora Simples 1.0");
		System.out.println("13 - print(x > y > z)");
		System.out.println("14 - autestima baixa");
		System.out.println("15 - Troca Troca");
		System.out.println("16 - Validação 0");
		System.out.println("17 - 3 = Março");
		System.out.println("18 - Calculadora simples 2.0");
		System.out.println("19 - Crefisa do Recife");
		System.out.println("20 - Passagens");
		System.out.println("21 - Digito verificador");
		op = Integer.parseInt(leia.nextLine());
			switch (op) {
				case 1: 
					Exercicio1 ex1 = new Exercicio1();
					ex1.executar();
					break;
				case 2:
					Exercicio2 ex2 = new Exercicio2();
					ex2.executar();
					break;
				case 3:
					Exercicio3 ex3 = new Exercicio3();
					ex3.executar();
					break;
				case 4:
					Exercicio4 ex4 = new Exercicio4();
					ex4.executar();
					break;
				case 5:
					Exercicio5 ex5 = new Exercicio5();
					ex5.executar();
					break;
				case 6:
					Exercicio6 ex6 = new Exercicio6();
					ex6.executar();
					break;
				case 7:
					Exercicio7 ex7 = new Exercicio7();
					ex7.executar();
					break;
				case 8:
					Exercicio8 ex8 = new Exercicio8();
					ex8.executar();
					break;
				case 9:
					Exercicio9 ex9 = new Exercicio9();
					ex9.executar();
					break;
				case 10:
					Exercicio10 ex10 = new Exercicio10();
					ex10.executar();
					break;
				case 11:
					Exercicio11 ex11 = new Exercicio11();
					ex11.executar();
					break;
				case 12:
					Exercicio12 ex12 = new Exercicio12();
					ex12.executar();
					break;
				case 13:
					Exercicio13 ex13 = new Exercicio13();
					ex13.executar();
					break;
				case 14:
					Exercicio14 ex14 = new Exercicio14();
					ex14.executar();
					break;
				case 15:
					Exercicio15 ex15 = new Exercicio15();
					ex15.executar();
					break;
				case 16:
					Exercicio16 ex16 = new Exercicio16();
					ex16.executar();
					break;
				case 17:
					Exercicio17 ex17 = new Exercicio17();
					ex17.executar();
					break;
				case 18:
					Exercicio18 ex18 = new Exercicio18();
					ex18.executar();
					break;
				case 19:
					Exercicio19 ex19 = new Exercicio19();
					ex19.executar();
					break;
				case 20:
					Exercicio20 ex20 = new Exercicio20();
					ex20.executar();
					break;
				case 21:
					Exercicio21 ex21 = new Exercicio21();
					ex21.executar();
					break;
				default:
					System.out.println("opção inválida");
					break;
			}
	}
}
