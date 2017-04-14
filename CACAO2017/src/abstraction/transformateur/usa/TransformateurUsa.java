package abstraction.transformateur.usa;
import abstraction.fourni.Acteur;
import abstraction.transformateur.usa.interfacemarche.*;
import abstraction.producteur.cotedivoire.*;
//Souchu
public class TransformateurUsa implements transformateur,Acteur{
	private StockProduitsFinis finis = new StockProduitsFinis(1000000);
	private StockMatPremiere premiere;
	private TransfoChocolat Transfo=new TransfoChocolat(premiere,finis);
	private Tresorie tresorie=new Tresorie();
	private int unitéventechocolat=100;
	private double bornesmax=8;
	private double bornesmin=4;
	
	public void next(){
		produirechocolat();
		achetermatièrepremière();
	}
	public void achetermatièrepremière(){
		
	}
	
	public void produirechocolat(){
		double StockSouhaite =1000000;
		Transfo.produireChoco(StockSouhaite-finis.getStockChocolat());
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
	@Override
	public String getNom() {
		return "Transfo Usa";
	}
	
	public void notificationAchat(double vendu, double prix){
		this.tresorie.setCompteCourant(tresorie.getCompteCourant()-prix);
		this.premiere.setCacao(premiere.getCacao()+vendu);
		
	}
	
	
	
	
}
