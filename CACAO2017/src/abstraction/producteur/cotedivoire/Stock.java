package abstraction.producteur.cotedivoire;

import java.util.ArrayList;
import abstraction.fourni.v0.Producteur;
import abstraction.fourni.v0.Transformateur; 

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
	
	//Accesseur permettant de mettre à jour le stock après un next
	public void setStock(double stock){ 
		this.stock += stock; //A modifier en ajoutant la notification de vente
	}
}
