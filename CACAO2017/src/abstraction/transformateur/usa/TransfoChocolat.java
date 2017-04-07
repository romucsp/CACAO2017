package abstraction.transformateur.usa;
public class TransfoChocolat {
	
	private StockMatPremiere premiere;
	private StockProduitsFinis finis;
	private double[] recette;
	private double[] demande;
	private double[] stocks;
	private boolean suffisant;
	/*souchu*/
	public TransfoChocolat( StockMatPremiere premiere,StockProduitsFinis finis){
		this.finis=finis;
		this.premiere=premiere;
		recette[0]=0.6;
		recette[1]=0.15;
		recette[2]=0.2;
		recette[3]=0.05;
		stocks[0]=premiere.getCacao();
		stocks[1]=premiere.getLait();
		stocks[2]=premiere.getSucre();
		stocks[3]=premiere.getLecitine();
	}
	
	public void produireChoco(double quantité){
		suffisant=true;
		for (int i=0;i<recette.length;i++){
			demande[i]=recette[i]*quantité;
		}
		for (int i=0;i<recette.length;i++){
			if(demande[i]>stocks[i]){
				suffisant=false;
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	

}
