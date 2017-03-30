package abstraction.transformateur.groupe5;

import abstraction.transformateur.groupe5.tresorie.*;

public class TransfoChocolat {
	
	private StockMatPremiere stock;
	private Achat cacao;
	
	
	public TransfoChocolat( StockMatPremiere s, Achat c, Vente v){
		this.stock = s;
		this.cacao= c;
		
	}
	
	
	public StockMatPremiere getstock(){
		return stock;
	}
	
	public Achat getAchatcacao(){
		return cacao;
	}
	
	
	public int getProduction(){
		int p = 0;
		return p;
	}
	
	
	
	
	
	
	
	
	

}
