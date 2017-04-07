package abstraction.transformateur.europe;

public class EchangesDistributeurs {

	private double prixmin;     //prix minimum fixé par nous pour ne pas vendre a perte
	private double prixachat;	//prix souhaité par le distributeur 
	private double a;			//facteur a déterminé pour la régression linéaire du prixmin en fonction des stocks restant, du prix du cacao etc.
	private double b; 			// idem
	
	public EchangesDistributeurs(double prixmin){
		this.prixmin=prixmin;
	}
	
	public double getPrixmin(){
		if (this.prixmin>prixachat){
			return 10000;
		}
		else{
			this.prixmin=a*this.prixmin+b;
			return this.prixmin;
		}
	}
	
	public void setPrixmin(double prixmin){
		this.prixmin=prixmin;
	}
	
	
}
