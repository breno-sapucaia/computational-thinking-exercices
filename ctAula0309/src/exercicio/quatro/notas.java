package exercicio.quatro;

public class notas {
	
	public static String gimme(double n1, double n2, double n3, String op) {
		if(op.toUpperCase().equals("A")) {
			return String.format("A nota m�dia do aluno � de %.2f", ((n1+n2+n3)/3));
		}else {
			return String.format("A nota m�dia pondereda do aluno � de %.2f", (((n1*5)+(n2*3)+(n3*2))/10));			
		}
	}
}
