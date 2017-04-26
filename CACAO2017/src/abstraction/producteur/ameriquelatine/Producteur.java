
package abstraction.producteur.ameriquelatine;

import abstraction.fourni.Monde;
import abstraction.fourni.v0.Constantes;

public class Producteur implements IProducteur {
	public String nom;
	private GestionVentes ventes;
	private Tresorerie treso;
	private double coursActuel;
	private double qtevendue;
	private Stock stock ;
	private Recolte recolte ;
	
	public Producteur(){
		this.nom="Producteur Amerique";
		this.ventes=new GestionVentes(stock);
		this.recolte=new Recolte(0.5) ;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public int hashCode() {
		return this.getNom().hashCode() ;
	}


	public void setCoursActuel(double coursActuel){
		this.coursActuel=coursActuel;
	}
	public void setQtevendue(double qte){
		this.qtevendue=qte;
	}
	public double getQteVendue(){
		return this.qtevendue;
	}


	public void notificationVente(double quantite, double coursActuel) {
		this.treso.setTresorerie(this.treso.getTresorerie()+coursActuel*quantite);
		this.setCoursActuel(coursActuel);
		this.ventes.setQuantiteVendue(quantite);
	}
	
	public double quantiteMiseEnvente() {
		return this.ventes.getQuantiteMiseEnVente();
	}
	
	public void next() {
		stock.miseAJourStock() ;
		recolte.miseAJourIndice();
	}
}
