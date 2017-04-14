package abstraction.transformateur.usa;
import java.util.ArrayList;

import abstraction.fourni.Acteur;
import abstraction.transformateur.usa.interfacemarche.*;
import abstraction.producteur.cotedivoire.*;
//Souchu
public class TransformateurUsa implements transformateur,Acteur{
	private StockProduitsFinis finis = new StockProduitsFinis(1000000);
	private StockMatPremiere premiere=new StockMatPremiere(1000000,1000000,1000000,1000000);
	private TransfoChocolat Transfo=new TransfoChocolat(premiere,finis);
	private Tresorie tresorie=new Tresorie();
	private int unitéventechocolat=100;
	private double bornesmax=8000;
	private double bornesmin=4000;
	private ArrayList<Integer> prixmatprem = new ArrayList<Integer>();
	
	public TransformateurUsa(){
		prixmatprem.add(350);//Prix matière première à la tonne en euros.
		prixmatprem.add(25);
		prixmatprem.add(400);
	}
	
	public void next(){
		produirechocolat();
		achetermatièrepremière();
	}
	//souchu
	public void achetermatièrepremière(){
		double[] stocks=new double[3];
		stocks[0]=premiere.getLait();
		stocks[1]=premiere.getSucre();
		stocks[2]=premiere.getLecitine();
		for (int i=0;i<3;i++){
			tresorie.setCompteCourant(tresorie.getCompteCourant()-((stocks[i]-1000000)*prixmatprem.get(i)));
		}
		premiere.setLait(1000000);
		premiere.setLecitine(1000000);
		premiere.setSucre(1000000);
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
		double q= 1000000;
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
