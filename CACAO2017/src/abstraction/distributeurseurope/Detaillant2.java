package abstraction.distributeurseurope;

import java.util.ArrayList;

import abstraction.fourni.Acteur;
import abstraction.fourni.Indicateur;
import abstraction.fourni.Monde;
import abstraction.fourni.v0.Detaillant;
import abstraction.fourni.v0.IVendeur;
import abstraction.fourni.v0.Transformateur;

// modifié par juju //

public class Detaillant2 extends Detaillant {

	private String nom;
	private double quantite;
	private double prix;
	private Indicateur solde;
	private Indicateur achats;

	private ArrayList<IVendeur> vendeurs;
	
	public Detaillant2(String nom, Monde monde, double quantite, double prix) {
		super(nom,monde,quantite,prix);

	}

	public void ajouterVendeur(Transformateur t) {
		this.vendeurs.add(t);
	}
	
	public double getPrix() {
		return this.prix;
	}
	public String getNom() {
		return this.nom;
	}


	public void next() {
		this.achats.setValeur(this, 0.0);
		for (IVendeur t : this.vendeurs) {
			double q = t.acheter(this, this.quantite);
			this.solde.setValeur(this, this.solde.getValeur()-q*this.getPrix());
			this.achats.setValeur(this, this.achats.getValeur()+q);
		}

	}

}
