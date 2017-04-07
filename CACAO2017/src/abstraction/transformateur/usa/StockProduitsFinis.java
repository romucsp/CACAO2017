package abstraction.transformateur.usa;

public class StockProduitsFinis {

	/**
	 * @author Arthur Prager
	 */
	/* modif souchu*/
	private int Chocolat;

	public StockProduitsFinis (int chocolat){
		this.Chocolat=chocolat;
	}

	public int getStockChocolat(){
		return this.Chocolat;
	}

	public void setStockChocolat(int chocolat){
		this.Chocolat=chocolat;
	}

	public void rajouterChoco(int chocolat){
		this.Chocolat+=chocolat;
	}

	public void enleverChoco(int chocolat){
		this.Chocolat-=chocolat;
	}

}
