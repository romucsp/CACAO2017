package abstraction.transformateur.usa;
//Mehdi, modif arthur


public class AchatCacao {
	private double qtesouhaite;
	private int datecommande; 
	
	
	
	public AchatCacao(double qtesouhaite,int datecommande){
		this.qtesouhaite=qtesouhaite;
		this.datecommande=datecommande;
	}
	
	public double getqtesouhaite(){
		return this.qtesouhaite;
	}

	public int getdateco(){
		return this.datecommande;
	}
	
	public void setqte(double qtesouhaite){
		this.qtesouhaite = qtesouhaite;
	}
	

	public void setdate(int datecommande){
		this.datecommande=datecommande;
	}
	
		
	
		
		
	}
	
	
	
	
	
	


