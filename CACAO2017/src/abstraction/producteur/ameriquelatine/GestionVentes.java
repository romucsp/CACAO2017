package abstraction.producteur.ameriquelatine;
//modifié et créé par lolotteisyoung 14/04/2017

public class GestionVentes {
// renvoie les ventes
	private Stock stock;
	private double quantiteVendue;
	
	public GestionVentes(){
		this.quantiteVendue=0;
	}
	
	public int quantiteMiseEnVente(){
		return (int)(0.8*stock.stockintermediaire());
	}
	
	public double getQuantiteVendue(){
		return this.quantiteVendue;
	}
	public void setQuantiteVendue(double qteVendue){
		this.quantiteVendue=qteVendue;
	}
}