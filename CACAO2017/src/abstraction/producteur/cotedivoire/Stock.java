package abstraction.producteur.cotedivoire;


// by fcadre 

public class Stock{
	
	private double stock; 
	
	public Stock(double stock){ 
		this.stock= stock;  
	}

	//Accesseur permettant de connaitre la quantité dans le stock à l'origine 
	public double getStock(){ 
		return this.stock; 
	}
	
	public void addStock(double stock){ 
		this.stock += stock; 
	}
}
