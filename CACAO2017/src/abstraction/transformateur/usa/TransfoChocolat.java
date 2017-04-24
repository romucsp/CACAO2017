package abstraction.transformateur.usa;
public class TransfoChocolat {
	
	private StockMatPremiere premiere;
	private StockProduitsFinis finis;
	private double[] recette =new double[4];
	private double[] demande=new double[4];
	private double[] stocks=new double[4];
	private int SUCRE =2;
	private int CACAO =0;
	private int LECITINE =3;
	private int LAIT =1;

	/*souchu*/
	public TransfoChocolat( StockMatPremiere premiere,StockProduitsFinis finis){
		this.finis=finis;
		this.premiere=premiere;
		recette[CACAO]=0.6;
		recette[LAIT]=0.15;
		recette[SUCRE]=0.2;
		recette[LECITINE]=0.05;
		
	}
	
	private void lireStock(){
		stocks[CACAO]=premiere.getCacao();
		stocks[LAIT]=premiere.getLait();
		stocks[SUCRE]=premiere.getSucre();
		stocks[LECITINE]=premiere.getLecitine();
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
	
	public static void test(){
		StockMatPremiere premiere= new StockMatPremiere(1000,1000,1000,1000);
		StockProduitsFinis finis = new StockProduitsFinis(0);
		TransfoChocolat transfo =new TransfoChocolat(premiere,finis);
		System.out.println(premiere.getCacao());
		System.out.println(finis.getStockChocolat());
		transfo.produireChoco(1700); //Changer les valeurs de chocolat produit pour tester le bon fonctionnement du script
		System.out.println(premiere.getCacao());
		System.out.println(finis.getStockChocolat());
	}
	public static void main(String[] args) {
		//test();
	}
	
	
	
	
	
	
	
	
	

}
