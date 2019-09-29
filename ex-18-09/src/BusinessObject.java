
public class BusinessObject {
	public static void cadastrar(String desc_peca,int qtde_estoque,float valor_unit,int est_minimo) {
		// implementar possiveis validações
		Peca peca = new Peca(desc_peca,qtde_estoque,valor_unit,est_minimo);
		PopularEstoque(peca);
	}
		
	private static void PopularEstoque(Peca peca) {
		Estoque.adicionar(peca);
	}
}
