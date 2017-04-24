package abstraction.producteur.cotedivoire;

import java.util.ArrayList;
import abstraction.fourni.v0.Producteur;
import abstraction.fourni.v0.Transformateur; 

public class Stock implements IStock{
	
	private int stock; 
	
	public Stock(int stock){ 
		this.stock= stock;  
	}

	public int getStock(){ 
		return this.stock; 
	}
	
	public void setStock(int stock){ 
		this.stock = stock; //A modifier en ajoutant la notification de vente
	}
}
