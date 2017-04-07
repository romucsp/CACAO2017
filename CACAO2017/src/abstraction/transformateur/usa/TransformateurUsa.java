package abstraction.transformateur.usa;
import abstraction.interfacemarche.*;
//Souchu
public class TransformateurUsa implements transformateur{
	private StockProduitsFinis finis = new StockProduitsFinis(0);
	private StockMatPremiere premiere;
	private int unitéventechocolat=100;
	private double bornesmax=8;
	private double bornesmin=4;
	
	public void next(){
		achatmatpremiere();
		produirechocolat();
	}
	
	public void Onlivreduchocolat(){
		
	}
	
	public void Onestlivréenmatièrepremière(){
		
	}
	
	public void recoitcommandedistributeur(){
		
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
	
}
