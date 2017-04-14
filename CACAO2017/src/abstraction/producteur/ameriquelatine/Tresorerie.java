package abstraction.producteur.ameriquelatine;
//Modifié par lolotteisyoung

//import abstraction.fourni.Acteur;
//import abstraction.fourni.Indicateur;
//import abstraction.fourni.Journal;
//import abstraction.fourni.Monde; 


public class Tresorerie {
	private double ca; //chiffres d'affaires de la periode
	private double charges; // charges de production
	private double tresorerie; // argent en banque
	private double resultat; // resultat = ca - charges
	private double coursActuel; // prix $ par tonne du cacao de la periode
	private Producteur producteur;
	private double qtevendue;
	
	public Tresorerie(double charges, double tresorerie, double ca, double qtevendue){
		this.ca= ca;
		this.charges = charges ;
		this.tresorerie = tresorerie ;	
		this.resultat=ca-charges;
		this.qtevendue = producteur.getqtevendue();
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

	public void setCa( int ca) {
		//this.ca = this.qtevendue*this.coursActuel;
	}
	public void setCharges(int charges){
		this.charges = charges ;
	}
	public void setTresorerie(int tresorerie){
		this.tresorerie = tresorerie ;
	}

	public void setCoursActuel(double coursActuel){
		this.coursActuel=coursActuel;
	}
	
	public void next(){
//		this.ca = 		
	}
	
}
