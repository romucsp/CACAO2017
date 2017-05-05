package abstraction.producteur.cotedivoire;

import java.util.ArrayList;
import abstraction.fourni.v0.Producteur;
import abstraction.fourni.v0.Transformateur; 

// by fcadre 

public class Stock{
	
	private int stock; 
	
	public Stock(int stock){ 
		this.stock= stock;  
	}

	//Accesseur permettant de connaitre la quantité dans le stock à l'origine 
	public int getStock(){ 
		return this.stock; 
	}
	
	public void setStock(){ 
		this.stock += stock; 
	}
}
