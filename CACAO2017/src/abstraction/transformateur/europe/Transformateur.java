package abstraction.transformateur.europe;
import abstraction.transformateur.usa.interfacemarche.transformateur;;

public class Transformateur implements transformateur  {

	private String nom;
	private Stock s;
	private Tresorerie compte;
	private double prixmin=4000;
	
	public Transformateur (Stock s){
		this.s=s;
	}
	
	
	public double getprixMin() {
		double a = 1000*Math.random();
		double stockchocolat=this.s.getstockchocolat();
		if (stockchocolat<100){
			return 10000;
		}
		else{
			this.prixmin+=a;
			return this.prixmin;
		}
		// TODO Auto-generated method stub
	}
	
	public void notif(double prix, double quantité) {
		// TODO Auto-generated method stub
		this.s.setstockchocolat(this.s.getstockchocolat()-quantité);
		double chiffre_daffaire=prix*quantité;
		this.compte.ajoutChiffredaffaire(chiffre_daffaire);
	}
	
	public int hashCode() {
		return this.getNom().hashCode();
	}
	
	public String getNom() {
		return "Transformateur "+this.nom;
	}
	

	public Stock getStock(){
		return this.s;
	}
	
	public double QteSouhaite(){
		double stockCacao=this.s.getstockcacao();
		double stockMax=this.s.getStockMax();
		return stockMax-stockCacao; //test
		
	}
	
	public void notificationAchat(double prix, double quantite){
		this.s.setstockcacao(this.s.getstockcacao()+quantite);
		double achat = prix*quantite;
		this.compte.retraitAchat(achat);
	}
		
	
}
