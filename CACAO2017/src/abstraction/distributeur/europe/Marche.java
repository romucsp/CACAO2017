package abstraction.distributeur.europe;

import java.util.ArrayList;

import abstraction.fourni.Acteur;

public class Marche {
	
	private ArrayList<IDistributeur> distributeur;
	private ArrayList<ITransformateur> transformateur;
	
	double prixVenteMin=20;
	double prixVenteMax=40;
	
	double prixAchatMin=20;
	double prixAchatMax=40;
	
	double unite=1000;
	
	public Marche(ArrayList<IDistributeur> distributeur, ArrayList<ITransformateur> transformateur){
		this.distributeur=distributeur;
		this.transformateur=transformateur;
	}
	
	public boolean testFourchettePrix(boolean[] test_prix){
		for (int i=0; i<test_prix.length; i++){
			if ((test_prix[i]) == true){
				return true;
			}
		}
		return false;
	}
	
	public int indiceMaximum(){
		int indice_max = 0;
		for (int i=1; i<this.distributeur.size(); i++){
			indice_max = ((this.distributeur.get(i).getPrixMax()>this.distributeur.get(indice_max).getPrixMax()) ? i : indice_max);
		}
		return indice_max;
	}
	
	public int indiceMinimum(){
		int indice_min = 0;
		for (int i=1; i<this.distributeur.size(); i++){
			indice_min = ((this.distributeur.get(i).getPrixMax()<this.distributeur.get(indice_min).getPrixMax()) ? i : indice_min);
		}
		return indice_min;		
	}
	
	public void Echanges(){
		
	
       // Définition des tests vérifiant si la boucle doit s'arrêter ou non 
		
		
		// On vérifie si les prix sont dans la fourchette autorisée
		boolean[] test_t = new boolean[this.transformateur.size()];
		boolean[] test_d = new boolean[this.transformateur.size()];
		for (int i=0; i<this.transformateur.size(); i++){
			test_t[i] = (transformateur.get(i).getPrixMin()>=prixVenteMin) &&	(transformateur.get(i).getPrixMin()<=prixVenteMax);
			test_d[i] = (distributeur.get(i).getPrixMax()>=prixAchatMin) &&  (distributeur.get(i).getPrixMax()<=prixAchatMax);
		}

		
		// On vérifie qu'une transaction soit possible
		
		 boolean testPrix= true;
				
		 for (int i=0; i<this.transformateur.size(); i++){
			 if ( Math.max(distributeur.get(1).getPrixMax(), distributeur.get(2).getPrixMax()) < Math.max(transformateur.get(1).getPrixMin(), transformateur.get(2).getPrixMin())){
				 testPrix = false;
			 }
		 }
		 
			// Initialisation des deux variables définissant l'indice du distributeur et transformateur prioritaires
			
			int prioDistri=0;
			int prioTransfo=0;
			
		 	if ((testFourchettePrix(test_t)||testFourchettePrix(test_d)) && testPrix){
			
			// Recherche de minimum & maximum
			
			prioDistri = this.indiceMaximum();
			prioTransfo = this.indiceMinimum();
			}
			
			// Définition du prix
			
			double prix = (distributeur.get(prioDistri).getPrixMax()+transformateur.get(prioTransfo).getPrixMin())/2;
			
			int autreDistri=Math.abs(prioDistri-1);
			int autreTransfo=Math.abs(prioTransfo-1);
			
			
			// Actualisation des prix d'achat et de vente
			
			distributeur.get(prioDistri).notif(new Vente(prix, unite));
			distributeur.get(autreDistri).notif(new Vente(prix, 0));
			transformateur.get(prioTransfo).notif(new Vente(prix, unite));
			transformateur.get(autreTransfo).notif(new Vente(prix, 0));
			
			
		}
		
}

