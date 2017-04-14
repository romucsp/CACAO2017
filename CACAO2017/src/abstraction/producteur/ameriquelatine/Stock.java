package abstraction.producteur.ameriquelatine;
//modidifié et créé par swerne16
	// 07/04/2017 modifié par lolotteisyoung
	// 14/04/17 modifié par lolotteisyoung et AnaisBel
public class Stock {
// tout ce qui est produit est stocké, on gère les ventes à partir des stocks.
	private int initial; //stock initial
	private int vente; // quantité à vendre 
	private int production; // quantité produite 
	private int cout; //coût du stockage 
	private Recolte recolte; //récolte de la période
	
	public Stock(int initial, int vente, int cout, Recolte recolte) {
		this.initial = initial;
		this.vente = vente;
		this.production = recolte.getQterecoltee();
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
	
	
	
}
