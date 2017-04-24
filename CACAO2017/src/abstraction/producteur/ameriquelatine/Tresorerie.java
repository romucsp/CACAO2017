package abstraction.producteur.ameriquelatine;
//Modifié par lolotteisyoung 14/04/2017
//Modifié par lolotteisyoung 24/04/2017

//import abstraction.fourni.Acteur;
//import abstraction.fourni.Indicateur;
//import abstraction.fourni.Journal;
//import abstraction.fourni.Monde; 


public class Tresorerie {
//private double ca; //chiffres d'affaires de la période
	public final static int CHARGESPROD=1000000; // ($) charges de production (hors coût de stock)
	private double tresorerie; // argent en banque
	private Stock stock;
	private Producteur producteur ;

//Méthode qui renvoie un chiffre d'affaire;
//Méthode qui calcule les charges totales;
//Méthode qui actualise la trésorerie;
//qté vendue et cours actuel depuis producteur;
	
	public Tresorerie(){
		this.tresorerie = tresorerie ;	
		this.stock=stock;
		this.producteur=producteur;
	}
	

	public double getTresorerie(){
		 return this.tresorerie ;
	 }

	public void setCa( int ca) {
		
	}

	
//Actualisation trésorerie
	private void setTresorerie(int tresorerie){
		this.tresorerie = tresorerie ;
	}

	
}
