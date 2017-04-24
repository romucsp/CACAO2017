package abstraction.transformateur.europe;

import abstraction.transformateur.usa.interfacemarche.transformateur;

public class EchangesDistributeurs implements transformateur {

	private Stock stockchocolat;
	
	public EchangesDistributeurs(double prixmin, Stock stockchocolat){
		this.stockchocolat=stockchocolat;
	}
	
	@Override
	public double getprixMin() {
		double a = 1000*Math.random();
		double prixmin = 4000;
		double stockchocolat=this.stockchocolat.getstockchocolat();
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
		this.stockchocolat.setstockchocolat(this.stockchocolat.getstockchocolat()-quantité);
		double benef=prix*quantité;
	}
	
	
}
