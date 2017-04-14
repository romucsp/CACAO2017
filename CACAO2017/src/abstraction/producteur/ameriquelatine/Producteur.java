package abstraction.producteur.ameriquelatine;

import abstraction.fourni.v0.IProducteur;

public class Producteur implements IProducteur {
	private String nom;
	private Stock stock;
	private int qtemiseenvente;
	private double qtevendue;
	private double coursActuel;
	
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
	public void setQtevendue(double quantite){
		this.qtevendue=quantite;
	}
	public void setCoursActuel(double coursActuel){
		this.coursActuel=coursActuel;
	}

	public void notificationVente(double quantite,double coursActuel) {
		this.setQtevendue(quantite);
		this.setCoursActuel(coursActuel);

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
