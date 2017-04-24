/*Classe codée par Julien/Walid 
 */
package abstraction.distributeur.europe;
import abstraction.fourni.v0.*;
import abstraction.fourni.*;
import java.util.ArrayList;
import java.util.List;
public class Distributeur implements Acteur,IDistributeur{
	private Vente derniereVente; // derniere vente effectuee sur le marche
	private Stock stock;
	private double qteDemandee;
	
	public Distributeur(Vente vente, Stock stock, double qteDemandee){
		this.derniereVente = vente;
		this.stock = stock;
		this.qteDemandee = qteDemandee;
	}
	
	
	public Stock getStock() {
		return this.stock;
	}


	public void setStock(Stock stock) {
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
		int nb_choco = this.getStock().nbChoco();
		prixTransfo = this.getDerniereVente().getPrix()*this.getDerniereVente().getQuantite();
		double coeff = qteDemandee/nb_choco;
		double prix = coeff*prixTransfo;
		return prix;
	}
	
	public void notif(Vente vente){
		this.setVente(vente);
		List nouveauStock = new ArrayList<QuantiteChoco>();
		for (int i=0; i<this.getStock().getStock().size(); i++){
			
		}
		this.setStock(this.getStock().nbChoco()-vente.getQuantite());
	}
	
	public void next(){}
	
	public String getNom(){
		return "";
	}
}
