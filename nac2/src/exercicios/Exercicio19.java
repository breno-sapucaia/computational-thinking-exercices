package exercicios;

import java.util.Scanner;

public class Exercicio19 {
	public double salario;
	
	public double prestacao;
	// professor eu n�o sei como funciona esse esquemad e emprestimo e parcela
	// minha l�gica foi que s� libera o empr�stimo se o mesmo solicitado for menor ou igual do que (salario *1.3)
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do seu salario bruto");
		salario = leia.nextDouble();
		System.out.println("Digite o valor da presta��o: ");
		prestacao = leia.nextDouble();	
		
		if (prestacao <= salario *1.3 ) {
			System.out.println("Libera o empr�stimo");
		}else {
			System.out.println("Cancela o empr�stimo");
		}
	
	
	}
	
	
}
