package abstraction.transformateur.usa.tresorie;

public class AchatCacao {
	private int qtesouhaite;
	private int budget;
	private int datecommande; 
	
	
	
	public AchatCacao(int q, int b, int d){
		this.qtesouhaite=q;
		this.budget=b;
		this.datecommande=d;
	}
	
	public int getqtesouhaite(){
		return this.qtesouhaite;
	}
	public int getbudget(){
		return budget;
	}
	public int getdateco(){
		return this.datecommande;
	}
	

}
