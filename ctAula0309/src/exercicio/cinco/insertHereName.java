package exercicio.cinco;

public class insertHereName {
	
	public static String[] produtos = null;
	public static String[] lojas = null;
	public static boolean cadprod= false,cadloja= false;
	public static double[][] precos = null;
	
	
	public void CadastrarProdutos() {
		produtos = new String[] {"Carro","Moto","Volante","Banco","Airbag"};
		cadprod = true;
	}
	
	public void CadastrarLojas() {
		lojas = new String[] {"FIAT","HYUNDAI","VOLKSWAGEN","CHEVROLET","FORD","TOYOTA"};
		cadloja = true;
	}
	
	public void CadastrarPrecos() {
		if(cadprod && cadloja) {
			precos = new double[lojas.length][produtos.length];
			
			
			
		}
	}
}
