package abstraction.intermediaireEurope;

public class TransformateurEurope {

	private double prixmin;
	
	public TransformateurEurope(double prixmin){
		this.prixmin=prixmin;
	}
	
	public double getPrixmin
}


package abstraction.intermediaireEurope;

public class Stock {

	private double stockcacao;
	private double stockchocolat;
	
	public Stock(double stockcacao,double stockchocolat){
		this.stockcacao=stockcacao;
		this.stockchocolat=stockchocolat;
	}
	
	public double getstockcacao(){
		return this.stockcacao;
	}
	
	public double getstockchocolat(){
		return this.stockchocolat;
	}
	
	public void setstockcacao(double stockcacao){
		this.stockcacao=stockcacao;
	}
	
	public void setstockchocolat(double stockchocolat){
		this.stockchocolat=stockchocolat;
	}
	
	public String toString(){
		return "stock de cacao: "+this.stockcacao+"   stock de chocolat: "+this.stockchocolat;
	}
	
	
}


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


