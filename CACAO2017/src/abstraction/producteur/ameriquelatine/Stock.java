package abstraction.producteur.ameriquelatine;

public class Stock {
	private int initial;
	private int vente;
	private int production;
	private int cout;
	private Recolte recolte;
	
	public Stock(int initial, int vente, int production, int cout, Recolte recolte) {
		this.initial = recolte.getQterecoltee();
		this.vente = vente;
		this.production = production;
		this.cout = cout;
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
	public void setInitial ( int initial) {
		this.initial=initial;
	}
	public void setVente (int vente) {
		this.vente=vente;
	}
	public void setProduction (int production) {
		this.production=production;
	}
	public void setCout (int cout) {
		this.cout=cout;
	}
	public String toString() {
		return "Le stock initial est de"+ this.initial+ 
				"; "+ this.vente +"ont été vendus"+
				"; "+ this.production + "ont été produits"+
				"; le cout de stockage est de" + this.cout;
	}
	
	
	//modidifié et créé par swerne16
}
