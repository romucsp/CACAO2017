package abstraction.producteur.ameriquelatine;
//modidifié et créé par swerne16
	// 07/04/2017 modifié par lolotteisyoung
	// 14/04/17 modifié par lolotteisyoung et AnaisBel
public class Stock {
	
// tout ce qui est produit est stocké, on gère les ventes à partir des stocks.
	private int initial; //stock initial
	public final static double COUT=0.3; //coût du stockage 
	private Recolte recolte; //récolte de la période
	private Producteur producteur;
	private int stock; 
	
	
	public Stock(Producteur producteur, Recolte recolte) {
		this.producteur=producteur;
		this.stock=(int)(this.initial+this.recolte.getQterecoltee()-this.producteur.getQteVendue());
	}
	public Stock(){
		initial=10000;
		}
	
	public int getInitial() {
		return this.initial;
	}
	
	public void setInitial ( int initial) {
		this.initial=initial;
	}
	
	public String toString() {
		return "Le stock initial est de"+ this.initial+ 
				"; le cout de stockage est de" + COUT;
	}
	
	
	
}
