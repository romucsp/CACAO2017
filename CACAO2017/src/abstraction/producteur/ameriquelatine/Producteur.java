package abstraction.producteur.ameriquelatine;

import abstraction.fourni.v0.IProducteur;

public class Producteur {
	private String nom;
	private Stock stock;
	private int Qtemiseenvente;
	
	public Producteur(Stock stock){
		this.nom="Amerique Latine";
		this.Qtemiseenvente=stock.getProduction();
	}

	public int Qtemiseenvente(){
		return Qtemiseenvente;
	}

	public void notificationVente(double quantite) {
		

	}

}
