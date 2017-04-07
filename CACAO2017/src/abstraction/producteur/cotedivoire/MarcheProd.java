package abstraction.producteur.cotedivoire;
import java.util.ArrayList;

import abstraction.fourni.v0.Producteur;
import abstraction.fourni.v0.Transformateur;

public class MarcheProd implements IMarcheProd{
	
	private double quantiteAchetableP1;
	private double quantiteAchetableP2;
	private ArrayList<Producteur> producteurs; 
	private ArrayList<Transformateur> transformateurs; 
	private double quantiteVoulueT1;
	private double quantiteVoulueT2;
	
	public MarcheProd() {
		this.producteurs= new ArrayList<Producteur>(); 
		this.transformateurs= new ArrayList<Transformateur>();
		this.quantiteAchetableP1=0.0;
		this.quantiteAchetableP2=0.0;
		this.quantiteVoulueT1=0.0;
		this.quantiteVoulueT2=0.0;
	}
	
	public void addProducteur (Producteur p) {
		this.producteurs.add(p);
	}
	public void addTransformateur (Transformateur t) {
		this.transformateurs.add(t);
	}
	public double quantiteAchetable() {
		return this.quantiteAchetableP1+this.quantiteAchetableP2;
	}
	public double quantiteVoulue() {
		return this.quantiteVoulueT1+this.quantiteVoulueT2;
	}
}
