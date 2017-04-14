package abstraction.producteur.ameriquelatine;



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

	@Override
	public double quantiteMiseEnVente() {
		this.qtemiseenvente=stock.getVente();
		return this.qtemiseenvente;
	}

	public void notificationVente(double quantite, double coursActuel) {
		this.setQtevendue(quantite);
		this.setCoursActuel(coursActuel);// TODO Auto-generated method stub
			
	}
	

}
