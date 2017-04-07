package abstraction.transformateur.europe;

public class EchangesDistributeurs {

	private double prixmin;
	
	public EchangesDistributeurs(double prixmin){
		this.prixmin=prixmin;
	}
	
	public double getPrixmin(){
		return this.prixmin;
	}
	
	public void setPrixmin(double prixmin){
		this.prixmin=prixmin;
	}
}
