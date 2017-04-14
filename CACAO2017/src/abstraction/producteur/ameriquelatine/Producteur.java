package abstraction.producteur.ameriquelatine;



public class Producteur implements IProducteur {
	private String nom;
	private Stock stock;
	//private int qtemiseenvente;
	private double qtevendue;
	private double coursActuel;
	
	public Producteur(Stock stock){
		this.nom="Amerique Latine";
		
	}
	public String getNom(){
		return this.nom ;
	}
	
	public int hashCode() {
		return this.getNom().hashCode() ;
	}


	public void setQtevendue(double quantite){
		this.qtevendue=quantite;
	}
	public void setCoursActuel(double coursActuel){
		this.coursActuel=coursActuel;
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
