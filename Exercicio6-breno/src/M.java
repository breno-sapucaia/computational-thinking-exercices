public class M{
	public static void show(int[][] matriz,int l,int c) {
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
	}
	
	public static void show(double[][] matriz,int l,int c ,String[] nome,String[] loja) {
		System.out.print("        ");
		for(int i = 0;i<c ;i++) {
			System.out.print(nome[i]+"  ");
		}
		System.out.println("");
		for (int i = 0; i < l; i++) {
			System.out.print(loja[i]+"  ");
			for (int j = 0; j < c; j++) {
				System.out.print(matriz[i][j]+"    ");
			}
			System.out.println("");
		}
	}
}
