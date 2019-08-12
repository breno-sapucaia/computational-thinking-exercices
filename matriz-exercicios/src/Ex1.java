
public class Ex1 {

	public static void execute() {
		int matriz[][] = new int[5][6];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (j % 2 != 0) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}

		
	}

}
