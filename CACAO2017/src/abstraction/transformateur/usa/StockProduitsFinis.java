package abstraction.transformateur.usa;

public class StockProduitsFinis {

	/**
	 * @author Arthur Prager
	 */
	/* modif souchu*/
	private double Chocolat;

	public StockProduitsFinis (double chocolat){
		this.Chocolat=chocolat;
	}

	public double getStockChocolat(){
		return this.Chocolat;
	}

	public void setStockChocolat(double chocolat){
		this.Chocolat=chocolat;
	}

	public void rajouterChoco(double chocolat){
		this.Chocolat+=chocolat;
	}

	public void enleverChoco(double chocolat){
		this.Chocolat-=chocolat;
	}

}
