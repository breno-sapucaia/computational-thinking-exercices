import java.util.Scanner;

public class Loja {
	static Scanner read = new Scanner(System.in);
	static int op = 0, qtde_estoque,est_minimo;
	static float valor_unit;
	static String desc_peca;
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		System.out.println("Qual tamanho máximo do estoque ?");
		estoque.setTamanhoEstoque(read.nextInt());
		
		while(op != 5) {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Vender");
			System.out.println("3 - Comprar");
			System.out.println("4 - Listar");
			System.out.println("5 - Sair");
			op = read.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("qual a descrição da peça?");
					desc_peca = read.nextLine();
					System.out.println("Qual a quantidade no estoque está entrando?");
					qtde_estoque = read.nextInt();
					System.out.println("Qual valor unitário da peça?");
					valor_unit = read.nextFloat();
					System.out.println("Qual o estoque mínimo da peça?");
					est_minimo = read.nextInt();
					BusinessObject.cadastrar(desc_peca, qtde_estoque, valor_unit, est_minimo);;
					break;
				case 4:
					int op1 = 0;
					while(op != 4) {
						System.out.println("1 - Código da peça");
						System.out.println("2 - Nome da peça");
						System.out.println("3 - Valor unitário");
						System.out.println("4 - voltar para o menu");
						
						
					}
						
					break;
			}
			
		}
		

	}

}
