package abstraction.producteur.ameriquelatine;
//modidifié et créé par swerne16
	// 07/04/2017 modifié par lolotteisyoung
	// 14/04/17 modifié par lolotteisyoung et AnaisBel
public class Stock {
	
// tout ce qui est produit est stocké, on gère les ventes à partir des stocks.
	private int initial; //stock initial
	private Recolte recolte; //récolte de la période
	private GestionVentes vente;
	

	public Stock() {
		this.initial=1000;
	}
	
	public void miseAJourStock(Recolte recolte) {
		this.initial=(int)(this.initial+recolte.getQterecoltee()-this.vente.getQuantiteVendue());
	}
	public int stockintermediaire(){
		return this.initial+recolte.getQterecoltee();
	}
	
}


	
	
	

