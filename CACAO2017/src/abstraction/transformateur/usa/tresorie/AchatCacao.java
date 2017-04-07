package abstraction.transformateur.usa.tresorie;

public class AchatCacao {
	private double qtesouhaite;
	private double budget;
	private int datecommande; 
	
	
	
	public AchatCacao(int q, int b, int d){
		this.qtesouhaite=q;
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
