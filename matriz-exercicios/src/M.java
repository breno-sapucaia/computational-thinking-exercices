public class M{
	public static void show(int[][] matriz,int l,int c) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
