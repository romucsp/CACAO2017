package abstraction.producteur.cotedivoire;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import abstraction.fourni.Acteur;
import abstraction.fourni.v0.IProducteur;
import abstraction.fourni.v0.ITransformateur;
import abstraction.fourni.v0.Producteur;
import abstraction.fourni.v0.Transformateur;

public class MarcheProd implements Acteur{ // Kevin et Adrien.
	
	private ArrayList<IProducteur> producteurs; //liste des producteurs
	private ArrayList<ITransformateur> transformateurs ; // liste des transformateurs
	public double coursMin = 2500 ; // prix min du cours du cacao par tonne
	public double coursMax = 3500 ; // prix max du cours du cacao par tonne
	
	private double quantiteAchetableGlob ;
	private double quantiteVoulueGlob ;
	private double coursActuel;
	
	public MarcheProd() {
		this.producteurs= new ArrayList<IProducteur>();  // a modifier par IProducteur une fois que les interfaces seront créees.
		this.transformateurs= new ArrayList<ITransformateur>(); // a modifier par ITransformateur une fois que les interfaces seront créees.
		this.quantiteAchetableGlob=0.0;
		this.quantiteVoulueGlob=0.0;
		this.coursActuel=3000;
	}
	
	public void addProducteur (Producteur p) {
		this.producteurs.add(p);
	}
	public void addTransformateur (Transformateur t) {
		this.transformateurs.add(t);
	}
	public double getQuantiteAchetable() {
		return this.quantiteAchetableGlob;
	}
	public double getQuantiteVoulue() {
		return this.quantiteVoulueGlob;
	}
	public double getCoursActuel() {
		return this.coursActuel;
	}
	public void setQuantiteAchetableGlob (double quantite) {
		this.quantiteAchetableGlob=quantite;
	}
	public void setQuantiteVoulueGlob (double quantite) {
		this.quantiteVoulueGlob=quantite;
	}
	public String getNom() {
		return "Marché du cacao";
	}
	public void Bourse () {
		// La bourse va faire évoluer le coursActuel en fonction de l'offre et de la demande bornée entre coursMin et coursMax
		if (this.quantiteAchetableGlob>=this.quantiteVoulueGlob){
				if (this.coursActuel>this.coursMin){
					this.coursActuel=0.99*this.coursActuel;
				}
		}
		else {
			if (this.coursActuel<this.coursMax){
				this.coursActuel=1.01*this.coursActuel;
			}
		}
	}
	public void next() {
		Bourse(); 
		setQuantiteAchetableGlob(0.0);
		setQuantiteVoulueGlob(0.0);
		Map<IProducteur, Integer> Prod = new HashMap<IProducteur,Integer>();
		Map<ITransformateur, Integer> Trans = new HashMap<ITransformateur, Integer>();
		//On creer une table de hashage qui correspond a un tableau IProd/ quantite 
		
		for (int i=0 ; i<this.producteurs.size(); i++) {
			Prod.put(this.producteurs.get(i), (int)this.producteurs.get(i).quantiteMiseEnVente());
		}
		for (int i=0 ; i<this.transformateurs.size(); i++) {
			Trans.put(this.transformateurs.get(i), (int)this.transformateurs.get(i).quantiteSouhaitee());
		}
		// si on réecrit la meme ligne juste en changeant la valeur du integer ca modifie juste sa valeur donc 
		// c'est un moyen de garder en mémoire la valeur pour chaque prod et transformateurs
		int qttEnVente=0;
		for (IProducteur p : Prod.keySet()){
			qttEnVente += Prod.get(p);
		}
		setQuantiteAchetableGlob(qttEnVente);
		int qttSouhaitee=0; 
		for (ITransformateur t : Trans.keySet()){
			qttSouhaitee+= Trans.get(t);
		}
		setQuantiteVoulueGlob(qttSouhaitee);
		if (qttEnVente>=qttSouhaitee) {
			for (ITransformateur t : Trans.keySet()){
				//t.notificationAchat(Trans.get(t),this.getCoursActuel());
			}
			for (IProducteur p : Prod.keySet()){
				//p.notificationVente(Prod.get(p)-this.quantiteVoulueGlob,this.getCoursActuel());
			}
		}
		else {
			// a gérer avec les pourcentages
			for (ITransformateur t : Trans.keySet()){
				//t.notificationAchat(12,this.getCoursActuel());
			}
			for (IProducteur p : Prod.keySet()){
				//p.notificationVente(Prod.get(p),this.getCoursActuel());
			}
		}
		
	}
}
