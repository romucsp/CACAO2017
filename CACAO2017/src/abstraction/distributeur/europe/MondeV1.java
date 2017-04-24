// classe codée par Numa
package abstraction.distributeur.europe;

import java.util.ArrayList;
import abstraction.fourni.Monde;
import abstraction.transformateur.usa.TransformateurUsa;

public class MondeV1 extends Monde {
	
	/**
	 *Création de l'instance Monde pour la version 1
	 */
	
	private ArrayList<IDistributeur> distributeurs;
	private ArrayList<ITransformateur> transformateurs;
	private ArrayList<IProducteur> producteurs;
	
	public void peupler(){
		
		Distributeur dEuropeen = new Distributeur(new Vente(70000000,1), 13, 13);
		
		distributeurs.add(dEuropeen);
		
		TransformateurUsa tUsa = new TransformateurUsa();
		
		transformateurs.add((ITransformateur) tUsa);
		
		Marche marche2 = new Marche(this.distributeurs, this.transformateurs);	/**Création du marché entre distributeur
																				  *et transformateur*/
		
		
	}
	
	

}
