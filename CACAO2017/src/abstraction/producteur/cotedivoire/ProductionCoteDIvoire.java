package abstraction.producteur.cotedivoire;

// modifié by fcadre

public class ProductionCoteDIvoire {
	private int production; 
	private int prod_min; 
	private int prod_max; 
	
	public ProductionCoteDIvoire(int prod, int prodmin,int prodmax){ 
		this.production=prod;
		this.prod_min=prodmin; 
		this.prod_max=prodmax; 
	}
	public ProductionCoteDIvoire(){ 
		this(1500000, 13000000, 1700000); 
	}
}
