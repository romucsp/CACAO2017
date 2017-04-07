package abstraction.producteur.ameriquelatine;

import abstraction.fourni.v0.IProducteur;

public class Producteur implements IProducteur {
	private String nom;
	private Stock stock;
	
	public Producteur(String nom,Stock stock){
		this.nom=nom;
		this.stock=stock;
	}

	@Override
	public double quantiteMiseEnVente() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void notificationVente(double quantite) {
		// TODO Auto-generated method stub

	}

}
