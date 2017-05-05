
package abstraction.producteur.ameriquelatine;
//26/04 Adrien

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
		this.nom="Producteur AmeriqueLatine" ;
		this.recolte=new Recolte(0.8) ;
		this.stock=new Stock(recolte) ;
		this.ventes=new GestionVentes(stock) ;
		stock.setGestionVente(ventes) ; // Pq? 
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
		stock.miseAJourStock() ; //mise à jour du stock
		recolte.miseAJourIndice(); //mise à jour de l'indice de recolte
	}
}
