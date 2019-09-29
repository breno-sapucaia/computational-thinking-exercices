import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 1;
		Scanner read = new Scanner(System.in);
		while(op > 0){
			op = read.nextInt();
			switch(op) {
			case 1:
				Ex1.execute();
				break;
			case 2:
				Ex2.execute();
				break;
			}
			
		}
	}

}
