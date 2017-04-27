package abstraction.transformateur.usa;

public class Tresorerie {
	
	private double comptecourant;
	
	public Tresorerie(){
		this.comptecourant=0;
	}
	
	public Tresorerie(double treso){
		this.comptecourant=treso;
	}
	public void setCompteCourant(double comptecourant){
		this.comptecourant=comptecourant;
	}
	
	public double getCompteCourant(){
		return this.comptecourant;
	}

}
