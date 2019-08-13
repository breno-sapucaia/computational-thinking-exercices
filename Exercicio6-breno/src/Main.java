import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 5, l = 6;
		Scanner leia = new Scanner(System.in);
		int codigo[] = { 1, 2, 3, 4, 5 };
		String nome[] = { "PROD_A", "PROD_B", "PROD_C", "PROD_E", "PROD_D" };
		String lojas[] = { "LOJA_A", "LOJA_B", "LOJA_C", "LOJA_D", "LOJA_E", "LOJA_F" };
		
		boolean bool = false;
		double precos[][] = new double[l][c];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				double x;
				do {
					try {
						System.out.print("Qual o preço do(a) " + nome[j] + " na loja " + lojas[i] + "? R$:");
						x = leia.nextDouble();
					}catch (InputMismatchException e){
						System.out.println("Use a virgula no lugar do ponto final");
						x = 0;
					}
					
					if (x <= 0) {
						System.out.println("digite um valor maior que 0");
					}
					
				} while (x <= 0);
				precos[i][j] = x;
				
				
			}
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");

		for(int i = 0; i < l; i++) {			
			double menorPreco= 0;
			String menorLoja="";
			String menorProd="";
			for(int j = 0; j < c; j++) {
				if(menorPreco == 0) {
					menorPreco = precos[j][i];
					menorLoja = lojas[j];
					menorProd = nome[i];
				}
				
				if(precos[j][i] < menorPreco) {
					menorPreco = precos[j][i];
					menorLoja = lojas[j];
					menorProd = nome[i];
				}
				
			}
			System.out.println("O "+menorProd+" foi encontrado na "+menorLoja+" por "+menorPreco);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("lita de produtos por loja");
		System.out.println("");
		M.show(precos, l, c,nome,lojas);
		

	}
}
