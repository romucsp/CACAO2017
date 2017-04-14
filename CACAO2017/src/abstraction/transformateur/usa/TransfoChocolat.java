package abstraction.transformateur.usa;
public class TransfoChocolat {
	
	private StockMatPremiere premiere;
	private StockProduitsFinis finis;
	private double[] recette =new double[4];
	private double[] demande=new double[4];
	private double[] stocks=new double[4];

	/*souchu*/
	public TransfoChocolat( StockMatPremiere premiere,StockProduitsFinis finis){
		this.finis=finis;
		this.premiere=premiere;
		recette[0]=0.6;
		recette[1]=0.15;
		recette[2]=0.2;
		recette[3]=0.05;
		
	}
	
	private void lireStock(){
		stocks[0]=premiere.getCacao();
		stocks[1]=premiere.getLait();
		stocks[2]=premiere.getSucre();
		stocks[3]=premiere.getLecitine();
	}
	
	public void produireChoco(double quantité){	
		lireStock();
		boolean suffisant=true;
		double maxmanque=0;
		for (int i=0;i<recette.length;i++){
			demande[i]=recette[i]*quantité;
		}
		for (int i=0;i<recette.length;i++){
			if(demande[i]>stocks[i]){
				suffisant=false;
			}
		}
		if (suffisant){
			for (int i=0;i<recette.length;i++){
				stocks[i]-=demande[i];
			}
			finis.rajouterChoco(quantité);
		}
		else{
			for (int i=0;i<recette.length;i++){
				if((demande[i]-stocks[i])/demande[i]>maxmanque){
					maxmanque=(demande[i]-stocks[i])/demande[i];
				}
			}
			for (int i=0;i<recette.length;i++){
				stocks[i]=stocks[i]-demande[i]*(1-maxmanque);
			}
			finis.rajouterChoco(quantité*(1-maxmanque));
		}
		premiere.setCacao(stocks[0]);
		premiere.setLait(stocks[1]);
		premiere.setSucre(stocks[2]);
		premiere.setLecitine(stocks[3]);		
	}
	public static void main(String[] args) {
		StockMatPremiere premiere= new StockMatPremiere(1000,1000,1000,1000);
		StockProduitsFinis finis = new StockProduitsFinis(5);
		TransfoChocolat transfo =new TransfoChocolat(premiere,finis);
		System.out.println(premiere.getCacao());
		System.out.println(finis.getStockChocolat());
		transfo.produireChoco(1700);
		System.out.println(premiere.getCacao());
		System.out.println(finis.getStockChocolat());
	}
	
	
	
	
	
	
	
	
	

}
