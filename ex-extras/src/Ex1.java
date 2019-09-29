import java.util.Random;

public class Ex1 {
	public static void execute() {
		int l = 7, c = 7;
		int matriz[][] = new int[l][c];
		
		matriz = M.fillRandom(l, c, 2);
		
		M.show(matriz, l, c);
		
		int somaSecudaria = 0;
		int somaAbaixo = 0;
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c;j++) {
				if(((i+1) + (j+1)) == (l + 1)) {
					somaSecudaria += matriz[i][j];
				}else if((i+1) + (j+1) > l) {
					somaAbaixo+= matriz[i][j];
				}
				
			}
		}
		
		System.out.println(somaSecudaria);
		System.out.println(somaAbaixo);
	}
}
