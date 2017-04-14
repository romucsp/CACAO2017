package abstraction.transformateur.usa;
import abstraction.transformateur.usa.interfacemarche.*;
import abstraction.producteur.cotedivoire.*;
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
	@Override
	public void notif(double prix, double quantité) {
		this.finis.enleverChoco(quantité);
		this.tresorie.setCompteCourant(this.tresorie.getCompteCourant()+quantité*prix);
		
	}
	
	public double QteSouhaite(){
		double q= 10000000;
		return q-this.premiere.getCacao();
		
	}
	
	public void notificationAchat(double vendu, double prix){
		this.tresorie.setCompteCourant(tresorie.getCompteCourant()-prix);
		this.premiere.setCacao(premiere.getCacao()+vendu);
		
	}
	
	
	
	
}
