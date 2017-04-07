package abstraction.distributeur.groupe2;
import abstraction.fourni.v0.*;
import abstraction.fourni.*;
public abstract class Distributeur implements Acteur,IDistributeur{
	private Vente vente;
	private double stock;
	private double qteDemandee;
	
	public Distributeur(Vente vente, double stock, double qteDemandee){
		this.vente = vente;
		this.stock = stock;
		this.qteDemandee = qteDemandee;
	}
	
	
	public double getStock() {
		return stock;
	}


	public void setStock(double stock) {
		this.stock = stock;
	}


	public double getQteDemandee() {
		return qteDemandee;
	}


	public void setQteDemandee(double qteDemandee) {
		this.qteDemandee = qteDemandee;
	}


	public Vente getVente() {
		return vente;
	}



	public void setVente(Vente vente) {
		this.vente = vente;
	}

	
	public double getPrixMax(){ // strategie lineaire Walid en fonction du prix du transformateur
		double prixTransfo;
		prixTransfo = vente.getPrix()*vente.getQuantite();
		double coeff = qteDemandee/stock;
		double prix = coeff*prixTransfo;
		return prix;
	}
}
