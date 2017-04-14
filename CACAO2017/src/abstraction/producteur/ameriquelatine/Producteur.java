package abstraction.producteur.ameriquelatine;



public class Producteur implements IProducteur {
	private String nom;
	private Stock stock;
	private int qtemiseenvente;
	private double coursActuel;
	private double qtevendue;
	
	public Producteur(Stock stock){
		this.nom="Amerique Latine";
		this.qtemiseenvente=12;
		
	

	}
	public String getNom(){
		return this.nom ;
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
	

	public void notificationVente(double quantite, double coursActuel) {
		this.setQtevendue(quantite);
		this.setCoursActuel(coursActuel);// TODO Auto-generated method stub
			
	}
	@Override
	public double quantiteMiseEnvente() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
