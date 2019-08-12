
public class Ex3 {
	public static void execute() {
		int c = 5, l = 5;
		int matriz[][] = new int[l][c];
		for(int i = 0; i< l ; i++)
		{
			for(int j = 0; j < c; j++)
			{
				if(i == j) {
					matriz[i][j] = 1;
				}else {
					matriz[i][j] = 0;
				}
				
			}
		}
		M.show(matriz, l, c);
	}
}
