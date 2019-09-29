import java.util.Scanner;

public class Ex2 {
	public static void execute() {
		int c = 5;
		int l = 6;
		int codProduto[] = new int[c];
		String nome[] = new String[c];
		Scanner read = new Scanner(System.in);
		boolean duplicado = false;
		boolean lotado = false, entupido = false, entalado = false;
		int f = 0;
		String lojass[] = new String[l];
		double precos[][] = new double[l][c];
		
		while (f != 6) {
			System.out.println(" 1 - cadastrar produtos");
			System.out.println(" 2 - cadastrar lojas");
			System.out.println(" 3 - cadastrar pre�os");
			System.out.println(" 4 - Procurar menor pre�o de produto");
			System.out.println(" 5 - Listar todos os produtos cadastros");
			System.out.println(" 6 - Sair");

			f = read.nextInt();
			read.nextLine();
			switch (f) {
			case 1:
				if (!lotado) {
					for (int i = 0; i < c; i++) {
						int x;
						do {
							duplicado = false;
							System.out.print("Digite o cod do " + (i + 1) + "� produto: \n");

							x = read.nextInt();
							if (i == 0) {
								codProduto[i] = x;
							} else {
								for (int j = 0; j < c; j++) {
									if (x == codProduto[j]) {
										duplicado = true;
										System.out.println("c�digo j� existente, digite novamente");
									}
								}
							}
						} while (duplicado);
						codProduto[i] = x;
						System.out.println("Digite a descri��o do produto");
						read.nextLine();
						String u = read.nextLine();
						nome[i] = u;
					}
					lotado = true;
				} else {
					System.out.println("OP��O INV�LIDA. TODOS OS PRODUTOS FORAM CADASTRADOS.");
				}

				break;
			case 2:
				if (!entupido) {
					for (int i = 0; i < l; i++) {
						System.out.println("Digite o nome da " + (i + 1) + "� loja");
						lojass[i] = read.nextLine();
					}
					entupido = true;
				} else {
					System.out.println("OP��O INV�LIDA. TODOS AS LOJAS FORAM CADASTRADAS.");
				}
				break;
			case 3:
				if (!entupido) {
					System.out.println("NECESS�RIO CADASTRAR A DESCRI��O DAS LOJAS NA OP��O 2.");
				} else if (!lotado) {
					System.out.println("NECESS�RIO CADASTRAR OS PRODUTOS NA OP��O 1.");
				} else if(!entalado){
					//int c = 5;
					//int l = 6;
					for (int i = 0; i < l; i++) {
						for (int j = 0; j < c; j++) {
							double valor;
							do {
								System.out.println("Digite o valor do produto " + nome[j] + " da loja " + lojass[i]);
								valor = read.nextDouble();
								if (valor <= 0) {
									System.out.println("valor inv�lido digite novamente");
								}
							} while (valor <= 0);
							precos[i][j] = valor;
						}
					}
					entalado = true;
				}else {
					System.out.println("OP��O INV�LIDA. TODOS OS PRE�OS FORAM CADASTRADOS.");
				}
				
				break;
			case 4:
				boolean acho = false;
				int index = 0;
				while (!acho) {
					System.out.println("Qual o c�digo do produto?");
					int cod = read.nextInt();
					read.nextLine();
					
					for (int i = 0; i < c; i++) {
						if (cod == codProduto[i]) {
							acho = true;
							index = i;
							break;
						} else {
							acho = false;
						}
					}
					if (!acho) {
						System.out.println("c�digo n�o existe, digite novamente");
					} else {
						break;
					}
				}
				double menorPreco = 0;
				String menorLoja = "";

				for (int i = 0; i < l; i++) {
					if (menorPreco == 0) {
						menorPreco = precos[i][index];
						menorLoja = lojass[i];
					}

					if (precos[i][index] < menorPreco) {
						menorPreco = precos[i][index];
						menorLoja = lojass[i];
					}
				}
				System.out.println("O " + nome[index] + " foi encontrado na " + menorLoja + " por R$" + menorPreco);

				break;
			case 5: 
				if(!lotado) {
					System.out.println("Preencha todos os produtos 1�");
				}else {
					for(int i = 0; i < c; i++) {
						System.out.println("c�digo: "+codProduto[i] +"  -  -  produto:"+nome[i]);
					}
				}
				break;
			case 6:
				System.out.println("voc� saiu.");
				break;
			default:
				System.out.println("Tu � burro ou qu� um reales?");
				break;
			}
		}

	}
}
