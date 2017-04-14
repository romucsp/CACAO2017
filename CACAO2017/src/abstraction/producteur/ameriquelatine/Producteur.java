package abstraction.producteur.ameriquelatine;

import abstraction.fourni.v0.IProducteur;

public class Producteur {
	private String nom;
	private Stock stock;
	private int qtemiseenvente;
	
	public Producteur(Stock stock){
		this.nom="Amerique Latine";
		this.qtemiseenvente=stock.getProduction();
	}
	public String getNom(){
		return this.nom ;
	}
	
	public int hashCode() {
		return this.getNom().hashCode() ;
	}

	public int Qtemiseenvente(){
		return qtemiseenvente;
	}

	public void notificationVente(double quantite) {
		

	}

}
