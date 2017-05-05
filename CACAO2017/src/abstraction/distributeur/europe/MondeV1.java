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
		IProducteur p1 = new IProducteur();
	}
	
	

}
