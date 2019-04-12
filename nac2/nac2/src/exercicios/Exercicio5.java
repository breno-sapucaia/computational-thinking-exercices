package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	private double valor;
	private double precoLitro;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	
	public void executar() {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o preço por litro da gasolina R$: ");
		setPrecoLitro(Double.parseDouble(leia.nextLine()));
		System.out.print("Digite o valor que deseja abastecer em R$: ");
		setValor(Double.parseDouble(leia.nextLine()));
		
		System.out.printf("Pagando R$:"+ getValor()+ " irá abastecer %.2fL de gasolina ", (getValor()/getPrecoLitro()));

	}
}	
