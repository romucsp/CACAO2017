package abstraction.producteur.cotedivoire;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import abstraction.fourni.Acteur;
import abstraction.fourni.v0.IProducteur;
import abstraction.fourni.v0.ITransformateur;
import abstraction.fourni.v0.Producteur;
import abstraction.fourni.v0.Transformateur;

	
	private ArrayList<IProducteur> producteurs; //liste desproducteur
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
		setQuantiteAchetableGlob(0.0);
		setQuantiteVoulueGlob(0.0);
		
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
		Map<IProducteur, Integer> m = new HashMap<IProducteur,Integer>();
		//On creer une table de hashage qui correspond a un tableau IProd/ quantite 
		m.put(this.producteurs.get(0), (int)this.producteurs.get(0).quantiteMiseEnVente());
		// si on réecrit la meme ligne juste en changeant la valeur du integer ca modifie juste sa valeur donc 
		// c'est un moyen de garder en mémoire la valeur pour chaque prod 
		m.put(this.producteurs.get(1), (int)this.producteurs.get(0).quantiteMiseEnVente());
		int qttTotale=0;
		for (IProducteur p : m.keySet()){
			qttTotale += m.get(p);
		}
		// Il faut faire de meme avec les transformateurs. 
		
		
	}
}
