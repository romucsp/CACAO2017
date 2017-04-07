package abstraction.transformateur.usa;
import abstraction.interfacemarche.*;
//Souchu
public class TransformateurUsa implements transformateur{
	private StockProduitsFinis finis = new StockProduitsFinis(0);
	private StockMatPremiere premiere;
	private Tresorie tresorie=new Tresorie();
	private int unitéventechocolat=100;
	private double bornesmax=8;
	private double bornesmin=4;
	
	public void next(){
		achatmatpremiere();
		produirechocolat();
	}
	
	public void Onestlivréenmatièrepremière(){
		
	}
	
	public void achatmatpremiere(){
		
	}
	
	public void produirechocolat(){
		
	}
	
	public double getprixMin(){
		if (finis.getStockChocolat()<1*unitéventechocolat){
			return 10000;
		}
		else if (finis.getStockChocolat()<200*unitéventechocolat){
			double prix= bornesmax-((finis.getStockChocolat()-10*unitéventechocolat)/(190*unitéventechocolat)*(bornesmin-bornesmax));
			return prix;
		}
		else{
			return bornesmin;
		}
	}

	public void notif(double prix, int quantité) {
		this.finis.enleverChoco(quantité);
		this.tresorie.setCompteCourant(prix*quantité+this.tresorie.getCompteCourant());
	}
	
}
