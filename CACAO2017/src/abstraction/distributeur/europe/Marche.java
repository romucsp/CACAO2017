package abstraction.distributeur.europe;

import java.util.ArrayList;

import abstraction.fourni.Acteur;

/*public class Marche {
	
	private ArrayList<Distributeur> distributeur;
	private ArrayList<Transformateur> transformateur;
	
	double prixVenteMin=20;
	double prixVenteMax=40;
	
	double prixAchatMin=20;
	double prixAchatMax=40;
	
	double unite=1000;
	
	public Marche(ArrayList<Distributeur> distributeur, ArrayList<Transformateur> transformateur){
		this.distributeur=distributeur;
		this.transformateur=transformateur;
	}
	
	public void Echanges(){
		
	
       // Définition des tests vérifiant si la boucle doit s'arrêter ou non 
		
		
		// On vérifie si les prix sont dans la fourchette autoriséé
		
		boolean test1= (transformateur.get(1).getPrixMin()>=prixVenteMin) &&	(transformateur.get(1).getPrixMin()<=prixVenteMax);	
		boolean test2= (transformateur.get(2).getPrixMin()>=prixVenteMin) &&	(transformateur.get(2).getPrixMin()<=prixVenteMax);
		
		boolean test3= (distributeur.get(1).getPrixMax()>=prixAchatMin) &&  (distributeur.get(1).getPrixMax()<=prixAchatMaxn);
		boolean test4= (distributeur.get(2).getPrixMax()>=prixAchatMin) &&  (distributeur.get(2).getPrixMax()<=prixAchatMax);
		
		// On vérifie qu'une transaction soit possible
		
		 boolean testPrix= Math.max(distributeur.get(1).getPrixMax(), distributeur.get(2).getPrixMax()) >= Math.max(transformateur.get(1).getPrixMin(), transformateur.get(2).getPrixMin());
		 
		 
		
		while ((test1 || test2 || test3 || test4) && testPrix){
			
			
			// Initialisation des deux variables définissant l'indice du distributeur et transformateur prioritaires
			
			int prioDistri=0;
			int prioTransfo=0;
			
			// Recherche de minimum & maximum
			
			for (int i=0;i<2;i++){
				if (distributeur.get(i).getPrixMax()>=distributeur.get(prioDistri).getPrixMax()){
					prioDistri=i;
				}
				if (transformateur.get(i).getPrixMin()<=transformateur.get(i).getPrixMin()){
					prioTransfo=i;
				}
			}
			
			// Définition du prix
			
			double prix = (distributeur.get(prioDistri).getPrixMax()+transformateur.get(i).getPrixMin())/2;
			
			int autreDistri=Math.abs(prioDistri-1);
			int autreTransfo=Math.abs(prioTransfo-1);
			
			
			// Actualisation des prix d'achat et de vente
			
			
	
			
			distributeur.get(prioDistri).next(new Vente(prix, unite));
			distributeur.get(autreDistri).next(new Vente(prix, 0));
			transformateur.get(prioTransfo).next(new Vente(prix, unite));
			transformateur.get(autreTransfo).next(new Vente(prix, 0));
			
			
		}
		
	}
	
}	
*/

