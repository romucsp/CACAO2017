package abstraction.producteur.cotedivoire;

import java.util.ArrayList;

import abstraction.fourni.v0.Producteur;
import abstraction.fourni.v0.Transformateur; 

public class Stock{
	private ArrayList<Integer> stockinitial;  
	private ArrayList<Integer> production; 
	private ArrayList<Integer> stockfinal; 
	
	public void addStockInitial(int stocki) {
		this.stockinitial.add(stocki); 
	}
	
	public void addStockFinal(int stockf) {
		this.stockfinal.add(stockf);
	}
	
	public Stock(){ 
		this.stockinitial= new ArrayList<Integer>(); 
		this.production = new ArrayList<Integer>(); 
		this.stockfinal = new ArrayList<Integer>(); 
	}

	public ArrayList<Integer> getStockinitial() {
		return this.stockinitial;
	}

	public ArrayList<Integer> getProduction() {
		return this.production;
	}

	public void setStockfinal(ArrayList<Integer> stockfinal) {
		this.stockfinal = stockfinal;
	}
	
}
