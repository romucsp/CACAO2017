package abstraction.transformateur.groupe5;

public class StockProduitsFinis {
	
/**
 * @author Arthur Prager
 */
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

}
