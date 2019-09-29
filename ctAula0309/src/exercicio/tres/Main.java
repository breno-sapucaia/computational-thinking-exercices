package exercicio.tres;

public class Main {
	
	public static String VerifyAsc(double old, double actual) {
		double asc= actual * 100 / old;
		
		
		
		
		return String.format("Houve um acréscimo de %.0f%s",asc, "%");
	}
	
}
