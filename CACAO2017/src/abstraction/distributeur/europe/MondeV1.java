package abstraction.distributeur.europe;

import java.util.ArrayList;
import abstraction.fourni.Monde;

public class MondeV1 extends Monde {
	
	/**
	 *Création de l'instance Monde pour la version 1
	 */
	
	private ArrayList<Distributeur> distributeurs;
	private ArrayList<ITransformateur> transformateurs;
	private ArrayList<IProducteur> producteurs;
	
	Distributeur dEuropeen = new Distributeur(new Vente(70000000,1), 13, 13);
	

}
