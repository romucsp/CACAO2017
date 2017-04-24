package abstraction.transformateur.usa;
//Mehdi


public class AchatCacao {
	private double qtesouhaite;
	private int datecommande; 
	
	
	
	public AchatCacao(double q,double b, int d){
		this.qtesouhaite=q ;

		this.datecommande=d;
	}
	
	public double getqtesouhaite(){
		return this.qtesouhaite;
	}

	public int getdateco(){
		return this.datecommande;
	}
	
	public void setqte(double q){
		this.qtesouhaite = q;
	}
	

	public void setdate(int d){
		this.datecommande=d;
	}
	
		
	
		
		
	}
	
	
	
	
	
	


