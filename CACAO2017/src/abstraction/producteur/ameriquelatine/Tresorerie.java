package abstraction.producteur.ameriquelatine;

import abstraction.fourni.Acteur;
import abstraction.fourni.Indicateur;
import abstraction.fourni.Journal;
import abstraction.fourni.Monde;

public class Tresorerie {
	private double ca; //chiffres d'affaires de la periode
	private double charges; // charges de production
	private double tresorerie; // argent en banque
	private double resultat; // resultat = ca - charges
	private String nom ;
	private double coursActuel; // prix $ par tonne du cacao de la periode
	
	public Tresorerie(Monde monde, String nom, double charges, double tresorerie, double ca){
		this.nom = nom ;
		this.ca= ca;
		this.charges = charges ;
		this.tresorerie = tresorerie ;	
		this.resultat=ca-charges;
	}
	 public double getCa(){
		 return this.ca ;
	 }
	 public double getCharges(){
		 return this.charges ;
	 }
	 public double getTresorerie(){
		 return this.tresorerie ;
	 }
	 public String getNom(){
		 return this.nom ;
	 }
	public void setCa( int ca) {
		this.ca = ca;
	}
	public void setCharges(int charges){
		this.charges = charges ;
	}
	public void setTresorerie(int tresorerie){
		this.tresorerie = tresorerie ;
	}
	public void setNom(String nom){
		this.nom = nom ;
	}
	public void setCoursActuel(double coursActuel){
		this.coursActuel=coursActuel;
	}
	
	public void next(){
//		this.ca = 		
	}
	
}
