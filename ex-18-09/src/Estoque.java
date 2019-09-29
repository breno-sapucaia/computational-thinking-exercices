
public class Estoque {
	private int length;
	private static Peca[] pecas;
	
	public void setTamanhoEstoque(int length){
		pecas = new Peca[length];
	}
	public static void adicionar(Peca peca) {
		for(int i =0; i<pecas.length; i++) {
			if(pecas[i] ==null) {
				pecas[i] = peca;
				break;
			}
		}
	}
}	
