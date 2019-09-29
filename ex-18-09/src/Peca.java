
public class Peca {
	private int cod_peca;
	private String desc_peca;
	private int qtde_estoque;
	private float valor_unit;
	private int est_minimo;
	
	private int contador = 0;
	public int getCod_peca() {
		return cod_peca;
	}
	
	public String getDesc_peca() {
		return desc_peca;
	}
	public void setDesc_peca(String desc_peca) {
		this.desc_peca = desc_peca;
	}
	public int getQtde_estoque() {
		return qtde_estoque;
	}
	public void setQtde_estoque(int qtde_estoque) {
		this.qtde_estoque = qtde_estoque;
	}
	public float getValor_unit() {
		return valor_unit;
	}
	public void setValor_unit(float valor_unit) {
		this.valor_unit = valor_unit;
	}
	public int getEst_minimo() {
		return est_minimo;
	}
	public void setEst_minimo(int est_minimo) {
		this.est_minimo = est_minimo;
	}
	public Peca( String desc_peca, int qtde_estoque, float valor_unit, int est_minimo) {
		this.cod_peca = contador++;
		this.desc_peca = desc_peca;
		this.qtde_estoque = qtde_estoque;
		this.valor_unit = valor_unit;
		this.est_minimo = est_minimo;
	}
	
	public Peca() {}
}
