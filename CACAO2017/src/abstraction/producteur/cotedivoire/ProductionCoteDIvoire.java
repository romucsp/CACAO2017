package abstraction.producteur.cotedivoire;

import abstraction.fourni.Acteur;
import abstraction.fourni.v0.IProducteur;
import java.util.ArrayList; 

// modifié by fcadre, comments by antoineroson

public class ProductionCoteDIvoire implements Production{
	private int productionmoyenne; // Production moyenne de la cote d'ivoire
	private ArrayList<Integer>  productions; //Liste des productions par périodes
	private int quantiteProduite; // ????
	private int quantiteAchetable; // ????
	
	//Cf marché
	public int hashCode() {
		return this.getNom().hashCode();
	}
	
	//Constructeur Production cote d'ivoire
	public ProductionCoteDIvoire(int prodmoy, ArrayList<Integer> prods, int qtprod, int qtach){ 
		this.productionmoyenne=prodmoy;
		this.productions = prods; 
		this.quantiteProduite = qtprod; 
		this.quantiteAchetable = qtach;
	}
	
	//Accesseur Production moyenne
	public int getProductionmoyenne(){ 
		return this.productionmoyenne; 
	}
	
	//Accesseur liste de production
	public ArrayList<Integer> getProductions(){
		return this.productions; 
	}
	
	//Accesseur quantité produite
	public int getQuantiteProd(){ 
		return this.getProductions().get(this.productions.size());   // Récupére la dernière production sur la période
	}
	
	//Accesseur Quantité Achetable
	public int getQuantiteAch(){ 
		return this.getQuantiteProd(); //V1: Quantité achetable = Quantité produite
		/// A voir pour le stock ....!
	}
	
	// Méthode varitation random de la production
	public void variationProduction(){
		double variation = 0.10;  //Variation de +- 10% 
		//Création d'une enveloppe (prod_min->prod_max)
		int prod_min = this.getProductionmoyenne() - (int)(this.getProductionmoyenne()*variation); 
		int prod_max = this.getProductionmoyenne() + (int)(this.getProductionmoyenne()*variation);
		int prod = prod_min + (int)Math.random()*(prod_max - prod_min); // Production random entre prod_min et prod_max
		productions.add(prod); // ajout dans la liste de production
	}
	
	//Accesseur Nom
	public String getNom() {
		return "Production Cote d'Ivoire"; 
	}
	
	//NEXT "Centre du programme -> Passage à la période suivante" 
	
	public void next() {
		// TODO Auto-generated method stub
	}
	
}
