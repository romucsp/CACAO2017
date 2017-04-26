
package abstraction.producteur.ameriquelatine;

import abstraction.fourni.Monde;
import abstraction.fourni.v0.Constantes;

public class Producteur implements IProducteur {
	public String nom;
	private GestionVentes ventes;
	private Tresorerie treso;
	private double qtemiseenvente;
	private double coursActuel;
	private double qtevendue;
	
	public Producteur(String nom, GestionVentes ventes){
		this.nom=nom;
		this.ventes=ventes;
		this.qtemiseenvente=ventes.quantiteMiseEnVente();

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

	public void setQtemiseenvente(double qte){
		this.qtemiseenvente=qte ;
	}

	public void notificationVente(double quantite, double coursActuel) {
		//this.Treso.setTresorerie(this.Treso.getTresorerie()+coursActuel*quantite);
		this.setCoursActuel(coursActuel);// TODO Auto-generated method stub
		this.ventes.setQuantiteVendue(quantite);
			
	}
	@Override
	public double quantiteMiseEnvente() {
		return this.qtemiseenvente;
	}
	
	public void next() {
		double Avendre = 100 ;
		setQtemiseenvente(Avendre) ;
	}
}
