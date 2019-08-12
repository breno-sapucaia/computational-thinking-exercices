import java.util.Scanner;

public class Ex2 {
	public static void execute() {
		int c = 4, l = 4;
		int maior = 0;
		int matriz[][] = new int[l][c];
		Scanner read = new Scanner(System.in);
		for(int i = 0 ; i < l; i++) {
			for(int j = 0; j < c; j++) {
				System.out.println("Digite o "+(i+1)+"º número da "+(j+1)+"ª coluna");
				int x = read.nextInt();
				matriz[i][j] = x;
				
				if(x > maior) {
					maior =x ;
				}
			}
		}
		
		int matrizxmaior[][] = new int[l][c];
		
		for(int i = 0 ; i < l; i++) {
			for(int j = 0; j < c; j++) {
				matriz[i][j] = matriz[i][j] * maior;
			}
		}
		
		
		M.show(matriz,c,l);
	}
}
