package abstraction.producteur.cotedivoire;

import abstraction.fourni.Acteur;
import abstraction.fourni.v0.IProducteur;

// modifié by fcadre

public class ProductionCoteDIvoire implements Acteur, IProducteur{
	private int production; 
	private int prod_min; 
	private int prod_max; 
	
	public ProductionCoteDIvoire(int prod, int prodmin,int prodmax){ 
		this.production=prod;
		this.prod_min=prodmin; 
		this.prod_max=prodmax; 
	}
	
	public void setProd(int p){ 
		this.production=p;
	}
	
	public void setProdMin(int pm){
		this.prod_min=pm;
	}
	
	public void setProdMax(int pma){
		this.prod_max=pma;
	}
	
	public int getProd(){
		return this.production;
	}
	
	public int getProdMin(){
		return this.prod_min;
	}
	
	public int getProdMax(){
		return this.prod_max;
	}
	
	public double quantiteMiseEnVente() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void notificationVente(double quantite) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void next() {
		// TODO Auto-generated method stub
	}
}
