package abstraction.producteur.cotedivoire;

import java.util.ArrayList; 

public interface Production {
	public int getProductionmoyenne(); 
	public ArrayList<Integer> getProductions(); 
	public int getQuantiteProd(); 
	public int getQuantiteAch();
	public void variationProduction(); 
	public String getNom(); 
	public void next(); 
	
}
