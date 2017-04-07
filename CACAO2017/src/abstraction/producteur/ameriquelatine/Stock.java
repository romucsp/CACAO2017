package abstraction.producteur.ameriquelatine;

public class Stock {
	private int initial;
	private int vente;
	private int production;
	private int cout;
	
	public Stock(int initial, int vente, int production, int cout) {
		this.initial = initial;
		this.vente = vente;
		this.production = production;
		this.cout = cout;
	}
	
	public Stock() {
		this( 0, 0, 0, 0);
	}
	
	public int getInitial() {
		return this.initial;
	}
	public int getVente() {
		return this.vente;
	}
	public int getProduction() {
		return this.production;
	}
	public int getCout() {
		return this.cout;
	}
}
