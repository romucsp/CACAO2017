package abstraction.intermediaireEurope;

public class Distributeur {

	private double prixmax;  //prix maximun auquel achetera le distributeur 1
	private double prixmin;  //prix maximun auquel achetera le distributeur 2
	
	public Distributeur(double prixmax, double prixmin){
		this.prixmax=prixmax;  
		this.prixmin=prixmin;  
	}
	
	public double getprixmax(){
		return this.prixmax;
	}
	
	public double getprixmin(){
		return this.prixmin;
	}
	
	public void setprixmax(double prixmax){
		this.prixmax=prixmax;
	}
	
	public void setprixmin(double prixmin){
		this.prixmin=prixmin;
	}
	
	public String toString(){
		return " "+this.prixmax+" , "+prixmin+" ";
	}
	
	public boolean equals(Object o){
		if (o==null) {
			return false;
		}
		if (o instanceof Distributeur){
			Distributeur dist= (Distributeur) o;
			return (dist.prixmax==this.prixmax && dist.prixmin==this.prixmin);
		}
		return false;
	}
}

