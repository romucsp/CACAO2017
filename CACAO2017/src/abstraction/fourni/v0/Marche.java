package abstraction.fourni.v0;

import java.util.ArrayList;

import abstraction.fourni.Acteur;

public class Marche implements Acteur {
	public static Marche LE_MARCHE;	
	public static final double COURS = 3000.0;
	
	private double quantiteAchetable;

	private ArrayList<Producteur> producteurs;
	private ArrayList<Transformateur> transformateurs;

	public Marche() {
		this.producteurs = new ArrayList<Producteur>();
		this.transformateurs = new ArrayList<Transformateur>();
		this.quantiteAchetable = 0.0;
	}
	
	public void addProducteur(Producteur p) {
		this.producteurs.add(p);
	}
	public void addTransformateur(Transformateur t) {
		this.transformateurs.add(t);
	}
	public double getCours() {
		return Marche.COURS;
	}
	public double vendre(double quantite) {
		this.quantiteAchetable += quantite;
		return quantite*Marche.COURS;
	}
	public String getNom() {
		return "Marche du cacao";
	}
	public void next() {
		double[] quantitesEnVente = new double[this.producteurs.size()];
		for (int i=0; i<this.producteurs.size(); i++) {
			quantitesEnVente[i] = this.producteurs.get(i).quantiteMiseEnVente();
		}
		double totalQuantitesEnVente =0.0;
		for (double q : quantitesEnVente) {
			totalQuantitesEnVente+=q;
		}
		double[] quantitesDemandees = new double[this.transformateurs.size()];
		for (int i=0; i<this.transformateurs.size(); i++) {
			quantitesDemandees[i] = this.transformateurs.get(i).quantiteSouhaitee();
		}
		double totalQuantitesDemandees =0.0;
		for (double d : quantitesDemandees) {
			totalQuantitesDemandees+=d;
		}
		for (int i=0; i<Math.min(quantitesEnVente.length, quantitesDemandees.length); i++) {
			if (quantitesEnVente[i]>quantitesDemandees[i]) {
				this.transformateurs.get(i).notificationVente(quantitesDemandees[i]);
				this.producteurs.get(i).notificationVente(quantitesDemandees[i]);
			} else {
				this.transformateurs.get(i).notificationVente(quantitesEnVente[i]);
				this.producteurs.get(i).notificationVente(quantitesEnVente[i]);
			}
		}
	}
}	

