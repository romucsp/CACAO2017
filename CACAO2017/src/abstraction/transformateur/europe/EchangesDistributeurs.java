package abstraction.transformateur.europe;

import abstraction.transformateur.usa.interfacemarche.transformateur;
import abstraction.transformateur.europe.Tresorerie;

public class EchangesDistributeurs implements transformateur {

	private Stock s;
	private Tresorerie compte;
	
	public EchangesDistributeurs(double prixmin, Stock stockchocolat){
		this.s=stockchocolat;
	}
	
	@Override
	public double getprixMin() {
		double a = 1000*Math.random();
		double prixmin = 4000;
		double stockchocolat=this.s.getstockchocolat();
		if (stockchocolat<100){
			return 10000;
		}
		else{
			return prixmin+a;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void notif(double prix, double quantité) {
		// TODO Auto-generated method stub
		this.s.setstockchocolat(this.s.getstockchocolat()-quantité);
		double chiffre_daffaire=prix*quantité;
		this.compte.ajoutChiffredaffaire(chiffre_daffaire);
	}
	

	@Override
	public double QteSouhaite() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void notificationAchat(double quantite, double prix) {
		// TODO Auto-generated method stub
		
	}
	
}
