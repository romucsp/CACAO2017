package abstraction.producteur.cotedivoire;

import abstraction.fourni.Acteur;
import abstraction.fourni.v0.IProducteur;
import java.util.ArrayList; 

// modifié by fcadre

public class ProductionCoteDIvoire implements Production{
	private int productionmoyenne; 
	private ArrayList<Integer>  productions; 
	private int quantiteProduite; 
	private int quantiteAchetable; 
	
	public int hashCode() {
		return this.getNom().hashCode();
	}
	public ProductionCoteDIvoire(int prodmoy, ArrayList<Integer> prods, int qtprod, int qtach){ 
		this.productionmoyenne=prodmoy;
		this.productions = prods; 
		this.quantiteProduite = qtprod; 
		this.quantiteAchetable = qtach;
	}
	
	public int getProductionmoyenne(){ 
		return this.productionmoyenne; 
	}
	
	public ArrayList<Integer> getProductions(){
		return this.productions; 
	}
	
	public int getQuantiteProd(){ 
		return this.getProductions().get(this.productions.size());  
	}
	
	public int getQuantiteAch(){ 
		return this.getQuantiteProd();
	}
	
	public void variationProduction(){
		double variation = 0.10; 
		int prod_min = this.getProductionmoyenne() - (int)(this.getProductionmoyenne()*variation); 
		int prod_max = this.getProductionmoyenne() - (int)(this.getProductionmoyenne()*variation);
		int prod = prod_min + (int)Math.random()*(prod_max - prod_min); 
		productions.add(prod); 
	}
	
	public String getNom() {
		return "Production Cote d'Ivoire"; 
	}
	public void next() {
		// TODO Auto-generated method stub
	}
	
}
