package exercicios;
import java.util.Scanner;
public class Exercicio10 {
	public double candidatoAVotos;
	public double candidatoBVotos;
	public double candidatoCVotos;
	public double branco;
	public double nulos;
	public double total;
	// como s�o exericcio simples eu vo usar tudo public ok?
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a quantidade de votos do candidato A: ");
		this.candidatoAVotos = Integer.parseInt(leia.nextLine());
		System.out.print("Digite a quantidade de votos do candidato B: ");
		this.candidatoBVotos = Integer.parseInt(leia.nextLine());
		System.out.print("Digite a quantidade de votos do canditado C: ");
		this.candidatoCVotos = Integer.parseInt(leia.nextLine());
		System.out.print("Quantidade de votos nulos: ");
		nulos = leia.nextInt();
		System.out.println("Quantidade de votos brancos: ");
		branco= leia.nextInt();
		
		total = candidatoAVotos + candidatoBVotos + candidatoCVotos + nulos + branco;
		System.out.printf("A porcentagem de votos do candidato A em rela��o ao total = %.2f \n", (candidatoAVotos/total)*100);
		System.out.printf("A porcentagem de votos do candidato B em rela��o ao total = %.2f \n", (candidatoBVotos/total)*100);
		System.out.printf("A porcentagem de votos do candidato C em rela��o ao total = %.2f \n", (candidatoCVotos/total)*100);
		System.out.printf("A porcentagem de votos Nulos em rela��o ao total = %.2f \n", (nulos/total)*100);
		System.out.printf("A porcentagem de votos Brancos em rela��o ao total = %.2f \n", (branco/total)*100);
	}
}
