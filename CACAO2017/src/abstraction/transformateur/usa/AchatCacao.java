package abstraction.transformateur.usa.tresorie;

import abstraction.transformateur.usa.*;

public class AchatCacao {
	private double qtesouhaite;
	private double budget;
	private int datecommande; 
	
	
	
	public AchatCacao(int b, int d){
		this.qtesouhaite=50000000 - StockMatPremiere. ;
		this.budget=b;
		this.datecommande=d;
	}
	
	public double getqtesouhaite(){
		return this.qtesouhaite;
	}
	public double getbudget(){
		return budget;
	}
	public int getdateco(){
		return this.datecommande;
	}
	
	public void setqte(double q){
		this.qtesouhaite = q;
	}
	
	public void setbudget(double b){
		this.budget = b;
	}
	
	public void setdate(int d){
		this.datecommande=d;
	}
	
	
	
	

}
