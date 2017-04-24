/*Classe codée par Julien/Walid 
 */
package abstraction.distributeur.europe;
import abstraction.fourni.v0.*;
import abstraction.fourni.*;
public class Distributeur implements Acteur,IDistributeur{
	private Vente derniereVente; // derniere vente effectuee sur le marche
	private double stock;
	private double qteDemandee;
	
	public Distributeur(Vente vente, double stock, double qteDemandee){
		this.derniereVente = vente;
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


	public Vente getDerniereVente() {
		return derniereVente;
	}


	public void setVente(Vente vente) {
		this.derniereVente = vente;
	}

	
	public double getPrixMax(){
		double prixTransfo;
		prixTransfo = derniereVente.getPrix()*derniereVente.getQuantite();
		double coeff = qteDemandee/stock;
		double prix = coeff*prixTransfo;
		return prix;
	}
	
	public void notif(Vente vente){
		this.setVente(vente);
		this.setStock(this.getStock()-vente.getQuantite());
	}
	
	public void next(){}
	
	public String getNom(){
		return "";
	}
}
