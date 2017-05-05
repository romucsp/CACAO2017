/*Classe codée par Julien/Walid 
 */
package abstraction.distributeur.europe;
import abstraction.fourni.v0.*;
import abstraction.fourni.*;
import java.util.ArrayList;
import java.util.List;
public class Distributeur implements Acteur,IDistributeur{
	private Vente derniereVente; // derniere vente effectuee sur le marche
	private double stock;
	private double qteDemandee;
	
	public Distributeur(Vente vente, double stock, double qteDemandee){ // penser à redocoder en enlevant les arguments du constructeur
		this.derniereVente = vente;
		this.stock = stock;
		this.qteDemandee = qteDemandee;
	}
	
	
	public double getStock() {
		return this.stock;
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
		prixTransfo = this.getDerniereVente().getPrix();
		double coeff = qteDemandee/this.stock;
		double prix = coeff*prixTransfo;
		return prix;
	}
	
	public void notif(Vente vente){
		this.setVente(vente);
		this.setStock(this.stock-vente.getQuantite());
	}
	
	public void next(){}
	
	public String getNom(){
		return "";
	}
}
