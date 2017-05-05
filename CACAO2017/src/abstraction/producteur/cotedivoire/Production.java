package abstraction.producteur.cotedivoire;

import java.util.ArrayList; 

/**
 * Interface Production
 * Edited by fcadre
 * Commentaires Antoine
 *
 */

public interface Production {
	public int getProductionmoyenne();    // Accesseur production moyenne
	public ArrayList<Integer> getProductions();    //Accesseur liste de production
	public int getQuantiteProd();   //Accesseur quantité produite
	public int getQuantiteMiseEnVente();  // Accesseur quantité achetable
	public void variationProduction();   //Methode variation de production
	public String getNom(); 	//Accesseur nom producteur
	public void next();  // Méthode next
	
}
